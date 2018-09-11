/*    */ package org.tempuri;
/*    */ 
/*    */ import com.tricentis.continuousintegration.toscacijavaclient.ClientProperties;
/*    */ import java.net.MalformedURLException;
/*    */ import java.net.URL;
/*    */ import javax.xml.namespace.QName;
/*    */ import javax.xml.ws.Service;
/*    */ import javax.xml.ws.WebEndpoint;
/*    */ import javax.xml.ws.WebServiceClient;
/*    */ import javax.xml.ws.WebServiceException;
/*    */ import javax.xml.ws.WebServiceFeature;
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
/*    */ @WebServiceClient(name="RemoteExecutionService", targetNamespace="http://tempuri.org/", wsdlLocation="http://localhost:8732/TOSCARemoteExecutionService/?wsdl")
/*    */ public class RemoteExecutionService
/*    */   extends Service
/*    */ {
/*    */   private static final URL REMOTEEXECUTIONSERVICE_WSDL_LOCATION;
/*    */   private static final WebServiceException REMOTEEXECUTIONSERVICE_EXCEPTION;
/* 28 */   private static final QName REMOTEEXECUTIONSERVICE_QNAME = new QName("http://tempuri.org/", "RemoteExecutionService");
/*    */   
/*    */   static {
/* 31 */     URL url = null;
/* 32 */     WebServiceException e = null;
/*    */     try {
/* 34 */       url = new URL(ClientProperties.getAddress() + "?wsdl");
/*    */     } catch (MalformedURLException ex) {
/* 36 */       e = new WebServiceException(ex);
/*    */     }
/* 38 */     REMOTEEXECUTIONSERVICE_WSDL_LOCATION = url;
/* 39 */     REMOTEEXECUTIONSERVICE_EXCEPTION = e;
/*    */   }
/*    */   
/*    */   public RemoteExecutionService() {
/* 43 */     super(__getWsdlLocation(), REMOTEEXECUTIONSERVICE_QNAME);
/*    */   }
/*    */   
/*    */   public RemoteExecutionService(WebServiceFeature... features) {
/* 47 */     super(__getWsdlLocation(), REMOTEEXECUTIONSERVICE_QNAME, features);
/*    */   }
/*    */   
/*    */   public RemoteExecutionService(URL wsdlLocation) {
/* 51 */     super(wsdlLocation, REMOTEEXECUTIONSERVICE_QNAME);
/*    */   }
/*    */   
/*    */   public RemoteExecutionService(URL wsdlLocation, WebServiceFeature... features) {
/* 55 */     super(wsdlLocation, REMOTEEXECUTIONSERVICE_QNAME, features);
/*    */   }
/*    */   
/*    */   public RemoteExecutionService(URL wsdlLocation, QName serviceName) {
/* 59 */     super(wsdlLocation, serviceName);
/*    */   }
/*    */   
/*    */   public RemoteExecutionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
/* 63 */     super(wsdlLocation, serviceName, features);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @WebEndpoint(name="BasicHttpBinding_IRemoteExecutionService")
/*    */   public IRemoteExecutionService getBasicHttpBindingIRemoteExecutionService()
/*    */   {
/* 73 */     return (IRemoteExecutionService)super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IRemoteExecutionService"), IRemoteExecutionService.class);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @WebEndpoint(name="BasicHttpBinding_IRemoteExecutionService")
/*    */   public IRemoteExecutionService getBasicHttpBindingIRemoteExecutionService(WebServiceFeature... features)
/*    */   {
/* 85 */     return (IRemoteExecutionService)super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IRemoteExecutionService"), IRemoteExecutionService.class, features);
/*    */   }
/*    */   
/*    */   private static URL __getWsdlLocation() {
/* 89 */     if (REMOTEEXECUTIONSERVICE_EXCEPTION != null) {
/* 90 */       throw REMOTEEXECUTIONSERVICE_EXCEPTION;
/*    */     }
/* 92 */     return REMOTEEXECUTIONSERVICE_WSDL_LOCATION;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\tempuri\RemoteExecutionService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */