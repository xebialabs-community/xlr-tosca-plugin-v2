/*     */ package org.datacontract.schemas._2004._07.tricentis_distributionserver;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlElementDecl;
/*     */ import javax.xml.bind.annotation.XmlRegistry;
/*     */ import javax.xml.namespace.QName;
/*     */ import org.datacontract.schemas._2004._07.tricentis.ArrayOfTestConfigurationParameter;
/*     */ import org.datacontract.schemas._2004._07.tricentis.RdpConfiguration;
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
/*  29 */   private static final QName _TestResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.Server", "TestResult");
/*  30 */   private static final QName _AgentState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", "AgentState");
/*  31 */   private static final QName _ArrayOfAgentInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", "ArrayOfAgentInfo");
/*  32 */   private static final QName _AgentErrorType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", "AgentErrorType");
/*  33 */   private static final QName _DistributionEventState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.Server", "DistributionEventState");
/*  34 */   private static final QName _AgentInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", "AgentInfo");
/*  35 */   private static final QName _AgentError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", "AgentError");
/*  36 */   private static final QName _DistributionItemState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.Server", "DistributionItemState");
/*  37 */   private static final QName _AgentErrorErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", "ErrorMessage");
/*  38 */   private static final QName _AgentErrorErrorDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", "ErrorDetails");
/*  39 */   private static final QName _AgentInfoConfiguration_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", "Configuration");
/*  40 */   private static final QName _AgentInfoRdpConfiguration_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", "RdpConfiguration");
/*  41 */   private static final QName _AgentInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", "Name");
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
/*     */   public ArrayOfAgentInfo createArrayOfAgentInfo()
/*     */   {
/*  55 */     return new ArrayOfAgentInfo();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public AgentError createAgentError()
/*     */   {
/*  63 */     return new AgentError();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public AgentInfo createAgentInfo()
/*     */   {
/*  71 */     return new AgentInfo();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.Server", name="TestResult")
/*     */   public JAXBElement<TestResult> createTestResult(TestResult value)
/*     */   {
/*  80 */     return new JAXBElement(_TestResult_QNAME, TestResult.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", name="AgentState")
/*     */   public JAXBElement<AgentState> createAgentState(AgentState value)
/*     */   {
/*  89 */     return new JAXBElement(_AgentState_QNAME, AgentState.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", name="ArrayOfAgentInfo")
/*     */   public JAXBElement<ArrayOfAgentInfo> createArrayOfAgentInfo(ArrayOfAgentInfo value)
/*     */   {
/*  98 */     return new JAXBElement(_ArrayOfAgentInfo_QNAME, ArrayOfAgentInfo.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", name="AgentErrorType")
/*     */   public JAXBElement<AgentErrorType> createAgentErrorType(AgentErrorType value)
/*     */   {
/* 107 */     return new JAXBElement(_AgentErrorType_QNAME, AgentErrorType.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.Server", name="DistributionEventState")
/*     */   public JAXBElement<DistributionEventState> createDistributionEventState(DistributionEventState value)
/*     */   {
/* 116 */     return new JAXBElement(_DistributionEventState_QNAME, DistributionEventState.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", name="AgentInfo")
/*     */   public JAXBElement<AgentInfo> createAgentInfo(AgentInfo value)
/*     */   {
/* 125 */     return new JAXBElement(_AgentInfo_QNAME, AgentInfo.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", name="AgentError")
/*     */   public JAXBElement<AgentError> createAgentError(AgentError value)
/*     */   {
/* 134 */     return new JAXBElement(_AgentError_QNAME, AgentError.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.Server", name="DistributionItemState")
/*     */   public JAXBElement<DistributionItemState> createDistributionItemState(DistributionItemState value)
/*     */   {
/* 143 */     return new JAXBElement(_DistributionItemState_QNAME, DistributionItemState.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", name="ErrorMessage", scope=AgentError.class)
/*     */   public JAXBElement<String> createAgentErrorErrorMessage(String value)
/*     */   {
/* 152 */     return new JAXBElement(_AgentErrorErrorMessage_QNAME, String.class, AgentError.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", name="ErrorDetails", scope=AgentError.class)
/*     */   public JAXBElement<String> createAgentErrorErrorDetails(String value)
/*     */   {
/* 161 */     return new JAXBElement(_AgentErrorErrorDetails_QNAME, String.class, AgentError.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", name="AgentError", scope=AgentInfo.class)
/*     */   public JAXBElement<AgentError> createAgentInfoAgentError(AgentError value)
/*     */   {
/* 170 */     return new JAXBElement(_AgentError_QNAME, AgentError.class, AgentInfo.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", name="Configuration", scope=AgentInfo.class)
/*     */   public JAXBElement<ArrayOfTestConfigurationParameter> createAgentInfoConfiguration(ArrayOfTestConfigurationParameter value)
/*     */   {
/* 179 */     return new JAXBElement(_AgentInfoConfiguration_QNAME, ArrayOfTestConfigurationParameter.class, AgentInfo.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", name="RdpConfiguration", scope=AgentInfo.class)
/*     */   public JAXBElement<RdpConfiguration> createAgentInfoRdpConfiguration(RdpConfiguration value)
/*     */   {
/* 188 */     return new JAXBElement(_AgentInfoRdpConfiguration_QNAME, RdpConfiguration.class, AgentInfo.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", name="Name", scope=AgentInfo.class)
/*     */   public JAXBElement<String> createAgentInfoName(String value)
/*     */   {
/* 197 */     return new JAXBElement(_AgentInfoName_QNAME, String.class, AgentInfo.class, value);
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */