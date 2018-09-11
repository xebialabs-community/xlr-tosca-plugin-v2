/*     */ package org.tempuri;
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
/*  27 */   private static final QName _ExecuteWithoutConfigResponseExecuteWithoutConfigResult_QNAME = new QName("http://tempuri.org/", "ExecuteWithoutConfigResult");
/*  28 */   private static final QName _ExecuteWithConfigResponseExecuteWithConfigResult_QNAME = new QName("http://tempuri.org/", "ExecuteWithConfigResult");
/*  29 */   private static final QName _ExecuteWithConfigUsernameHash_QNAME = new QName("http://tempuri.org/", "usernameHash");
/*  30 */   private static final QName _ExecuteWithConfigPasswordHash_QNAME = new QName("http://tempuri.org/", "passwordHash");
/*  31 */   private static final QName _ExecuteWithConfigConfig_QNAME = new QName("http://tempuri.org/", "config");
/*  32 */   private static final QName _ExecuteWithConfigResultType_QNAME = new QName("http://tempuri.org/", "resultType");
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
/*     */   public ExecuteWithoutConfigResponse createExecuteWithoutConfigResponse()
/*     */   {
/*  46 */     return new ExecuteWithoutConfigResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ExecuteWithConfig createExecuteWithConfig()
/*     */   {
/*  54 */     return new ExecuteWithConfig();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ExecuteWithConfigResponse createExecuteWithConfigResponse()
/*     */   {
/*  62 */     return new ExecuteWithConfigResponse();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ExecuteWithoutConfig createExecuteWithoutConfig()
/*     */   {
/*  70 */     return new ExecuteWithoutConfig();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://tempuri.org/", name="ExecuteWithoutConfigResult", scope=ExecuteWithoutConfigResponse.class)
/*     */   public JAXBElement<String> createExecuteWithoutConfigResponseExecuteWithoutConfigResult(String value)
/*     */   {
/*  79 */     return new JAXBElement(_ExecuteWithoutConfigResponseExecuteWithoutConfigResult_QNAME, String.class, ExecuteWithoutConfigResponse.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://tempuri.org/", name="ExecuteWithConfigResult", scope=ExecuteWithConfigResponse.class)
/*     */   public JAXBElement<String> createExecuteWithConfigResponseExecuteWithConfigResult(String value)
/*     */   {
/*  88 */     return new JAXBElement(_ExecuteWithConfigResponseExecuteWithConfigResult_QNAME, String.class, ExecuteWithConfigResponse.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://tempuri.org/", name="usernameHash", scope=ExecuteWithConfig.class)
/*     */   public JAXBElement<String> createExecuteWithConfigUsernameHash(String value)
/*     */   {
/*  97 */     return new JAXBElement(_ExecuteWithConfigUsernameHash_QNAME, String.class, ExecuteWithConfig.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://tempuri.org/", name="passwordHash", scope=ExecuteWithConfig.class)
/*     */   public JAXBElement<String> createExecuteWithConfigPasswordHash(String value)
/*     */   {
/* 106 */     return new JAXBElement(_ExecuteWithConfigPasswordHash_QNAME, String.class, ExecuteWithConfig.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://tempuri.org/", name="config", scope=ExecuteWithConfig.class)
/*     */   public JAXBElement<String> createExecuteWithConfigConfig(String value)
/*     */   {
/* 115 */     return new JAXBElement(_ExecuteWithConfigConfig_QNAME, String.class, ExecuteWithConfig.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://tempuri.org/", name="resultType", scope=ExecuteWithConfig.class)
/*     */   public JAXBElement<String> createExecuteWithConfigResultType(String value)
/*     */   {
/* 124 */     return new JAXBElement(_ExecuteWithConfigResultType_QNAME, String.class, ExecuteWithConfig.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://tempuri.org/", name="usernameHash", scope=ExecuteWithoutConfig.class)
/*     */   public JAXBElement<String> createExecuteWithoutConfigUsernameHash(String value)
/*     */   {
/* 133 */     return new JAXBElement(_ExecuteWithConfigUsernameHash_QNAME, String.class, ExecuteWithoutConfig.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://tempuri.org/", name="passwordHash", scope=ExecuteWithoutConfig.class)
/*     */   public JAXBElement<String> createExecuteWithoutConfigPasswordHash(String value)
/*     */   {
/* 142 */     return new JAXBElement(_ExecuteWithConfigPasswordHash_QNAME, String.class, ExecuteWithoutConfig.class, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://tempuri.org/", name="resultType", scope=ExecuteWithoutConfig.class)
/*     */   public JAXBElement<String> createExecuteWithoutConfigResultType(String value)
/*     */   {
/* 151 */     return new JAXBElement(_ExecuteWithConfigResultType_QNAME, String.class, ExecuteWithoutConfig.class, value);
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\tempuri\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */