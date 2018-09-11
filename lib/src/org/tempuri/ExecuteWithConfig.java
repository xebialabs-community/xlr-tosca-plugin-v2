/*     */ package org.tempuri;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElementRef;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"usernameHash", "passwordHash", "config", "resultType"})
/*     */ @XmlRootElement(name="ExecuteWithConfig")
/*     */ public class ExecuteWithConfig
/*     */ {
/*     */   @XmlElementRef(name="usernameHash", namespace="http://tempuri.org/", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> usernameHash;
/*     */   @XmlElementRef(name="passwordHash", namespace="http://tempuri.org/", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> passwordHash;
/*     */   @XmlElementRef(name="config", namespace="http://tempuri.org/", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> config;
/*     */   @XmlElementRef(name="resultType", namespace="http://tempuri.org/", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> resultType;
/*     */   
/*     */   public JAXBElement<String> getUsernameHash()
/*     */   {
/*  62 */     return this.usernameHash;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsernameHash(JAXBElement<String> value)
/*     */   {
/*  74 */     this.usernameHash = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getPasswordHash()
/*     */   {
/*  86 */     return this.passwordHash;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPasswordHash(JAXBElement<String> value)
/*     */   {
/*  98 */     this.passwordHash = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getConfig()
/*     */   {
/* 110 */     return this.config;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConfig(JAXBElement<String> value)
/*     */   {
/* 122 */     this.config = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getResultType()
/*     */   {
/* 134 */     return this.resultType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResultType(JAXBElement<String> value)
/*     */   {
/* 146 */     this.resultType = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\tempuri\ExecuteWithConfig.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */