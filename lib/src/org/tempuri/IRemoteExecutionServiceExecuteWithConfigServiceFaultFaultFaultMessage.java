/*    */ package org.tempuri;
/*    */ 
/*    */ import javax.xml.ws.WebFault;
/*    */ import org.datacontract.schemas._2004._07.toscacontinuousintegration_toscaciremoteexecutionservice.ServiceFault;
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
/*    */ @WebFault(name="ServiceFault", targetNamespace="http://schemas.datacontract.org/2004/07/TOSCAContinuousIntegration.TOSCACIRemoteExecutionService.Service")
/*    */ public class IRemoteExecutionServiceExecuteWithConfigServiceFaultFaultFaultMessage
/*    */   extends Exception
/*    */ {
/*    */   private ServiceFault faultInfo;
/*    */   
/*    */   public IRemoteExecutionServiceExecuteWithConfigServiceFaultFaultFaultMessage(String message, ServiceFault faultInfo)
/*    */   {
/* 31 */     super(message);
/* 32 */     this.faultInfo = faultInfo;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public IRemoteExecutionServiceExecuteWithConfigServiceFaultFaultFaultMessage(String message, ServiceFault faultInfo, Throwable cause)
/*    */   {
/* 42 */     super(message, cause);
/* 43 */     this.faultInfo = faultInfo;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public ServiceFault getFaultInfo()
/*    */   {
/* 52 */     return this.faultInfo;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\tempuri\IRemoteExecutionServiceExecuteWithConfigServiceFaultFaultFaultMessage.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */