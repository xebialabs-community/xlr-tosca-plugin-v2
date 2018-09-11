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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="DistributeRequestDetails", propOrder={"execListName", "execListSurrugate", "testConfigurationParameter"})
/*     */ public class DistributeRequestDetails
/*     */ {
/*     */   @XmlElementRef(name="ExecListName", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> execListName;
/*     */   @XmlElementRef(name="ExecListSurrugate", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> execListSurrugate;
/*     */   @XmlElementRef(name="TestConfigurationParameter", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<ArrayOfTestConfigurationParameter> testConfigurationParameter;
/*     */   
/*     */   public JAXBElement<String> getExecListName()
/*     */   {
/*  57 */     return this.execListName;
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
/*  69 */     this.execListName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getExecListSurrugate()
/*     */   {
/*  81 */     return this.execListSurrugate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setExecListSurrugate(JAXBElement<String> value)
/*     */   {
/*  93 */     this.execListSurrugate = value;
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
/* 105 */     return this.testConfigurationParameter;
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
/* 117 */     this.testConfigurationParameter = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\DistributeRequestDetails.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */