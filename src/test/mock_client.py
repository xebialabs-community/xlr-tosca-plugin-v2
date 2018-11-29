#
# Copyright 2018 XEBIALABS
#
# Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
#

# Pass output:
#
# <?xml version="1.0" encoding="UTF-8"?>
# <testsuites>
#    <testsuite failures="0" id="javax.xml.bind.JAXBElement@4479c5a9" log="" name="elist1" tests="1" time="13" timestamp="2018-11-27T09:53:19.8726948-06:00">
#       <testcase log="+ Passed Sample + Passed TBox Set Buffer + Passed buffer1 {LogInfo='Buffer with name: &quot;buffer1&quot; has been set to value: &quot;xlr&quot;',UsedValue='xlr'} " name="Sample" time="0" timestamp="2018-11-27T09:53:27.4700119-06:00" />
#    </testsuite>
# </testsuites>

# Fail output:
#
# <?xml version="1.0" encoding="UTF-8"?>
# <testsuites>
#    <testsuite failures="5" id="javax.xml.bind.JAXBElement@649aa435" log="" name="JSON Example" tests="12" time="65" timestamp="2018-11-28T10:21:36.8079101-06:00">
#       <testcase log="  Error Boolean {LogInfo='Execution will be continued with the next TestCase, because there was an error in the current TestCase.'} + Passed  Create JSON Resource  + Passed  Fill JSON Resource with boolean values + Passed   RootObject    Error  Save JSON Resource as file {LogInfo='The part '&lt;please insert path to examples directory&gt;\boolean.json' of the given path contains an invalid character '&lt;' at position '0'.'}  " name="Boolean" time="1" timestamp="2018-11-28T10:21:46.1299128-06:00">
#          <failure message="Test failure">Error Boolean {LogInfo='Execution will be continued with the next TestCase, because there was an error in the current TestCase.'}
# + Passed  Create JSON Resource

# + Passed  Fill JSON Resource with boolean values
# + Passed   RootObject

#   Error  Save JSON Resource as file {LogInfo='The part '&lt;please insert path to examples directory&gt;\boolean.json' of the given path contains an invalid character '&lt;' at position '0'.'}</failure>
#       </testcase>
#       <testcase log="+ Passed Number + Passed  Create JSON Resource  + Passed  Fill JSON Resource with numbers + Passed   RootObject  + Passed  Verify the numbers + Passed   RootObject  " name="Number" time="0" timestamp="2018-11-28T10:21:52.4259095-06:00" />
#       <testcase log="+ Passed String + Passed  Create JSON Resource  + Passed  Fill JSON resource with a string + Passed   RootObject  + Passed  Verify the string + Passed   RootObject  " name="String" time="0" timestamp="2018-11-28T10:21:56.3129118-06:00" />
#       <testcase log="  Error Multiple values {LogInfo='Execution will be continued with the next TestCase, because there was an error in the current TestCase.'} + Passed  Create JSON Resource  + Passed  Fill JSON Resource with multiple values + Passed   RootObject    Error  Save JSON Resource as a file {LogInfo='The part '&lt;please insert path to examples directory&gt;\multiple.json' of the given path contains an invalid character '&lt;' at position '0'.'}  " name="Multiple values" time="0" timestamp="2018-11-28T10:22:00.6309119-06:00">
#          <failure message="Test failure">Error Multiple values {LogInfo='Execution will be continued with the next TestCase, because there was an error in the current TestCase.'}
# + Passed  Create JSON Resource

# + Passed  Fill JSON Resource with multiple values
# + Passed   RootObject

#   Error  Save JSON Resource as a file {LogInfo='The part '&lt;please insert path to examples directory&gt;\multiple.json' of the given path contains an invalid character '&lt;' at position '0'.'}</failure>
#       </testcase>
#       <testcase log="  Error Full array {LogInfo='Execution will be continued with the next TestCase, because there was an error in the current TestCase.'} + Passed  Create JSON Resource  + Passed  Fill JSON array + Passed   RootObject    Error  Save JSON Resource as a file {LogInfo='The part '&lt;please insert path to examples directory&gt;\array.json' of the given path contains an invalid character '&lt;' at position '0'.'}  " name="Full array" time="0" timestamp="2018-11-28T10:22:04.6609124-06:00">
#          <failure message="Test failure">Error Full array {LogInfo='Execution will be continued with the next TestCase, because there was an error in the current TestCase.'}
# + Passed  Create JSON Resource

# + Passed  Fill JSON array
# + Passed   RootObject

#   Error  Save JSON Resource as a file {LogInfo='The part '&lt;please insert path to examples directory&gt;\array.json' of the given path contains an invalid character '&lt;' at position '0'.'}</failure>
#       </testcase>
#       <testcase log="  Error Empty array {LogInfo='Execution will be continued with the next TestCase, because there was an error in the current TestCase.'} + Passed  Create JSON Resource  + Passed  Fill JSON array + Passed   RootObject    Error  Save JSON Resource {LogInfo='The part '&lt;please insert path to examples directory&gt;\check.json' of the given path contains an invalid character '&lt;' at position '0'.'}  " name="Empty array" time="0" timestamp="2018-11-28T10:22:08.9179135-06:00">
#          <failure message="Test failure">Error Empty array {LogInfo='Execution will be continued with the next TestCase, because there was an error in the current TestCase.'}
# + Passed  Create JSON Resource

# + Passed  Fill JSON array
# + Passed   RootObject

#   Error  Save JSON Resource {LogInfo='The part '&lt;please insert path to examples directory&gt;\check.json' of the given path contains an invalid character '&lt;' at position '0'.'}</failure>
#       </testcase>
#       <testcase log="+ Passed Nested objects inside an array + Passed  Create JSON Resource  + Passed  Fill JSON array + Passed   RootObject  + Passed  Verify JSON array + Passed   RootObject  " name="Nested objects inside an array" time="0" timestamp="2018-11-28T10:22:13.224913-06:00" />
#       <testcase log="+ Passed Primitive values inside an array root + Passed  Create JSON Resource  + Passed  Fill JSON array with primitive values + Passed   RootArray  + Passed  Verify values + Passed   RootArray  " name="Primitive values inside an array root" time="0" timestamp="2018-11-28T10:22:17.7769146-06:00" />
#       <testcase log="  Error Object {LogInfo='Execution will be continued with the next TestCase, because there was an error in the current TestCase.'} + Passed  Create JSON Resource  + Passed  Fill JSON Resource + Passed   RootObject  + Passed  Verify JSON Resource + Passed   RootObject    Error  Save JSON Resource as a file {LogInfo='The part '&lt;please insert path to examples directory&gt;\\example.json' of the given path contains an invalid character '&lt;' at position '0'.'}  " name="Object" time="1" timestamp="2018-11-28T10:22:22.2959099-06:00">
#          <failure message="Test failure">Error Object {LogInfo='Execution will be continued with the next TestCase, because there was an error in the current TestCase.'}
# + Passed  Create JSON Resource

# + Passed  Fill JSON Resource
# + Passed   RootObject

# + Passed  Verify JSON Resource
# + Passed   RootObject

#   Error  Save JSON Resource as a file {LogInfo='The part '&lt;please insert path to examples directory&gt;\\example.json' of the given path contains an invalid character '&lt;' at position '0'.'}</failure>
#       </testcase>
#       <testcase log="+ Passed Verify existence using Select only + Passed  Create JSON Resource  + Passed  Fill JSON Resource + Passed   RootObject  + Passed  Verify existence using ActionMode Select + Passed   RootObject  " name="Verify existence using Select only" time="0" timestamp="2018-11-28T10:22:27.0599075-06:00" />
#       <testcase log="+ Passed Verify existence using Exists + Passed  Create JSON Resource  + Passed  Fill JSON Resource + Passed   RootObject  + Passed  Verify Existence using ActionProperty Exists + Passed   RootObject  " name="Verify existence using Exists" time="0" timestamp="2018-11-28T10:22:31.4399132-06:00" />
#       <testcase log="+ Passed Verify non-existence + Passed  Create JSON Resource  + Passed  Fill JSON Resource + Passed   RootObject  + Passed  Verify Existence using ActionProperty Exists + Passed   RootObject  " name="Verify non-existence" time="0" timestamp="2018-11-28T10:22:35.5729121-06:00" />
#    </testsuite>
# </testsuites>

class ToscaClient:
    @staticmethod
    def new_instance(container):
        return ToscaClient(container["url"], container["username"], container["password"])

    def __init__(self, url, username, password):
        self.url = url
        self.username = username
        self.password = password

    def execute(self, polling_interval, client_timeout, consider_execution_result, test_configuration):
        # simple case of one test suite, one test case
        if test_configuration == 'pass':
            return """
                <testsuites>
                <testsuite failures="0" id="javax.xml.bind.JAXBElement@4479c5a9" log="" name="elist1" tests="1" time="13" timestamp="2018-11-27T09:53:19.8726948-06:00">
                    <testcase log="+ Passed Sample + Passed TBox Set Buffer + Passed buffer1 {LogInfo='Buffer with name: &quot;buffer1&quot; has been set to value: &quot;xlr&quot;',UsedValue='xlr'} " name="Sample" time="0" timestamp="2018-11-27T09:53:27.4700119-06:00" />
                </testsuite>
                </testsuites>"""

        # test multiple test suites
        elif test_configuration == 'pass-2':
            return """
                <testsuites>
                <testsuite failures="0" id="javax.xml.bind.JAXBElement@4479c5a9" log="" name="elist1" tests="1" time="13" timestamp="2018-11-27T09:53:19.8726948-06:00">
                    <testcase log="+ Passed Sample + Passed TBox Set Buffer + Passed buffer1 {LogInfo='Buffer with name: &quot;buffer1&quot; has been set to value: &quot;xlr&quot;',UsedValue='xlr'} " name="Sample" time="0" timestamp="2018-11-27T09:53:27.4700119-06:00" />
                </testsuite>
                <testsuite failures="0" id="javax.xml.bind.JAXBElement@4479c5a9" log="" name="elist1" tests="1" time="13" timestamp="2018-11-27T09:53:19.8726948-06:00">
                    <testcase log="+ Passed Sample + Passed TBox Set Buffer + Passed buffer1 {LogInfo='Buffer with name: &quot;buffer1&quot; has been set to value: &quot;xlr&quot;',UsedValue='xlr'} " name="Sample" time="0" timestamp="2018-11-27T09:53:27.4700119-06:00" />
                </testsuite>
                </testsuites>"""

        # test failed tests
        elif test_configuration == 'fail':
            return """
                <testsuites>
                <testsuite failures="5" id="javax.xml.bind.JAXBElement@649aa435" log="" name="JSON Example" tests="12" time="65" timestamp="2018-11-28T10:21:36.8079101-06:00">
                    <testcase log="  Error Boolean " name="Boolean" time="1" timestamp="2018-11-28T10:21:46.1299128-06:00">
                        <failure message="Test failure">Error Boolean </failure>
                    </testcase>
                    <testcase log="+ Passed Number + Passed  Create JSON Resource  + Passed  Fill JSON Resource with numbers + Passed   RootObject  + Passed  Verify the numbers + Passed   RootObject  " name="Number" time="0" timestamp="2018-11-28T10:21:52.4259095-06:00" />
                    <testcase log="+ Passed String + Passed  Create JSON Resource  + Passed  Fill JSON resource with a string + Passed   RootObject  + Passed  Verify the string + Passed   RootObject  " name="String" time="0" timestamp="2018-11-28T10:21:56.3129118-06:00" />
                    <testcase log="  Error Multiple values   " name="Multiple values" time="0" timestamp="2018-11-28T10:22:00.6309119-06:00">
                        <failure message="Test failure">Error Multiple values </failure>
                    </testcase>
                    <testcase log="  Error Full array  " name="Full array" time="0" timestamp="2018-11-28T10:22:04.6609124-06:00">
                        <failure message="Test failure">Error Full array </failure>
                    </testcase>
                    <testcase log="  Error Empty array   " name="Empty array" time="0" timestamp="2018-11-28T10:22:08.9179135-06:00">
                        <failure message="Test failure">Error Empty array </failure>
                    </testcase>
                    <testcase log="+ Passed Nested objects inside an array + Passed  Create JSON Resource  + Passed  Fill JSON array + Passed   RootObject  + Passed  Verify JSON array + Passed   RootObject  " name="Nested objects inside an array" time="0" timestamp="2018-11-28T10:22:13.224913-06:00" />
                    <testcase log="+ Passed Primitive values inside an array root + Passed  Create JSON Resource  + Passed  Fill JSON array with primitive values + Passed   RootArray  + Passed  Verify values + Passed   RootArray  " name="Primitive values inside an array root" time="0" timestamp="2018-11-28T10:22:17.7769146-06:00" />
                    <testcase log="  Error Object   " name="Object" time="1" timestamp="2018-11-28T10:22:22.2959099-06:00">
                        <failure message="Test failure">Error Object </failure>
                    </testcase>
                    <testcase log="+ Passed Verify existence using Select only + Passed  Create JSON Resource  + Passed  Fill JSON Resource + Passed   RootObject  + Passed  Verify existence using ActionMode Select + Passed   RootObject  " name="Verify existence using Select only" time="0" timestamp="2018-11-28T10:22:27.0599075-06:00" />
                    <testcase log="+ Passed Verify existence using Exists + Passed  Create JSON Resource  + Passed  Fill JSON Resource + Passed   RootObject  + Passed  Verify Existence using ActionProperty Exists + Passed   RootObject  " name="Verify existence using Exists" time="0" timestamp="2018-11-28T10:22:31.4399132-06:00" />
                    <testcase log="+ Passed Verify non-existence + Passed  Create JSON Resource  + Passed  Fill JSON Resource + Passed   RootObject  + Passed  Verify Existence using ActionProperty Exists + Passed   RootObject  " name="Verify non-existence" time="0" timestamp="2018-11-28T10:22:35.5729121-06:00" />
                </testsuite>
                </testsuites>"""
