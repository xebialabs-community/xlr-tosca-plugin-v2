/*    */ package org.datacontract.schemas._2004._07.toscacontinuousintegration_toscaciremoteexecutionservice;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="ServiceFault", propOrder={"message"})
/*    */ public class ServiceFault
/*    */ {
/*    */   @XmlElementRef(name="Message", namespace="http://schemas.datacontract.org/2004/07/TOSCAContinuousIntegration.TOSCACIRemoteExecutionService.Service", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<String> message;
/*    */   
/*    */   public JAXBElement<String> getMessage()
/*    */   {
/* 48 */     return this.message;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setMessage(JAXBElement<String> value)
/*    */   {
/* 60 */     this.message = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\toscacontinuousintegration_toscaciremoteexecutionservice\ServiceFault.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */