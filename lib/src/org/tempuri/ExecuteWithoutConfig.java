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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"usernameHash", "passwordHash", "resultType"})
/*     */ @XmlRootElement(name="ExecuteWithoutConfig")
/*     */ public class ExecuteWithoutConfig
/*     */ {
/*     */   @XmlElementRef(name="usernameHash", namespace="http://tempuri.org/", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> usernameHash;
/*     */   @XmlElementRef(name="passwordHash", namespace="http://tempuri.org/", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> passwordHash;
/*     */   @XmlElementRef(name="resultType", namespace="http://tempuri.org/", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> resultType;
/*     */   
/*     */   public JAXBElement<String> getUsernameHash()
/*     */   {
/*  58 */     return this.usernameHash;
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
/*  70 */     this.usernameHash = value;
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
/*  82 */     return this.passwordHash;
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
/*  94 */     this.passwordHash = value;
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
/* 106 */     return this.resultType;
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
/* 118 */     this.resultType = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\tempuri\ExecuteWithoutConfig.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */