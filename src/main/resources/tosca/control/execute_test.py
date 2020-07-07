#
# Copyright 2020 XEBIALABS
#
# Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
#

import xml.etree.ElementTree as ET

from tosca.core.client import ToscaClient

def process(task_vars):

    client = ToscaClient.new_instance(task_vars['server'])

    polling_interval = int(task_vars['polling_interval']) * 1000
    client_timeout = int(task_vars['client_timeout']) * 1000

    # call client to execute tests
#    results = client.execute(polling_interval, client_timeout, task_vars['consider_execution_result'], task_vars['test_configuration'])
    results = client.execute(polling_interval, client_timeout, False, task_vars['test_configuration'])

    # process results
    failed_tests = []
    test_count = 0
    failed_count = 0

    root = ET.fromstring(results)
    for testsuite in list(root):
        failed_count = failed_count + int(testsuite.attrib['failures'])
        for testcase in list(testsuite):
            test_count = test_count + 1
            logmsg = testcase.attrib['log'].lower();
            if 'error' in logmsg or 'fail' in logmsg:
                failed_tests.append('%s.%s' % (testsuite.attrib['name'], testcase.attrib['name']))

    print 'Number of tests: %s' % str(test_count)
    print 'Test failures:   %s' % str(failed_count)

    if failed_count > 0:
        status = 'fail'
    else:
        status = 'pass'

    return results, status, failed_tests

if __name__ == '__main__' or __name__ == '__builtin__':
    test_output, test_results, test_failures = process(locals())
