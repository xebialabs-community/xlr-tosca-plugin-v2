#
# Copyright 2018 XEBIALABS
#
# Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
#

import yaml
import json
import itertools
import base64
import httplib
import ssl

import com.tricentis.continuousintegration.toscacijavaclient.AbstractDispatcher
import com.tricentis.continuousintegration.toscacijavaclient.Options

class ToscaClient(object):

    @staticmethod
    def new_instance(container):
        return ToscaClient(container.url, container.username, container.password)

    def __init__(self, url, username, password):
        self.url = url
        self.username = username
        self.password = password

        # create dispatcher like this code from main.java
        # unfortunately I don't think we can save dispatcher and reuse for 'execute'.  Some options, e.g. result_type, 
        # are not (and shouldn't be) known here.
        args = self._create_options('todo: path-to-result', 'Default', self.username, self.password, self.url, False)

        options = Options(args);
        dispatcher = AbstractDispatcher.createDispatcher(options);
        dispatcher.Connect();
        dispatcher.ShowDetails();


    def execute(self, result_type, polling_interval, client_timeout, consider_execution_result):
        # TODO: I don't know how the other parameters are used
        # TODO: I don't know where the 'workspace' and 'test event id' are applied (see existing plugin https://github.com/xebialabs-community/xlr-tosca-plugin/blob/master/src/main/resources/tosca/executeTestEvent.py)
        args = self._create_options('todo: path-to-result', 'Default', self.username, self.password, self.url, consider_execution_result)

        options = Options(args);
        dispatcher = AbstractDispatcher.createDispatcher(options);
        dispatcher.Connect();
        dispatcher.ShowDetails();
        dispatcher.Execute();


    def _create_options(self, path_to_result, result_type, username, password, url, consider_execution_result):
        args = []

        args.append('-r')
        args.append(path_to_result)
        args.append('-m')
        args.append('distributed')
        args.append('-t')
        args.append(result_type)
        # case 'c':                     not used
        # setConfigPath(value);
        args.append('-l')
        args.append(username)
        args.append('-p')
        args.append(password)
        args.append('-e')
        args.append(url)
        args.append('-x')
        args.append(consider_execution_result)

        return args
