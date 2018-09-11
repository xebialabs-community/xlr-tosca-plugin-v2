/*    */ package org.datacontract.schemas._2004._07.toscacontinuousintegration_toscaciremoteexecutionservice;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlElementDecl;
/*    */ import javax.xml.bind.annotation.XmlRegistry;
/*    */ import javax.xml.namespace.QName;
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
/*    */ @XmlRegistry
/*    */ public class ObjectFactory
/*    */ {
/* 27 */   private static final QName _ServiceFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/TOSCAContinuousIntegration.TOSCACIRemoteExecutionService.Service", "ServiceFault");
/* 28 */   private static final QName _ServiceFaultMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/TOSCAContinuousIntegration.TOSCACIRemoteExecutionService.Service", "Message");
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
/*    */   public ServiceFault createServiceFault()
/*    */   {
/* 42 */     return new ServiceFault();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/TOSCAContinuousIntegration.TOSCACIRemoteExecutionService.Service", name="ServiceFault")
/*    */   public JAXBElement<ServiceFault> createServiceFault(ServiceFault value)
/*    */   {
/* 51 */     return new JAXBElement(_ServiceFault_QNAME, ServiceFault.class, null, value);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/TOSCAContinuousIntegration.TOSCACIRemoteExecutionService.Service", name="Message", scope=ServiceFault.class)
/*    */   public JAXBElement<String> createServiceFaultMessage(String value)
/*    */   {
/* 60 */     return new JAXBElement(_ServiceFaultMessage_QNAME, String.class, ServiceFault.class, value);
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\toscacontinuousintegration_toscaciremoteexecutionservice\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */