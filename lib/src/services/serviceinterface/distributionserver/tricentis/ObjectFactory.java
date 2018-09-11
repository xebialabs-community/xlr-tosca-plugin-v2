/*     */ package services.serviceinterface.distributionserver.tricentis;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlElementDecl;
/*     */ import javax.xml.bind.annotation.XmlRegistry;
/*     */ import javax.xml.namespace.QName;
/*     */ import org.datacontract.schemas._2004._07.tricentis.TestConfigurationParameterCollection;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver.ArrayOfAgentInfo;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.CancelCiTestEventsRequest;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.DeleteResultRequest;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.DistributeCiTestEventsRequest;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.DistributeCloudRequest;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.DistributeRequest;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.GetCloudResultRequest;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.GetCloudResultResponse;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.PollCiTestEventsResultsRequest;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.RegistrationResponse;
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
/*  38 */   private static final QName _DistributeDistributeRequest_QNAME = new QName("Tricentis.DistributionServer.ServiceInterface.Services", "distributeRequest");
/*  39 */   private static final QName _DistributeInCloudDistributeCloudRequest_QNAME = new QName("Tricentis.DistributionServer.ServiceInterface.Services", "distributeCloudRequest");
/*  40 */   private static final QName _GetAgentsResponseGetAgentsResult_QNAME = new QName("Tricentis.DistributionServer.ServiceInterface.Services", "GetAgentsResult");
/*  41 */   private static final QName _PollCiTestEventsResultsResponsePollCiTestEventsResultsResult_QNAME = new QName("Tricentis.DistributionServer.ServiceInterface.Services", "PollCiTestEventsResultsResult");
/*  42 */   private static final QName _DeleteResultDeleteResultRequest_QNAME = new QName("Tricentis.DistributionServer.ServiceInterface.Services", "deleteResultRequest");
/*  43 */   private static final QName _PollCiTestEventsResultsPollCiTestEventsResultsRequest_QNAME = new QName("Tricentis.DistributionServer.ServiceInterface.Services", "pollCiTestEventsResultsRequest");
/*  44 */   private static final QName _GetCloudResultContainerResponseGetCloudResultContainerResult_QNAME = new QName("Tricentis.DistributionServer.ServiceInterface.Services", "GetCloudResultContainerResult");
/*  45 */   private static final QName _RegisterLdapString_QNAME = new QName("Tricentis.DistributionServer.ServiceInterface.Services", "ldapString");
/*  46 */   private static final QName _GetConfigurationParametersResponseGetConfigurationParametersResult_QNAME = new QName("Tricentis.DistributionServer.ServiceInterface.Services", "GetConfigurationParametersResult");
/*  47 */   private static final QName _RegisterResponseRegisterResult_QNAME = new QName("Tricentis.DistributionServer.ServiceInterface.Services", "RegisterResult");
/*  48 */   private static final QName _DistributeCiTestEventsDistributeCiTestEventsRequest_QNAME = new QName("Tricentis.DistributionServer.ServiceInterface.Services", "distributeCiTestEventsRequest");
/*  49 */   private static final QName _GetCloudResultContainerEventId_QNAME = new QName("Tricentis.DistributionServer.ServiceInterface.Services", "eventId");
/*  50 */   private static final QName _CancelCiTestEventsCancelCiTestEventsRequest_QNAME = new QName("Tricentis.DistributionServer.ServiceInterface.Services", "cancelCiTestEventsRequest");
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
/*     */   public DistributeInCloud createDistributeInCloud()
/*     */   {
/*  64 */     return new DistributeInCloud();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public DeleteResultResponse createDeleteResultResponse()
/*     */   {
/*  72 */     return new DeleteResultResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public GetAgentsResponse createGetAgentsResponse()
/*     */   {
/*  80 */     return new GetAgentsResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public GetCloudResultContainerResponse createGetCloudResultContainerResponse()
/*     */   {
/*  88 */     return new GetCloudResultContainerResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Distribute createDistribute()
/*     */   {
/*  96 */     return new Distribute();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public CancelCiTestEvents createCancelCiTestEvents()
/*     */   {
/* 104 */     return new CancelCiTestEvents();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public CancelCiTestEventsResponse createCancelCiTestEventsResponse()
/*     */   {
/* 112 */     return new CancelCiTestEventsResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public GetAgents createGetAgents()
/*     */   {
/* 120 */     return new GetAgents();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public DistributeOnTestbirdsResponse createDistributeOnTestbirdsResponse()
/*     */   {
/* 128 */     return new DistributeOnTestbirdsResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public RegisterResponse createRegisterResponse()
/*     */   {
/* 136 */     return new RegisterResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public DistributeCiTestEventsResponse createDistributeCiTestEventsResponse()
/*     */   {
/* 144 */     return new DistributeCiTestEventsResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public DistributeInCloudResponse createDistributeInCloudResponse()
/*     */   {
/* 152 */     return new DistributeInCloudResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public PollCiTestEventsResultsResponse createPollCiTestEventsResultsResponse()
/*     */   {
/* 160 */     return new PollCiTestEventsResultsResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public DistributeCiTestEvents createDistributeCiTestEvents()
/*     */   {
/* 168 */     return new DistributeCiTestEvents();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Register createRegister()
/*     */   {
/* 176 */     return new Register();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public GetConfigurationParametersResponse createGetConfigurationParametersResponse()
/*     */   {
/* 184 */     return new GetConfigurationParametersResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public DistributeOnTestbirds createDistributeOnTestbirds()
/*     */   {
/* 192 */     return new DistributeOnTestbirds();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public GetCloudResultContainer createGetCloudResultContainer()
/*     */   {
/* 200 */     return new GetCloudResultContainer();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public PollCiTestEventsResults createPollCiTestEventsResults()
/*     */   {
/* 208 */     return new PollCiTestEventsResults();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public DistributeResponse createDistributeResponse()
/*     */   {
/* 216 */     return new DistributeResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public DeleteResult createDeleteResult()
/*     */   {
/* 224 */     return new DeleteResult();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public GetConfigurationParameters createGetConfigurationParameters()
/*     */   {
/* 232 */     return new GetConfigurationParameters();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="Tricentis.DistributionServer.ServiceInterface.Services", name="distributeRequest", scope=Distribute.class)
/*     */   public JAXBElement<DistributeRequest> createDistributeDistributeRequest(DistributeRequest value)
/*     */   {
/* 241 */     return new JAXBElement(_DistributeDistributeRequest_QNAME, DistributeRequest.class, Distribute.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="Tricentis.DistributionServer.ServiceInterface.Services", name="distributeCloudRequest", scope=DistributeInCloud.class)
/*     */   public JAXBElement<DistributeCloudRequest> createDistributeInCloudDistributeCloudRequest(DistributeCloudRequest value)
/*     */   {
/* 250 */     return new JAXBElement(_DistributeInCloudDistributeCloudRequest_QNAME, DistributeCloudRequest.class, DistributeInCloud.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="Tricentis.DistributionServer.ServiceInterface.Services", name="GetAgentsResult", scope=GetAgentsResponse.class)
/*     */   public JAXBElement<ArrayOfAgentInfo> createGetAgentsResponseGetAgentsResult(ArrayOfAgentInfo value)
/*     */   {
/* 259 */     return new JAXBElement(_GetAgentsResponseGetAgentsResult_QNAME, ArrayOfAgentInfo.class, GetAgentsResponse.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="Tricentis.DistributionServer.ServiceInterface.Services", name="PollCiTestEventsResultsResult", scope=PollCiTestEventsResultsResponse.class)
/*     */   public JAXBElement<org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.PollCiTestEventsResultsResponse> createPollCiTestEventsResultsResponsePollCiTestEventsResultsResult(org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.PollCiTestEventsResultsResponse value)
/*     */   {
/* 268 */     return new JAXBElement(_PollCiTestEventsResultsResponsePollCiTestEventsResultsResult_QNAME, org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.PollCiTestEventsResultsResponse.class, PollCiTestEventsResultsResponse.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="Tricentis.DistributionServer.ServiceInterface.Services", name="deleteResultRequest", scope=DeleteResult.class)
/*     */   public JAXBElement<DeleteResultRequest> createDeleteResultDeleteResultRequest(DeleteResultRequest value)
/*     */   {
/* 277 */     return new JAXBElement(_DeleteResultDeleteResultRequest_QNAME, DeleteResultRequest.class, DeleteResult.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="Tricentis.DistributionServer.ServiceInterface.Services", name="pollCiTestEventsResultsRequest", scope=PollCiTestEventsResults.class)
/*     */   public JAXBElement<PollCiTestEventsResultsRequest> createPollCiTestEventsResultsPollCiTestEventsResultsRequest(PollCiTestEventsResultsRequest value)
/*     */   {
/* 286 */     return new JAXBElement(_PollCiTestEventsResultsPollCiTestEventsResultsRequest_QNAME, PollCiTestEventsResultsRequest.class, PollCiTestEventsResults.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="Tricentis.DistributionServer.ServiceInterface.Services", name="GetCloudResultContainerResult", scope=GetCloudResultContainerResponse.class)
/*     */   public JAXBElement<GetCloudResultResponse> createGetCloudResultContainerResponseGetCloudResultContainerResult(GetCloudResultResponse value)
/*     */   {
/* 295 */     return new JAXBElement(_GetCloudResultContainerResponseGetCloudResultContainerResult_QNAME, GetCloudResultResponse.class, GetCloudResultContainerResponse.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="Tricentis.DistributionServer.ServiceInterface.Services", name="ldapString", scope=Register.class)
/*     */   public JAXBElement<String> createRegisterLdapString(String value)
/*     */   {
/* 304 */     return new JAXBElement(_RegisterLdapString_QNAME, String.class, Register.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="Tricentis.DistributionServer.ServiceInterface.Services", name="GetConfigurationParametersResult", scope=GetConfigurationParametersResponse.class)
/*     */   public JAXBElement<TestConfigurationParameterCollection> createGetConfigurationParametersResponseGetConfigurationParametersResult(TestConfigurationParameterCollection value)
/*     */   {
/* 313 */     return new JAXBElement(_GetConfigurationParametersResponseGetConfigurationParametersResult_QNAME, TestConfigurationParameterCollection.class, GetConfigurationParametersResponse.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="Tricentis.DistributionServer.ServiceInterface.Services", name="RegisterResult", scope=RegisterResponse.class)
/*     */   public JAXBElement<RegistrationResponse> createRegisterResponseRegisterResult(RegistrationResponse value)
/*     */   {
/* 322 */     return new JAXBElement(_RegisterResponseRegisterResult_QNAME, RegistrationResponse.class, RegisterResponse.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="Tricentis.DistributionServer.ServiceInterface.Services", name="distributeCiTestEventsRequest", scope=DistributeCiTestEvents.class)
/*     */   public JAXBElement<DistributeCiTestEventsRequest> createDistributeCiTestEventsDistributeCiTestEventsRequest(DistributeCiTestEventsRequest value)
/*     */   {
/* 331 */     return new JAXBElement(_DistributeCiTestEventsDistributeCiTestEventsRequest_QNAME, DistributeCiTestEventsRequest.class, DistributeCiTestEvents.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="Tricentis.DistributionServer.ServiceInterface.Services", name="eventId", scope=GetCloudResultContainer.class)
/*     */   public JAXBElement<GetCloudResultRequest> createGetCloudResultContainerEventId(GetCloudResultRequest value)
/*     */   {
/* 340 */     return new JAXBElement(_GetCloudResultContainerEventId_QNAME, GetCloudResultRequest.class, GetCloudResultContainer.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="Tricentis.DistributionServer.ServiceInterface.Services", name="cancelCiTestEventsRequest", scope=CancelCiTestEvents.class)
/*     */   public JAXBElement<CancelCiTestEventsRequest> createCancelCiTestEventsCancelCiTestEventsRequest(CancelCiTestEventsRequest value)
/*     */   {
/* 349 */     return new JAXBElement(_CancelCiTestEventsCancelCiTestEventsRequest_QNAME, CancelCiTestEventsRequest.class, CancelCiTestEvents.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="Tricentis.DistributionServer.ServiceInterface.Services", name="distributeCloudRequest", scope=DistributeOnTestbirds.class)
/*     */   public JAXBElement<DistributeCloudRequest> createDistributeOnTestbirdsDistributeCloudRequest(DistributeCloudRequest value)
/*     */   {
/* 358 */     return new JAXBElement(_DistributeInCloudDistributeCloudRequest_QNAME, DistributeCloudRequest.class, DistributeOnTestbirds.class, value);
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\services\serviceinterface\distributionserver\tricentis\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */