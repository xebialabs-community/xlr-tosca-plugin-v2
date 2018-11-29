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

from com.tricentis.continuousintegration.toscacijavaclient import DexDispatcher
from com.tricentis.continuousintegration.toscacijavaclient import Options

class ToscaClient(object):

    @staticmethod
    def new_instance(container):
        return ToscaClient(container["url"], container["username"], container["password"])

    def __init__(self, url, username, password):
        self.url = url
        self.username = username
        self.password = password

        self.workdir = self._create_working_directory()
        self.config_filename = '%s/testConfiguration.xml' % self.workdir
        self.result_filename = '%s/result.xml' % self.workdir


    def execute(self, polling_interval, client_timeout, consider_execution_result, test_configuration):
        if not test_configuration:
            raise Exception('Test Configuration cannot be empty.')

        # write config file
        with open(self.config_filename, "w") as text_file:
            text_file.write(test_configuration)

        args = self._create_options('Junit', self.username, self.password, self.url, consider_execution_result)

        options = Options(args)
        dispatcher = DexDispatcher.createDispatcher(options)
        print "connecting to tosca server..."
        dispatcher.Connect()
        print "executing tests..."
        dispatcher.Execute()

        # read result file and return
        with open(self.result_filename, 'r') as myfile:
            results = myfile.read()

        return results


    def _create_options(self, result_type, username, password, url, consider_execution_result):
        args = []

        args.append('-m')
        args.append('distributed')

        if self.result_filename:
            args.append('-r')
            args.append(str(self.result_filename))

        if result_type:
            args.append('-t')
            args.append(str(result_type))

        if self.config_filename:
            args.append('-c')
            args.append(str(self.config_filename))

        if username:
            args.append('-l')
            args.append(str(username))

        if password:
            args.append('-p')
            args.append(str(password))

        if url:
            args.append('-e')
            args.append(str(url))

        if consider_execution_result:
            args.append('-x')
            args.append(str(consider_execution_result))

        return args

    def _create_working_directory(self):
        ts = time.time()
        st = datetime.datetime.fromtimestamp(ts).strftime('%Y%m%dT%H%M%S.%f')

        workdir = 'work/tosca-%s' % st

        os.makedirs(workdir)

        return workdir
