/*     */ package org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElementRef;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.datacontract.schemas._2004._07.tricentis.ArrayOfTestConfigurationParameter;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="DistributeCloudRequestDetails", propOrder={"execListName", "execListSubset", "execListSurrogate", "testConfigurationParameter"})
/*     */ public class DistributeCloudRequestDetails
/*     */ {
/*     */   @XmlElementRef(name="ExecListName", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> execListName;
/*     */   @XmlElementRef(name="ExecListSubset", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<byte[]> execListSubset;
/*     */   @XmlElementRef(name="ExecListSurrogate", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> execListSurrogate;
/*     */   @XmlElementRef(name="TestConfigurationParameter", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<ArrayOfTestConfigurationParameter> testConfigurationParameter;
/*     */   
/*     */   public JAXBElement<String> getExecListName()
/*     */   {
/*  61 */     return this.execListName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setExecListName(JAXBElement<String> value)
/*     */   {
/*  73 */     this.execListName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<byte[]> getExecListSubset()
/*     */   {
/*  85 */     return this.execListSubset;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setExecListSubset(JAXBElement<byte[]> value)
/*     */   {
/*  97 */     this.execListSubset = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getExecListSurrogate()
/*     */   {
/* 109 */     return this.execListSurrogate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setExecListSurrogate(JAXBElement<String> value)
/*     */   {
/* 121 */     this.execListSurrogate = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<ArrayOfTestConfigurationParameter> getTestConfigurationParameter()
/*     */   {
/* 133 */     return this.testConfigurationParameter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTestConfigurationParameter(JAXBElement<ArrayOfTestConfigurationParameter> value)
/*     */   {
/* 145 */     this.testConfigurationParameter = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\DistributeCloudRequestDetails.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */