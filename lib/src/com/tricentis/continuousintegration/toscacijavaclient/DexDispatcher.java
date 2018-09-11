/*     */ package com.tricentis.continuousintegration.toscacijavaclient;
/*     */ 
/*     */ import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
/*     */ import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring;
/*     */ import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
/*     */ import com.tricentis.continuousintegration.toscacijavaclient.Exceptions.ClientException;
/*     */ import com.tricentis.continuousintegration.toscacijavaclient.Exceptions.TimeoutException;
/*     */ import com.tricentis.continuousintegration.toscacixecution.testconfiguration.CustomProperty;
/*     */ import com.tricentis.continuousintegration.toscacixecution.testconfiguration.TestConfigurationRootNode;
/*     */ import com.tricentis.continuousintegration.toscacixecution.testresult.junit.JUnitRootNode;
/*     */ import com.tricentis.continuousintegration.toscacixecution.testresult.junit.JUnitTestCaseFailure;
/*     */ import com.tricentis.continuousintegration.toscacixecution.testresult.junit.JUnitTestCaseNode;
/*     */ import com.tricentis.continuousintegration.toscacixecution.testresult.junit.JUnitTestSuiteNode;
/*     */ import com.tricentis.continuousintegration.toscacixecution.testresult.junit.JUnitTestSuitesNode;
/*     */ import com.tricentis.continuousintegration.toscacixecution.utils.Constants;
/*     */ import com.tricentis.continuousintegration.toscacixecution.utils.Util;
/*     */ import java.io.PrintStream;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.util.Collection;
/*     */ import java.util.Date;
/*     */ import java.util.GregorianCalendar;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.JAXBException;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver.TestResult;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.DistributeCiTestEventsRequest;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.MonitorDistributionEntry;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.MonitorDistributionList;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.ObjectFactory;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.PollCiTestEventsResultsResponse;
/*     */ import org.tempuri.IManagerService;
/*     */ import org.tempuri.ManagerService;
/*     */ import org.w3c.dom.Document;
/*     */ 
/*     */ public class DexDispatcher extends AbstractDispatcher
/*     */ {
/*     */   private UUID CiClientId;
/*     */   private IManagerService managerService;
/*     */   private List<String> TestEvents;
/*     */   private Document configurationXmlDocument;
/*     */   private static final String MANAGERSERVICE_SERVICE_NAME = "ManagerService.svc";
/*  46 */   private static final javax.xml.namespace.QName MANAGERSERVICE_QNAME = new javax.xml.namespace.QName("http://tempuri.org/", "ManagerService");
/*     */   
/*     */   public DexDispatcher(Options options, List<String> testEvents) {
/*  49 */     super(options);
/*  50 */     System.out.println("Constructor invoked");
/*  51 */     this.CiClientId = UUID.randomUUID();
/*  52 */     this.TestEvents = testEvents;
/*     */   }
/*     */   
/*     */   public DexDispatcher(Options options, List<String> testEvents, Document doc) {
/*  56 */     this(options, testEvents);
/*  57 */     this.configurationXmlDocument = doc;
/*     */   }
/*     */   
/*     */   public void Connect() throws ClientException
/*     */   {
/*     */     try {
/*  63 */       System.out.println("Connect invoked");
/*     */       
/*  65 */       if (Util.IsNullOrEmpty(ClientProperties.getAddress())) {
/*  66 */         this.managerService = new ManagerService().getBasicHttpBindingIManagerService();
/*  67 */         RegisterAtServer();
/*  68 */         return;
/*     */       }
/*     */       
/*  71 */       System.out.println("endpoint adress was passed as argument:" + ClientProperties.getAddress());
/*  72 */       this.managerService = new ManagerService(GetWSDLUrl(), MANAGERSERVICE_QNAME).getBasicHttpBindingIManagerService();
/*  73 */       RegisterAtServer();
/*     */     }
/*     */     catch (MalformedURLException|javax.xml.ws.WebServiceException e) {
/*  76 */       throw new ClientException("Error while connecting to Manager service!", e);
/*     */     }
/*     */   }
/*     */   
/*     */   private void RegisterAtServer() throws ClientException
/*     */   {
/*  82 */     org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.RegistrationResponse registerResponse = this.managerService.register(this.CiClientId.toString(), GetCurrentLdapUser());
/*     */     
/*  84 */     String logMessage = (String)registerResponse.getLogMessage().getValue();
/*     */     
/*  86 */     if (!registerResponse.isAuthorizationSuccessful().booleanValue()) {
/*  87 */       throw new ClientException(logMessage);
/*     */     }
/*     */     
/*  90 */     System.out.println(logMessage);
/*     */   }
/*     */   
/*     */   private String GetCurrentLdapUser() {
/*     */     try {
/*  95 */       return com.tricentis.continuousintegration.toscacixecution.utils.LdapAuthorizationHelper.GetLdapProcessUserBasic();
/*     */     } catch (Exception ex) {
/*  97 */       System.err.println(ex);
/*     */     }
/*  99 */     return null;
/*     */   }
/*     */   
/*     */   private URL GetWSDLUrl() throws MalformedURLException {
/* 103 */     String managerServiceBaseAddress = ClientProperties.getAddress().toLowerCase().replace("ManagerService.svc".toLowerCase(), "");
/* 104 */     if (managerServiceBaseAddress.endsWith("//")) {
/* 105 */       managerServiceBaseAddress = managerServiceBaseAddress.substring(0, managerServiceBaseAddress.length() - 1);
/*     */     }
/*     */     
/* 108 */     URL managerServiceWsdlUrl = new URL(new URL(managerServiceBaseAddress), "ManagerService.svc?wsdl");
/* 109 */     return managerServiceWsdlUrl;
/*     */   }
/*     */   
/*     */   public void Execute() throws ClientException, TimeoutException
/*     */   {
/*     */     try
/*     */     {
/* 116 */       ObjectFactory factory = new ObjectFactory();
/* 117 */       ArrayOfstring arrayOfstring = new ArrayOfstring();
/* 118 */       arrayOfstring.getString().addAll(this.TestEvents);
/*     */       
/* 120 */       final JAXBElement<ArrayOfstring> testEventNames = factory.createDistributeCiTestEventsRequestEventNames(arrayOfstring);
/*     */       
/* 122 */       DistributeCiTestEventsRequest distributeCiTestEventsRequest = new DistributeCiTestEventsRequest() {};
/* 132 */       Collection<CustomProperty> customProperties = GetCustomProperties();
/* 133 */       if ((customProperties != null) && (!customProperties.isEmpty())) {
/* 134 */         JAXBElement<ArrayOfKeyValueOfstringstring> agentConfiguration = GetAgentConfigurationFromCustomProperties(customProperties, factory);
/* 135 */         distributeCiTestEventsRequest.setAgentConfiguration(agentConfiguration);
/*     */       }
/*     */       
/* 138 */       this.managerService.distributeCiTestEvents(distributeCiTestEventsRequest);
/*     */       
/* 140 */       PollCiTestEventsResultsResponse pollCiTestEventsResultsResponse = PollDexServer();
/* 141 */       HandleResult(CreateResult(pollCiTestEventsResultsResponse));
/*     */     } catch (TimeoutException e) {
/* 143 */       throw e;
/*     */     } catch (Exception e) {
/* 145 */       throw new ClientException(e.getClass().getName() + " occurred", e);
/*     */     }
/* 147 */     System.out.println("Test execution has been finished.");
/*     */   }
/*     */   
/*     */   private PollCiTestEventsResultsResponse PollDexServer() throws InterruptedException, TimeoutException {
/* 151 */     PollCiTestEventsResultsResponse pollCiTestEventsResultsResponse = null;
/* 152 */     boolean stopPolling = false;
/* 153 */     Date startTime = new Date();
/* 154 */     long dexPollingInterval = ClientProperties.getDexPollingInterval();
/* 155 */     System.out.println("Starting to poll Dex server for results. Timeout: " + ClientProperties.getCiClientTimeout() + ". Interval: " + dexPollingInterval);
/*     */     
/* 157 */     while (!stopPolling) {
/* 158 */       Thread.sleep(dexPollingInterval);
/*     */       
/* 160 */       org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.PollCiTestEventsResultsRequest pollCiTestEventsResultsRequest = new org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.PollCiTestEventsResultsRequest() {};
/* 166 */       pollCiTestEventsResultsResponse = this.managerService.pollCiTestEventsResults(pollCiTestEventsResultsRequest);
/*     */       
/* 168 */       stopPolling = IsResultAvailable(pollCiTestEventsResultsResponse);
/* 169 */       String pollingMessage = String.format("Polled Dex Server. Execution is%s finished.", new Object[] { stopPolling ? "" : " not yet" });
/* 170 */       System.out.println(pollingMessage);
/*     */       
/* 172 */       if ((!stopPolling) && (TimeoutElapsed(startTime))) {
/* 173 */         String timeoutMessage = "Timeout exceeded. Cancelling Test Event";
/* 174 */         System.out.println(timeoutMessage);
/* 175 */         this.managerService.cancelCiTestEvents(new org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.CancelCiTestEventsRequest() {});
/* 180 */         throw new TimeoutException();
/*     */       }
/*     */     }
/*     */     
/* 184 */     return pollCiTestEventsResultsResponse;
/*     */   }
/*     */   
/*     */   private boolean IsResultAvailable(PollCiTestEventsResultsResponse pollCiTestEventsResultsResponse) {
/* 188 */     return pollCiTestEventsResultsResponse.isExecutionFinished().booleanValue();
/*     */   }
/*     */   
/*     */   private boolean TimeoutElapsed(Date startTime) {
/* 192 */     boolean timeoutElapsed = new Date().getTime() - startTime.getTime() >= ClientProperties.getCiClientTimeout();
/* 193 */     if (timeoutElapsed) {
/* 194 */       System.out.println("CiClientTimeout elapsed. Stop polling DEX Server for results.");
/*     */     }
/* 196 */     return timeoutElapsed;
/*     */   }
/*     */   
/*     */   protected TestConfigurationRootNode CreateTypedTestConfigurationFromXml(Document testConfiguration) {
/* 200 */     System.out.println("Trying to deserialize Test Configuration XmlDocument to: " + testConfiguration.getClass().getName());
/*     */     
/* 202 */     if ((testConfiguration != null) && (testConfiguration.getDocumentElement() != null)) {
/*     */       try {
/* 204 */         testConfiguration.normalize();
/*     */         
/* 206 */         javax.xml.bind.JAXBContext jaxbContext = javax.xml.bind.JAXBContext.newInstance(new Class[] { TestConfigurationRootNode.class });
/* 207 */         javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
/* 208 */         return (TestConfigurationRootNode)jaxbUnmarshaller.unmarshal(testConfiguration.getDocumentElement());
/*     */       } catch (JAXBException ex) {
/* 210 */         System.err.println(ex);
/*     */       }
/*     */     }
/* 213 */     return null;
/*     */   }
/*     */   
/*     */   private JUnitTestCaseNode CreateJUnitTestCaseNode(final MonitorDistributionEntry monitorDistributionEntry) {
/* 217 */     JUnitTestCaseNode testCaseNode = new JUnitTestCaseNode() {};
/* 223 */     testCaseNode.setTime(GetDuration(monitorDistributionEntry.getStarTime(), monitorDistributionEntry.getEndTime()));
/*     */     
/* 225 */     testCaseNode.setTimeStamp(monitorDistributionEntry.getStarTime().toString());
/* 226 */     testCaseNode.setLog(monitorDistributionEntry.getLog());
/* 227 */     if ((monitorDistributionEntry.getTestResult() == TestResult.FAILED) || (monitorDistributionEntry.getTestResult() == TestResult.ERROR)) {
/* 228 */       JUnitTestCaseFailure failure = new JUnitTestCaseFailure();
/* 229 */       failure.setMessage("Test failure");
/* 230 */       failure.setText(monitorDistributionEntry.getLog());
/* 231 */       testCaseNode.setTestCaseFailure(failure);
/*     */     }
/* 233 */     return testCaseNode;
/*     */   }
/*     */   
/*     */   private List<JUnitTestSuiteNode> CreateJUnitTestSuiteNodes(PollCiTestEventsResultsResponse pollCiTestEventsResultsResponse, String additionalPackageName) {
/* 237 */     org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.ArrayOfMonitorDistributionEvent distributionEvents = (org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.ArrayOfMonitorDistributionEvent)pollCiTestEventsResultsResponse.getDistributionEvents().getValue();
/*     */     
/* 239 */     List<JUnitTestSuiteNode> jUnitTestSuiteNodes = new java.util.ArrayList();
/*     */     
/* 241 */     for (org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.MonitorDistributionEvent event : distributionEvents.getMonitorDistributionEvent()) {
/* 242 */       for (org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.MonitorDistributionItem item : ((org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.ArrayOfMonitorDistributionItem)event.getMonitorDistributionItems().getValue()).getMonitorDistributionItem()) {
/* 243 */         jUnitTestSuiteNodes.add(CreateJUnitTestSuiteNode(additionalPackageName, (MonitorDistributionList)item.getMonitorDistributionList().getValue()));
/*     */       }
/*     */     }
/* 246 */     return jUnitTestSuiteNodes;
/*     */   }
/*     */   
/*     */   private JUnitTestSuiteNode CreateJUnitTestSuiteNode(String additionalPackageName, final MonitorDistributionList distributionList) {
/* 250 */     String distributionListName = (String)distributionList.getName().getValue();
/* 251 */     final String fqJUnitName = !Util.IsNullOrEmpty(additionalPackageName) ? additionalPackageName + "." + distributionListName : distributionListName;
/*     */     
/* 253 */     System.out.println("Collecting ExecutionLog Information...");
/* 254 */     final List<MonitorDistributionEntry> monitorDistributionEntries = ((org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.ArrayOfMonitorDistributionEntry)distributionList.getMonitorDistributionEntries().getValue()).getMonitorDistributionEntry();
/* 255 */     final List<MonitorDistributionEntry> failedEntries = new java.util.ArrayList();
/*     */     
/* 257 */     for (MonitorDistributionEntry entry : monitorDistributionEntries) {
/* 258 */       if ((entry.getTestResult() == TestResult.FAILED) || (entry.getTestResult() == TestResult.ERROR)) {
/* 259 */         failedEntries.add(entry);
/*     */       }
/*     */     }
/*     */     
/* 263 */     JUnitTestSuiteNode testSuiteNode = new JUnitTestSuiteNode() {};
/* 278 */     System.out.println("Collecting ExecutionEntry/TestCase/ExecutionTestCaseLog Information...");
/* 279 */     List<JUnitTestCaseNode> testCase = testSuiteNode.getTestCase();
/*     */     
/* 281 */     for (MonitorDistributionEntry entry : monitorDistributionEntries) {
/* 282 */       testCase.add(CreateJUnitTestCaseNode(entry));
/*     */     }
/*     */     
/* 285 */     testSuiteNode.setTestCase(testCase);
/*     */     
/* 287 */     return testSuiteNode;
/*     */   }
/*     */   
/*     */   private Document CreateResult(PollCiTestEventsResultsResponse pollCiTestEventsResultsResponse) throws JAXBException {
/* 291 */     System.out.println("Creating junit test result...");
/* 292 */     JUnitRootNode testResult = new JUnitRootNode();
/*     */     
/* 294 */     System.out.println("Collecting TestMandate Information...");
/* 295 */     JUnitTestSuitesNode testSuitesNode = new JUnitTestSuitesNode();
/* 296 */     List<JUnitTestSuiteNode> testSuiteNodes = CreateJUnitTestSuiteNodes(pollCiTestEventsResultsResponse, GetPackageName());
/* 297 */     testSuitesNode.getTestSuite().addAll(testSuiteNodes);
/*     */     
/* 299 */     testResult.setTestSuites(testSuitesNode);
/* 300 */     SetExecutionState(testResult);
/*     */     
/* 302 */     System.out.println("Test result has been created.");
/* 303 */     return Util.CreateXmlFromTypedTestResult(testResult);
/*     */   }
/*     */   
/*     */   private void SetExecutionState(JUnitRootNode testResult) {
/* 307 */     boolean hasFailedEntries = false;
/* 308 */     for (JUnitTestSuiteNode entry : testResult.getTestSuites().getTestSuite()) {
/* 309 */       if (!entry.getFailures().equals("0")) {
/* 310 */         hasFailedEntries = true;
/*     */       }
/*     */     }
/* 313 */     String status = hasFailedEntries ? Constants.ExecutionFailed.toString() : Constants.ExecutionPassed.toString();
/* 314 */     testResult.setStatus(status);
/*     */   }
/*     */   
/*     */   private String GetPackageName() throws JAXBException {
/* 318 */     System.out.println("Retrieving Package name...");
/* 319 */     TestConfigurationRootNode testConfigurationRootNode = CreateTypedTestConfigurationFromXml(this.configurationXmlDocument);
/* 320 */     String packageName = (testConfigurationRootNode != null) && (testConfigurationRootNode.getPackageName() != null) ? testConfigurationRootNode.getPackageName() : "";
/* 321 */     System.out.println("Package name: " + packageName);
/* 322 */     return packageName;
/*     */   }
/*     */   
/*     */   private Collection<CustomProperty> GetCustomProperties() throws JAXBException {
/* 326 */     System.out.println("Retrieving Custom Properties...");
/* 327 */     TestConfigurationRootNode testConfigurationRootNode = CreateTypedTestConfigurationFromXml(this.configurationXmlDocument);
/*     */     
/* 329 */     if (testConfigurationRootNode == null) {
/* 330 */       throw new IllegalStateException("Test configuration is missing the root node.");
/*     */     }
/*     */     
/* 333 */     return testConfigurationRootNode.getCustomProperties();
/*     */   }
/*     */   
/*     */   private JAXBElement<ArrayOfKeyValueOfstringstring> GetAgentConfigurationFromCustomProperties(Collection<CustomProperty> customProperties, ObjectFactory factory) {
/* 337 */     ArrayOfKeyValueOfstringstring arrayOfKeyValueOfstringstring = new ArrayOfKeyValueOfstringstring();
/* 338 */     for (Iterator<CustomProperty> i = customProperties.iterator(); i.hasNext();) {
/* 339 */       CustomProperty prop = (CustomProperty)i.next();
/* 340 */       ArrayOfKeyValueOfstringstring.KeyValueOfstringstring keyValueOfstringstring = new ArrayOfKeyValueOfstringstring.KeyValueOfstringstring();
/* 341 */       keyValueOfstringstring.setKey(prop.getName());
/* 342 */       keyValueOfstringstring.setValue(prop.getValue());
/* 343 */       arrayOfKeyValueOfstringstring.getKeyValueOfstringstring().add(keyValueOfstringstring);
/*     */     }
/* 345 */     JAXBElement<ArrayOfKeyValueOfstringstring> agentConfiguration = factory.createDistributeCiTestEventsRequestAgentConfiguration(arrayOfKeyValueOfstringstring);
/* 346 */     return agentConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */   private static String GetDuration(XMLGregorianCalendar startTimeXML, XMLGregorianCalendar endTimeXML)
/*     */   {
/* 352 */     GregorianCalendar endTime = endTimeXML.toGregorianCalendar();
/* 353 */     GregorianCalendar startTime = startTimeXML.toGregorianCalendar();
/* 354 */     long durationInMillis = endTime.getTimeInMillis() - startTime.getTimeInMillis();
/* 355 */     return Long.toString(durationInMillis / 1000L);
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacijavaclient\DexDispatcher.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */