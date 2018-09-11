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
/*    */ 
/*    */ @WebServiceClient(name="ManagerService", targetNamespace="http://tempuri.org/", wsdlLocation="http://localhost:85/DistributionServerService/Managerservice.svc?wsdl")
/*    */ public class ManagerService
/*    */   extends Service
/*    */ {
/*    */   private static final URL MANAGERSERVICE_WSDL_LOCATION;
/*    */   private static final WebServiceException MANAGERSERVICE_EXCEPTION;
/* 29 */   private static final QName MANAGERSERVICE_QNAME = new QName("http://tempuri.org/", "ManagerService");
/*    */   
/*    */   static {
/* 32 */     URL url = null;
/* 33 */     WebServiceException e = null;
/*    */     try {
/* 35 */       url = new URL(ClientProperties.getAddress() + "?wsdl");
/*    */     } catch (MalformedURLException ex) {
/* 37 */       e = new WebServiceException(ex);
/*    */     }
/* 39 */     MANAGERSERVICE_WSDL_LOCATION = url;
/* 40 */     MANAGERSERVICE_EXCEPTION = e;
/*    */   }
/*    */   
/*    */   public ManagerService() {
/* 44 */     super(__getWsdlLocation(), MANAGERSERVICE_QNAME);
/*    */   }
/*    */   
/*    */   public ManagerService(WebServiceFeature... features) {
/* 48 */     super(__getWsdlLocation(), MANAGERSERVICE_QNAME, features);
/*    */   }
/*    */   
/*    */   public ManagerService(URL wsdlLocation) {
/* 52 */     super(wsdlLocation, MANAGERSERVICE_QNAME);
/*    */   }
/*    */   
/*    */   public ManagerService(URL wsdlLocation, WebServiceFeature... features) {
/* 56 */     super(wsdlLocation, MANAGERSERVICE_QNAME, features);
/*    */   }
/*    */   
/*    */   public ManagerService(URL wsdlLocation, QName serviceName) {
/* 60 */     super(wsdlLocation, serviceName);
/*    */   }
/*    */   
/*    */   public ManagerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
/* 64 */     super(wsdlLocation, serviceName, features);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @WebEndpoint(name="BasicHttpBinding_IManagerService")
/*    */   public IManagerService getBasicHttpBindingIManagerService()
/*    */   {
/* 74 */     return (IManagerService)super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IManagerService"), IManagerService.class);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @WebEndpoint(name="BasicHttpBinding_IManagerService")
/*    */   public IManagerService getBasicHttpBindingIManagerService(WebServiceFeature... features)
/*    */   {
/* 86 */     return (IManagerService)super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IManagerService"), IManagerService.class, features);
/*    */   }
/*    */   
/*    */   private static URL __getWsdlLocation() {
/* 90 */     if (MANAGERSERVICE_EXCEPTION != null) {
/* 91 */       throw MANAGERSERVICE_EXCEPTION;
/*    */     }
/* 93 */     return MANAGERSERVICE_WSDL_LOCATION;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\tempuri\ManagerService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */