/*     */ package org.datacontract.schemas._2004._07.tricentis;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlElementDecl;
/*     */ import javax.xml.bind.annotation.XmlRegistry;
/*     */ import javax.xml.namespace.QName;
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
/*  27 */   private static final QName _ArrayOfTestConfigurationParameterValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "ArrayOfTestConfigurationParameterValue");
/*  28 */   private static final QName _TestConfigurationParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "TestConfigurationParameter");
/*  29 */   private static final QName _TestConfigurationParameterValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "TestConfigurationParameterValue");
/*  30 */   private static final QName _RdpConfiguration_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "RdpConfiguration");
/*  31 */   private static final QName _CloudResultContainer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "CloudResultContainer");
/*  32 */   private static final QName _ResultLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "ResultLocation");
/*  33 */   private static final QName _TestConfigurationParameterCollection_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "TestConfigurationParameterCollection");
/*  34 */   private static final QName _ArrayOfTestConfigurationParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "ArrayOfTestConfigurationParameter");
/*  35 */   private static final QName _ArrayOfCloudResultContainer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "ArrayOfCloudResultContainer");
/*  36 */   private static final QName _TestConfigurationParameterValueValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "Value");
/*  37 */   private static final QName _TestConfigurationParameterCurrentValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "CurrentValue");
/*  38 */   private static final QName _TestConfigurationParameterName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "Name");
/*  39 */   private static final QName _TestConfigurationParameterComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "Comment");
/*  40 */   private static final QName _TestConfigurationParameterTestConfigurationParameterValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "TestConfigurationParameterValues");
/*  41 */   private static final QName _RdpConfigurationPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "Password");
/*  42 */   private static final QName _RdpConfigurationAgentUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "AgentUrl");
/*  43 */   private static final QName _RdpConfigurationUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "Username");
/*  44 */   private static final QName _TestConfigurationParameterCollectionTestConfigurationParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", "TestConfigurationParameters");
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
/*     */   public TestConfigurationParameterCollection createTestConfigurationParameterCollection()
/*     */   {
/*  58 */     return new TestConfigurationParameterCollection();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public TestConfigurationParameter createTestConfigurationParameter()
/*     */   {
/*  66 */     return new TestConfigurationParameter();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public RdpConfiguration createRdpConfiguration()
/*     */   {
/*  74 */     return new RdpConfiguration();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayOfTestConfigurationParameterValue createArrayOfTestConfigurationParameterValue()
/*     */   {
/*  82 */     return new ArrayOfTestConfigurationParameterValue();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayOfTestConfigurationParameter createArrayOfTestConfigurationParameter()
/*     */   {
/*  90 */     return new ArrayOfTestConfigurationParameter();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public CloudResultContainer createCloudResultContainer()
/*     */   {
/*  98 */     return new CloudResultContainer();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public TestConfigurationParameterValue createTestConfigurationParameterValue()
/*     */   {
/* 106 */     return new TestConfigurationParameterValue();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayOfCloudResultContainer createArrayOfCloudResultContainer()
/*     */   {
/* 114 */     return new ArrayOfCloudResultContainer();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="ArrayOfTestConfigurationParameterValue")
/*     */   public JAXBElement<ArrayOfTestConfigurationParameterValue> createArrayOfTestConfigurationParameterValue(ArrayOfTestConfigurationParameterValue value)
/*     */   {
/* 123 */     return new JAXBElement(_ArrayOfTestConfigurationParameterValue_QNAME, ArrayOfTestConfigurationParameterValue.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="TestConfigurationParameter")
/*     */   public JAXBElement<TestConfigurationParameter> createTestConfigurationParameter(TestConfigurationParameter value)
/*     */   {
/* 132 */     return new JAXBElement(_TestConfigurationParameter_QNAME, TestConfigurationParameter.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="TestConfigurationParameterValue")
/*     */   public JAXBElement<TestConfigurationParameterValue> createTestConfigurationParameterValue(TestConfigurationParameterValue value)
/*     */   {
/* 141 */     return new JAXBElement(_TestConfigurationParameterValue_QNAME, TestConfigurationParameterValue.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="RdpConfiguration")
/*     */   public JAXBElement<RdpConfiguration> createRdpConfiguration(RdpConfiguration value)
/*     */   {
/* 150 */     return new JAXBElement(_RdpConfiguration_QNAME, RdpConfiguration.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="CloudResultContainer")
/*     */   public JAXBElement<CloudResultContainer> createCloudResultContainer(CloudResultContainer value)
/*     */   {
/* 159 */     return new JAXBElement(_CloudResultContainer_QNAME, CloudResultContainer.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="ResultLocation")
/*     */   public JAXBElement<ResultLocation> createResultLocation(ResultLocation value)
/*     */   {
/* 168 */     return new JAXBElement(_ResultLocation_QNAME, ResultLocation.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="TestConfigurationParameterCollection")
/*     */   public JAXBElement<TestConfigurationParameterCollection> createTestConfigurationParameterCollection(TestConfigurationParameterCollection value)
/*     */   {
/* 177 */     return new JAXBElement(_TestConfigurationParameterCollection_QNAME, TestConfigurationParameterCollection.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="ArrayOfTestConfigurationParameter")
/*     */   public JAXBElement<ArrayOfTestConfigurationParameter> createArrayOfTestConfigurationParameter(ArrayOfTestConfigurationParameter value)
/*     */   {
/* 186 */     return new JAXBElement(_ArrayOfTestConfigurationParameter_QNAME, ArrayOfTestConfigurationParameter.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="ArrayOfCloudResultContainer")
/*     */   public JAXBElement<ArrayOfCloudResultContainer> createArrayOfCloudResultContainer(ArrayOfCloudResultContainer value)
/*     */   {
/* 195 */     return new JAXBElement(_ArrayOfCloudResultContainer_QNAME, ArrayOfCloudResultContainer.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="Value", scope=TestConfigurationParameterValue.class)
/*     */   public JAXBElement<String> createTestConfigurationParameterValueValue(String value)
/*     */   {
/* 204 */     return new JAXBElement(_TestConfigurationParameterValueValue_QNAME, String.class, TestConfigurationParameterValue.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="CurrentValue", scope=TestConfigurationParameter.class)
/*     */   public JAXBElement<String> createTestConfigurationParameterCurrentValue(String value)
/*     */   {
/* 213 */     return new JAXBElement(_TestConfigurationParameterCurrentValue_QNAME, String.class, TestConfigurationParameter.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="Name", scope=TestConfigurationParameter.class)
/*     */   public JAXBElement<String> createTestConfigurationParameterName(String value)
/*     */   {
/* 222 */     return new JAXBElement(_TestConfigurationParameterName_QNAME, String.class, TestConfigurationParameter.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="Comment", scope=TestConfigurationParameter.class)
/*     */   public JAXBElement<String> createTestConfigurationParameterComment(String value)
/*     */   {
/* 231 */     return new JAXBElement(_TestConfigurationParameterComment_QNAME, String.class, TestConfigurationParameter.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="TestConfigurationParameterValues", scope=TestConfigurationParameter.class)
/*     */   public JAXBElement<ArrayOfTestConfigurationParameterValue> createTestConfigurationParameterTestConfigurationParameterValues(ArrayOfTestConfigurationParameterValue value)
/*     */   {
/* 240 */     return new JAXBElement(_TestConfigurationParameterTestConfigurationParameterValues_QNAME, ArrayOfTestConfigurationParameterValue.class, TestConfigurationParameter.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="Password", scope=RdpConfiguration.class)
/*     */   public JAXBElement<String> createRdpConfigurationPassword(String value)
/*     */   {
/* 249 */     return new JAXBElement(_RdpConfigurationPassword_QNAME, String.class, RdpConfiguration.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="AgentUrl", scope=RdpConfiguration.class)
/*     */   public JAXBElement<String> createRdpConfigurationAgentUrl(String value)
/*     */   {
/* 258 */     return new JAXBElement(_RdpConfigurationAgentUrl_QNAME, String.class, RdpConfiguration.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="Username", scope=RdpConfiguration.class)
/*     */   public JAXBElement<String> createRdpConfigurationUsername(String value)
/*     */   {
/* 267 */     return new JAXBElement(_RdpConfigurationUsername_QNAME, String.class, RdpConfiguration.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", name="TestConfigurationParameters", scope=TestConfigurationParameterCollection.class)
/*     */   public JAXBElement<ArrayOfTestConfigurationParameter> createTestConfigurationParameterCollectionTestConfigurationParameters(ArrayOfTestConfigurationParameter value)
/*     */   {
/* 276 */     return new JAXBElement(_TestConfigurationParameterCollectionTestConfigurationParameters_QNAME, ArrayOfTestConfigurationParameter.class, TestConfigurationParameterCollection.class, value);
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */