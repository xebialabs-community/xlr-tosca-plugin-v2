/*    */ package org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="RegistrationResponse", propOrder={"authorizationSuccessful", "logMessage"})
/*    */ public class RegistrationResponse
/*    */ {
/*    */   @XmlElement(name="AuthorizationSuccessful")
/*    */   protected Boolean authorizationSuccessful;
/*    */   @XmlElementRef(name="LogMessage", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<String> logMessage;
/*    */   
/*    */   public Boolean isAuthorizationSuccessful()
/*    */   {
/* 53 */     return this.authorizationSuccessful;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setAuthorizationSuccessful(Boolean value)
/*    */   {
/* 65 */     this.authorizationSuccessful = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public JAXBElement<String> getLogMessage()
/*    */   {
/* 77 */     return this.logMessage;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setLogMessage(JAXBElement<String> value)
/*    */   {
/* 89 */     this.logMessage = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\RegistrationResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */