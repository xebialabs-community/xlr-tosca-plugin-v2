/*     */ package org.datacontract.schemas._2004._07.tricentis_distributionserver;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlElementRef;
/*     */ import javax.xml.bind.annotation.XmlType;
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
/*     */ @XmlType(name="AgentError", propOrder={"agentErrorType", "errorDetails", "errorMessage"})
/*     */ public class AgentError
/*     */ {
/*     */   @XmlElement(name="AgentErrorType")
/*     */   protected AgentErrorType agentErrorType;
/*     */   @XmlElementRef(name="ErrorDetails", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> errorDetails;
/*     */   @XmlElementRef(name="ErrorMessage", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> errorMessage;
/*     */   
/*     */   public AgentErrorType getAgentErrorType()
/*     */   {
/*  57 */     return this.agentErrorType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAgentErrorType(AgentErrorType value)
/*     */   {
/*  69 */     this.agentErrorType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getErrorDetails()
/*     */   {
/*  81 */     return this.errorDetails;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setErrorDetails(JAXBElement<String> value)
/*     */   {
/*  93 */     this.errorDetails = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getErrorMessage()
/*     */   {
/* 105 */     return this.errorMessage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setErrorMessage(JAXBElement<String> value)
/*     */   {
/* 117 */     this.errorMessage = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver\AgentError.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */