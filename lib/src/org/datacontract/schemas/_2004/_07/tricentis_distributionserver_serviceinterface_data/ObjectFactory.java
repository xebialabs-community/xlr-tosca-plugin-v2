/*     */ package org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data;
/*     */ 
/*     */ import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
/*     */ import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlElementDecl;
/*     */ import javax.xml.bind.annotation.XmlRegistry;
/*     */ import javax.xml.namespace.QName;
/*     */ import org.datacontract.schemas._2004._07.tricentis.ArrayOfCloudResultContainer;
/*     */ import org.datacontract.schemas._2004._07.tricentis.ArrayOfTestConfigurationParameter;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver.AgentInfo;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlRegistry
/*     */ public class ObjectFactory
/*     */ {
/*  32 */   private static final QName _MonitorDistributionEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "MonitorDistributionEntry");
/*  33 */   private static final QName _DistributeRequestDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "DistributeRequestDetails");
/*  34 */   private static final QName _MonitorDistributionList_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "MonitorDistributionList");
/*  35 */   private static final QName _MonitorDistributionItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "MonitorDistributionItem");
/*  36 */   private static final QName _ArrayOfDistributeRequestDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "ArrayOfDistributeRequestDetails");
/*  37 */   private static final QName _ArrayOfMonitorDistributionEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "ArrayOfMonitorDistributionEvent");
/*  38 */   private static final QName _PollCiTestEventsResultsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "PollCiTestEventsResultsResponse");
/*  39 */   private static final QName _DistributeCloudRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "DistributeCloudRequest");
/*  40 */   private static final QName _DistributeCiTestEventsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "DistributeCiTestEventsRequest");
/*  41 */   private static final QName _ArrayOfMonitorDistributionItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "ArrayOfMonitorDistributionItem");
/*  42 */   private static final QName _DeleteResultRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "DeleteResultRequest");
/*  43 */   private static final QName _PollCiTestEventsResultsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "PollCiTestEventsResultsRequest");
/*  44 */   private static final QName _GetCloudResultRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "GetCloudResultRequest");
/*  45 */   private static final QName _DistributeCloudRequestDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "DistributeCloudRequestDetails");
/*  46 */   private static final QName _DistributeRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "DistributeRequest");
/*  47 */   private static final QName _GetCloudResultResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "GetCloudResultResponse");
/*  48 */   private static final QName _MonitorDistributionEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "MonitorDistributionEvent");
/*  49 */   private static final QName _ArrayOfDistributeCloudRequestDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "ArrayOfDistributeCloudRequestDetails");
/*  50 */   private static final QName _RegistrationResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "RegistrationResponse");
/*  51 */   private static final QName _CancelCiTestEventsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "CancelCiTestEventsRequest");
/*  52 */   private static final QName _ArrayOfMonitorDistributionEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "ArrayOfMonitorDistributionEntry");
/*  53 */   private static final QName _MonitorDistributionItemAgentInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "AgentInfo");
/*  54 */   private static final QName _MonitorDistributionItemErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "ErrorMessage");
/*  55 */   private static final QName _MonitorDistributionEntryLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "Log");
/*  56 */   private static final QName _MonitorDistributionEntryName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "Name");
/*  57 */   private static final QName _MonitorDistributionEntrySurrogate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "Surrogate");
/*  58 */   private static final QName _GetCloudResultRequestWorkspaceId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "WorkspaceId");
/*  59 */   private static final QName _DeleteResultRequestSaveFilePath_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "SaveFilePath");
/*  60 */   private static final QName _DistributeCiTestEventsRequestAgentConfiguration_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "AgentConfiguration");
/*  61 */   private static final QName _DistributeCiTestEventsRequestEventNames_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "EventNames");
/*  62 */   private static final QName _DistributeCloudRequestDetailsExecListName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "ExecListName");
/*  63 */   private static final QName _DistributeCloudRequestDetailsExecListSurrogate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "ExecListSurrogate");
/*  64 */   private static final QName _DistributeCloudRequestDetailsTestConfigurationParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "TestConfigurationParameter");
/*  65 */   private static final QName _DistributeCloudRequestDetailsExecListSubset_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "ExecListSubset");
/*  66 */   private static final QName _RegistrationResponseLogMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "LogMessage");
/*  67 */   private static final QName _DistributeRequestDetailsExecListSurrugate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "ExecListSurrugate");
/*  68 */   private static final QName _PollCiTestEventsResultsResponseDistributionEvents_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "DistributionEvents");
/*  69 */   private static final QName _DistributeRequestEventName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "EventName");
/*  70 */   private static final QName _DistributeRequestEventCreator_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "EventCreator");
/*  71 */   private static final QName _DistributeRequestExecutionListDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "ExecutionListDetails");
/*  72 */   private static final QName _GetCloudResultResponseCloudResultContainers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", "CloudResultContainers");
/*  73 */   private static final QName _MonitorDistributionListMonitorDistributionEntries_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "MonitorDistributionEntries");
/*  74 */   private static final QName _MonitorDistributionEventCreator_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "Creator");
/*  75 */   private static final QName _MonitorDistributionEventMonitorDistributionItems_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", "MonitorDistributionItems");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DistributeCloudRequest createDistributeCloudRequest()
/*     */   {
/*  89 */     return new DistributeCloudRequest();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public GetCloudResultResponse createGetCloudResultResponse()
/*     */   {
/*  97 */     return new GetCloudResultResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public DistributeRequest createDistributeRequest()
/*     */   {
/* 105 */     return new DistributeRequest();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public CancelCiTestEventsRequest createCancelCiTestEventsRequest()
/*     */   {
/* 113 */     return new CancelCiTestEventsRequest();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public RegistrationResponse createRegistrationResponse()
/*     */   {
/* 121 */     return new RegistrationResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public PollCiTestEventsResultsResponse createPollCiTestEventsResultsResponse()
/*     */   {
/* 129 */     return new PollCiTestEventsResultsResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public DistributeCiTestEventsRequest createDistributeCiTestEventsRequest()
/*     */   {
/* 137 */     return new DistributeCiTestEventsRequest();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public GetCloudResultRequest createGetCloudResultRequest()
/*     */   {
/* 145 */     return new GetCloudResultRequest();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public PollCiTestEventsResultsRequest createPollCiTestEventsResultsRequest()
/*     */   {
/* 153 */     return new PollCiTestEventsResultsRequest();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public DeleteResultRequest createDeleteResultRequest()
/*     */   {
/* 161 */     return new DeleteResultRequest();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayOfDistributeRequestDetails createArrayOfDistributeRequestDetails()
/*     */   {
/* 169 */     return new ArrayOfDistributeRequestDetails();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayOfDistributeCloudRequestDetails createArrayOfDistributeCloudRequestDetails()
/*     */   {
/* 177 */     return new ArrayOfDistributeCloudRequestDetails();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public DistributeRequestDetails createDistributeRequestDetails()
/*     */   {
/* 185 */     return new DistributeRequestDetails();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public DistributeCloudRequestDetails createDistributeCloudRequestDetails()
/*     */   {
/* 193 */     return new DistributeCloudRequestDetails();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public MonitorDistributionEntry createMonitorDistributionEntry()
/*     */   {
/* 201 */     return new MonitorDistributionEntry();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayOfMonitorDistributionEvent createArrayOfMonitorDistributionEvent()
/*     */   {
/* 209 */     return new ArrayOfMonitorDistributionEvent();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public MonitorDistributionEvent createMonitorDistributionEvent()
/*     */   {
/* 217 */     return new MonitorDistributionEvent();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public MonitorDistributionList createMonitorDistributionList()
/*     */   {
/* 225 */     return new MonitorDistributionList();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayOfMonitorDistributionEntry createArrayOfMonitorDistributionEntry()
/*     */   {
/* 233 */     return new ArrayOfMonitorDistributionEntry();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public MonitorDistributionItem createMonitorDistributionItem()
/*     */   {
/* 241 */     return new MonitorDistributionItem();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayOfMonitorDistributionItem createArrayOfMonitorDistributionItem()
/*     */   {
/* 249 */     return new ArrayOfMonitorDistributionItem();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="MonitorDistributionEntry")
/*     */   public JAXBElement<MonitorDistributionEntry> createMonitorDistributionEntry(MonitorDistributionEntry value)
/*     */   {
/* 258 */     return new JAXBElement(_MonitorDistributionEntry_QNAME, MonitorDistributionEntry.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="DistributeRequestDetails")
/*     */   public JAXBElement<DistributeRequestDetails> createDistributeRequestDetails(DistributeRequestDetails value)
/*     */   {
/* 267 */     return new JAXBElement(_DistributeRequestDetails_QNAME, DistributeRequestDetails.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="MonitorDistributionList")
/*     */   public JAXBElement<MonitorDistributionList> createMonitorDistributionList(MonitorDistributionList value)
/*     */   {
/* 276 */     return new JAXBElement(_MonitorDistributionList_QNAME, MonitorDistributionList.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="MonitorDistributionItem")
/*     */   public JAXBElement<MonitorDistributionItem> createMonitorDistributionItem(MonitorDistributionItem value)
/*     */   {
/* 285 */     return new JAXBElement(_MonitorDistributionItem_QNAME, MonitorDistributionItem.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="ArrayOfDistributeRequestDetails")
/*     */   public JAXBElement<ArrayOfDistributeRequestDetails> createArrayOfDistributeRequestDetails(ArrayOfDistributeRequestDetails value)
/*     */   {
/* 294 */     return new JAXBElement(_ArrayOfDistributeRequestDetails_QNAME, ArrayOfDistributeRequestDetails.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="ArrayOfMonitorDistributionEvent")
/*     */   public JAXBElement<ArrayOfMonitorDistributionEvent> createArrayOfMonitorDistributionEvent(ArrayOfMonitorDistributionEvent value)
/*     */   {
/* 303 */     return new JAXBElement(_ArrayOfMonitorDistributionEvent_QNAME, ArrayOfMonitorDistributionEvent.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="PollCiTestEventsResultsResponse")
/*     */   public JAXBElement<PollCiTestEventsResultsResponse> createPollCiTestEventsResultsResponse(PollCiTestEventsResultsResponse value)
/*     */   {
/* 312 */     return new JAXBElement(_PollCiTestEventsResultsResponse_QNAME, PollCiTestEventsResultsResponse.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="DistributeCloudRequest")
/*     */   public JAXBElement<DistributeCloudRequest> createDistributeCloudRequest(DistributeCloudRequest value)
/*     */   {
/* 321 */     return new JAXBElement(_DistributeCloudRequest_QNAME, DistributeCloudRequest.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="DistributeCiTestEventsRequest")
/*     */   public JAXBElement<DistributeCiTestEventsRequest> createDistributeCiTestEventsRequest(DistributeCiTestEventsRequest value)
/*     */   {
/* 330 */     return new JAXBElement(_DistributeCiTestEventsRequest_QNAME, DistributeCiTestEventsRequest.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="ArrayOfMonitorDistributionItem")
/*     */   public JAXBElement<ArrayOfMonitorDistributionItem> createArrayOfMonitorDistributionItem(ArrayOfMonitorDistributionItem value)
/*     */   {
/* 339 */     return new JAXBElement(_ArrayOfMonitorDistributionItem_QNAME, ArrayOfMonitorDistributionItem.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="DeleteResultRequest")
/*     */   public JAXBElement<DeleteResultRequest> createDeleteResultRequest(DeleteResultRequest value)
/*     */   {
/* 348 */     return new JAXBElement(_DeleteResultRequest_QNAME, DeleteResultRequest.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="PollCiTestEventsResultsRequest")
/*     */   public JAXBElement<PollCiTestEventsResultsRequest> createPollCiTestEventsResultsRequest(PollCiTestEventsResultsRequest value)
/*     */   {
/* 357 */     return new JAXBElement(_PollCiTestEventsResultsRequest_QNAME, PollCiTestEventsResultsRequest.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="GetCloudResultRequest")
/*     */   public JAXBElement<GetCloudResultRequest> createGetCloudResultRequest(GetCloudResultRequest value)
/*     */   {
/* 366 */     return new JAXBElement(_GetCloudResultRequest_QNAME, GetCloudResultRequest.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="DistributeCloudRequestDetails")
/*     */   public JAXBElement<DistributeCloudRequestDetails> createDistributeCloudRequestDetails(DistributeCloudRequestDetails value)
/*     */   {
/* 375 */     return new JAXBElement(_DistributeCloudRequestDetails_QNAME, DistributeCloudRequestDetails.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="DistributeRequest")
/*     */   public JAXBElement<DistributeRequest> createDistributeRequest(DistributeRequest value)
/*     */   {
/* 384 */     return new JAXBElement(_DistributeRequest_QNAME, DistributeRequest.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="GetCloudResultResponse")
/*     */   public JAXBElement<GetCloudResultResponse> createGetCloudResultResponse(GetCloudResultResponse value)
/*     */   {
/* 393 */     return new JAXBElement(_GetCloudResultResponse_QNAME, GetCloudResultResponse.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="MonitorDistributionEvent")
/*     */   public JAXBElement<MonitorDistributionEvent> createMonitorDistributionEvent(MonitorDistributionEvent value)
/*     */   {
/* 402 */     return new JAXBElement(_MonitorDistributionEvent_QNAME, MonitorDistributionEvent.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="ArrayOfDistributeCloudRequestDetails")
/*     */   public JAXBElement<ArrayOfDistributeCloudRequestDetails> createArrayOfDistributeCloudRequestDetails(ArrayOfDistributeCloudRequestDetails value)
/*     */   {
/* 411 */     return new JAXBElement(_ArrayOfDistributeCloudRequestDetails_QNAME, ArrayOfDistributeCloudRequestDetails.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="RegistrationResponse")
/*     */   public JAXBElement<RegistrationResponse> createRegistrationResponse(RegistrationResponse value)
/*     */   {
/* 420 */     return new JAXBElement(_RegistrationResponse_QNAME, RegistrationResponse.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="CancelCiTestEventsRequest")
/*     */   public JAXBElement<CancelCiTestEventsRequest> createCancelCiTestEventsRequest(CancelCiTestEventsRequest value)
/*     */   {
/* 429 */     return new JAXBElement(_CancelCiTestEventsRequest_QNAME, CancelCiTestEventsRequest.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="ArrayOfMonitorDistributionEntry")
/*     */   public JAXBElement<ArrayOfMonitorDistributionEntry> createArrayOfMonitorDistributionEntry(ArrayOfMonitorDistributionEntry value)
/*     */   {
/* 438 */     return new JAXBElement(_ArrayOfMonitorDistributionEntry_QNAME, ArrayOfMonitorDistributionEntry.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="MonitorDistributionList", scope=MonitorDistributionItem.class)
/*     */   public JAXBElement<MonitorDistributionList> createMonitorDistributionItemMonitorDistributionList(MonitorDistributionList value)
/*     */   {
/* 447 */     return new JAXBElement(_MonitorDistributionList_QNAME, MonitorDistributionList.class, MonitorDistributionItem.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="AgentInfo", scope=MonitorDistributionItem.class)
/*     */   public JAXBElement<AgentInfo> createMonitorDistributionItemAgentInfo(AgentInfo value)
/*     */   {
/* 456 */     return new JAXBElement(_MonitorDistributionItemAgentInfo_QNAME, AgentInfo.class, MonitorDistributionItem.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="ErrorMessage", scope=MonitorDistributionItem.class)
/*     */   public JAXBElement<String> createMonitorDistributionItemErrorMessage(String value)
/*     */   {
/* 465 */     return new JAXBElement(_MonitorDistributionItemErrorMessage_QNAME, String.class, MonitorDistributionItem.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="Log", scope=MonitorDistributionEntry.class)
/*     */   public JAXBElement<String> createMonitorDistributionEntryLog(String value)
/*     */   {
/* 474 */     return new JAXBElement(_MonitorDistributionEntryLog_QNAME, String.class, MonitorDistributionEntry.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="Name", scope=MonitorDistributionEntry.class)
/*     */   public JAXBElement<String> createMonitorDistributionEntryName(String value)
/*     */   {
/* 483 */     return new JAXBElement(_MonitorDistributionEntryName_QNAME, String.class, MonitorDistributionEntry.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="Surrogate", scope=MonitorDistributionEntry.class)
/*     */   public JAXBElement<String> createMonitorDistributionEntrySurrogate(String value)
/*     */   {
/* 492 */     return new JAXBElement(_MonitorDistributionEntrySurrogate_QNAME, String.class, MonitorDistributionEntry.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="WorkspaceId", scope=GetCloudResultRequest.class)
/*     */   public JAXBElement<String> createGetCloudResultRequestWorkspaceId(String value)
/*     */   {
/* 501 */     return new JAXBElement(_GetCloudResultRequestWorkspaceId_QNAME, String.class, GetCloudResultRequest.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="SaveFilePath", scope=DeleteResultRequest.class)
/*     */   public JAXBElement<String> createDeleteResultRequestSaveFilePath(String value)
/*     */   {
/* 510 */     return new JAXBElement(_DeleteResultRequestSaveFilePath_QNAME, String.class, DeleteResultRequest.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="AgentConfiguration", scope=DistributeCiTestEventsRequest.class)
/*     */   public JAXBElement<ArrayOfKeyValueOfstringstring> createDistributeCiTestEventsRequestAgentConfiguration(ArrayOfKeyValueOfstringstring value)
/*     */   {
/* 519 */     return new JAXBElement(_DistributeCiTestEventsRequestAgentConfiguration_QNAME, ArrayOfKeyValueOfstringstring.class, DistributeCiTestEventsRequest.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="EventNames", scope=DistributeCiTestEventsRequest.class)
/*     */   public JAXBElement<ArrayOfstring> createDistributeCiTestEventsRequestEventNames(ArrayOfstring value)
/*     */   {
/* 528 */     return new JAXBElement(_DistributeCiTestEventsRequestEventNames_QNAME, ArrayOfstring.class, DistributeCiTestEventsRequest.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="ExecListName", scope=DistributeCloudRequestDetails.class)
/*     */   public JAXBElement<String> createDistributeCloudRequestDetailsExecListName(String value)
/*     */   {
/* 537 */     return new JAXBElement(_DistributeCloudRequestDetailsExecListName_QNAME, String.class, DistributeCloudRequestDetails.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="ExecListSurrogate", scope=DistributeCloudRequestDetails.class)
/*     */   public JAXBElement<String> createDistributeCloudRequestDetailsExecListSurrogate(String value)
/*     */   {
/* 546 */     return new JAXBElement(_DistributeCloudRequestDetailsExecListSurrogate_QNAME, String.class, DistributeCloudRequestDetails.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="TestConfigurationParameter", scope=DistributeCloudRequestDetails.class)
/*     */   public JAXBElement<ArrayOfTestConfigurationParameter> createDistributeCloudRequestDetailsTestConfigurationParameter(ArrayOfTestConfigurationParameter value)
/*     */   {
/* 555 */     return new JAXBElement(_DistributeCloudRequestDetailsTestConfigurationParameter_QNAME, ArrayOfTestConfigurationParameter.class, DistributeCloudRequestDetails.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="ExecListSubset", scope=DistributeCloudRequestDetails.class)
/*     */   public JAXBElement<byte[]> createDistributeCloudRequestDetailsExecListSubset(byte[] value)
/*     */   {
/* 564 */     return new JAXBElement(_DistributeCloudRequestDetailsExecListSubset_QNAME, byte[].class, DistributeCloudRequestDetails.class, (byte[])value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="LogMessage", scope=RegistrationResponse.class)
/*     */   public JAXBElement<String> createRegistrationResponseLogMessage(String value)
/*     */   {
/* 573 */     return new JAXBElement(_RegistrationResponseLogMessage_QNAME, String.class, RegistrationResponse.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="ExecListName", scope=DistributeRequestDetails.class)
/*     */   public JAXBElement<String> createDistributeRequestDetailsExecListName(String value)
/*     */   {
/* 582 */     return new JAXBElement(_DistributeCloudRequestDetailsExecListName_QNAME, String.class, DistributeRequestDetails.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="TestConfigurationParameter", scope=DistributeRequestDetails.class)
/*     */   public JAXBElement<ArrayOfTestConfigurationParameter> createDistributeRequestDetailsTestConfigurationParameter(ArrayOfTestConfigurationParameter value)
/*     */   {
/* 591 */     return new JAXBElement(_DistributeCloudRequestDetailsTestConfigurationParameter_QNAME, ArrayOfTestConfigurationParameter.class, DistributeRequestDetails.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="ExecListSurrugate", scope=DistributeRequestDetails.class)
/*     */   public JAXBElement<String> createDistributeRequestDetailsExecListSurrugate(String value)
/*     */   {
/* 600 */     return new JAXBElement(_DistributeRequestDetailsExecListSurrugate_QNAME, String.class, DistributeRequestDetails.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="DistributionEvents", scope=PollCiTestEventsResultsResponse.class)
/*     */   public JAXBElement<ArrayOfMonitorDistributionEvent> createPollCiTestEventsResultsResponseDistributionEvents(ArrayOfMonitorDistributionEvent value)
/*     */   {
/* 609 */     return new JAXBElement(_PollCiTestEventsResultsResponseDistributionEvents_QNAME, ArrayOfMonitorDistributionEvent.class, PollCiTestEventsResultsResponse.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="EventName", scope=DistributeRequest.class)
/*     */   public JAXBElement<String> createDistributeRequestEventName(String value)
/*     */   {
/* 618 */     return new JAXBElement(_DistributeRequestEventName_QNAME, String.class, DistributeRequest.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="EventCreator", scope=DistributeRequest.class)
/*     */   public JAXBElement<String> createDistributeRequestEventCreator(String value)
/*     */   {
/* 627 */     return new JAXBElement(_DistributeRequestEventCreator_QNAME, String.class, DistributeRequest.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="ExecutionListDetails", scope=DistributeRequest.class)
/*     */   public JAXBElement<ArrayOfDistributeRequestDetails> createDistributeRequestExecutionListDetails(ArrayOfDistributeRequestDetails value)
/*     */   {
/* 636 */     return new JAXBElement(_DistributeRequestExecutionListDetails_QNAME, ArrayOfDistributeRequestDetails.class, DistributeRequest.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="CloudResultContainers", scope=GetCloudResultResponse.class)
/*     */   public JAXBElement<ArrayOfCloudResultContainer> createGetCloudResultResponseCloudResultContainers(ArrayOfCloudResultContainer value)
/*     */   {
/* 645 */     return new JAXBElement(_GetCloudResultResponseCloudResultContainers_QNAME, ArrayOfCloudResultContainer.class, GetCloudResultResponse.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="WorkspaceId", scope=DistributeCloudRequest.class)
/*     */   public JAXBElement<String> createDistributeCloudRequestWorkspaceId(String value)
/*     */   {
/* 654 */     return new JAXBElement(_GetCloudResultRequestWorkspaceId_QNAME, String.class, DistributeCloudRequest.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="EventName", scope=DistributeCloudRequest.class)
/*     */   public JAXBElement<String> createDistributeCloudRequestEventName(String value)
/*     */   {
/* 663 */     return new JAXBElement(_DistributeRequestEventName_QNAME, String.class, DistributeCloudRequest.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="EventCreator", scope=DistributeCloudRequest.class)
/*     */   public JAXBElement<String> createDistributeCloudRequestEventCreator(String value)
/*     */   {
/* 672 */     return new JAXBElement(_DistributeRequestEventCreator_QNAME, String.class, DistributeCloudRequest.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", name="ExecutionListDetails", scope=DistributeCloudRequest.class)
/*     */   public JAXBElement<ArrayOfDistributeCloudRequestDetails> createDistributeCloudRequestExecutionListDetails(ArrayOfDistributeCloudRequestDetails value)
/*     */   {
/* 681 */     return new JAXBElement(_DistributeRequestExecutionListDetails_QNAME, ArrayOfDistributeCloudRequestDetails.class, DistributeCloudRequest.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="MonitorDistributionEntries", scope=MonitorDistributionList.class)
/*     */   public JAXBElement<ArrayOfMonitorDistributionEntry> createMonitorDistributionListMonitorDistributionEntries(ArrayOfMonitorDistributionEntry value)
/*     */   {
/* 690 */     return new JAXBElement(_MonitorDistributionListMonitorDistributionEntries_QNAME, ArrayOfMonitorDistributionEntry.class, MonitorDistributionList.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="Name", scope=MonitorDistributionList.class)
/*     */   public JAXBElement<String> createMonitorDistributionListName(String value)
/*     */   {
/* 699 */     return new JAXBElement(_MonitorDistributionEntryName_QNAME, String.class, MonitorDistributionList.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="Surrogate", scope=MonitorDistributionList.class)
/*     */   public JAXBElement<String> createMonitorDistributionListSurrogate(String value)
/*     */   {
/* 708 */     return new JAXBElement(_MonitorDistributionEntrySurrogate_QNAME, String.class, MonitorDistributionList.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="Creator", scope=MonitorDistributionEvent.class)
/*     */   public JAXBElement<String> createMonitorDistributionEventCreator(String value)
/*     */   {
/* 717 */     return new JAXBElement(_MonitorDistributionEventCreator_QNAME, String.class, MonitorDistributionEvent.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="Name", scope=MonitorDistributionEvent.class)
/*     */   public JAXBElement<String> createMonitorDistributionEventName(String value)
/*     */   {
/* 726 */     return new JAXBElement(_MonitorDistributionEntryName_QNAME, String.class, MonitorDistributionEvent.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", name="MonitorDistributionItems", scope=MonitorDistributionEvent.class)
/*     */   public JAXBElement<ArrayOfMonitorDistributionItem> createMonitorDistributionEventMonitorDistributionItems(ArrayOfMonitorDistributionItem value)
/*     */   {
/* 735 */     return new JAXBElement(_MonitorDistributionEventMonitorDistributionItems_QNAME, ArrayOfMonitorDistributionItem.class, MonitorDistributionEvent.class, value);
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */