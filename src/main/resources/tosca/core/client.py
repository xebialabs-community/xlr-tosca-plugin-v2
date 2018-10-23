#
# Copyright 2018 XEBIALABS
#
# Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
#

import os
import time
import datetime

from com.tricentis.continuousintegration.toscacijavaclient import AbstractDispatcher
from com.tricentis.continuousintegration.toscacijavaclient import Options

class ToscaClient(object):

    @staticmethod
    def new_instance(container):
        print "in new_instance, url = ", container["url"]
        return ToscaClient(container["url"], container["username"], container["password"])

    def __init__(self, url, username, password):
        self.url = url
        self.username = username
        self.password = password

        self.workdir = self._create_working_directory()
        self.config_filename = '%s/testConfiguration.xml' % self.workdir
        self.result_filename = '%s/result.xml' % self.workdir

        # create dispatcher like this code from main.java
        # unfortunately I don't think we can save dispatcher and reuse for 'execute'.  Some options, e.g. result_type, 
        # are not (and shouldn't be) known here.
        args = self._create_options('Junit', self.username, self.password, self.url, False)

        print "The args are - ", args
        print "Args type is ", type(args)

        options = Options(args)
        print "The options have been created and are ", options
        dispatcher = AbstractDispatcher.createDispatcher(options)
        dispatcher.connect()


    def execute(self, result_type, polling_interval, client_timeout, consider_execution_result, test_configuration):
        # write config file
        with open(self.config_filename, "w") as text_file:
            text_file.write(test_configuration)

        args = self._create_options(result_type, self.username, self.password, self.url, consider_execution_result)

        options = Options(args)
        dispatcher = AbstractDispatcher.createDispatcher(options)
        dispatcher.connect()
        dispatcher.execute()

        # read result file and return
        with open(self.result_filename, 'r') as myfile:
            results = myfile.read()

        return results

    def _create_options(self, result_type, username, password, url, consider_execution_result):
        args = []

        args.append('-r')
        args.append(str(self.result_filename))
        args.append('-m')
        args.append('distributed')
        args.append('-t')
        args.append(str(result_type))
        args.append('-c')
        args.append(str(self.config_filename))
        args.append('-l')
        args.append(str(username))
        args.append('-p')
        args.append(str(password))
        args.append('-e')
        args.append(str(url))
        args.append('-x')
        args.append(str(consider_execution_result))

        return args

    def _create_working_directory(self):
        ts = time.time()
        st = datetime.datetime.fromtimestamp(ts).strftime('%Y%m%dT%H%M%S.%f')

        workdir = 'work/tosca-%s' % st

        os.makedirs(workdir)

        return workdir
