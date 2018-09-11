/*     */ package org.datacontract.schemas._2004._07.tricentis;
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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="RdpConfiguration", propOrder={"agentUrl", "password", "useRdpConnection", "username"})
/*     */ public class RdpConfiguration
/*     */ {
/*     */   @XmlElementRef(name="AgentUrl", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> agentUrl;
/*     */   @XmlElementRef(name="Password", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> password;
/*     */   @XmlElement(name="UseRdpConnection")
/*     */   protected Boolean useRdpConnection;
/*     */   @XmlElementRef(name="Username", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> username;
/*     */   
/*     */   public JAXBElement<String> getAgentUrl()
/*     */   {
/*  61 */     return this.agentUrl;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAgentUrl(JAXBElement<String> value)
/*     */   {
/*  73 */     this.agentUrl = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getPassword()
/*     */   {
/*  85 */     return this.password;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPassword(JAXBElement<String> value)
/*     */   {
/*  97 */     this.password = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isUseRdpConnection()
/*     */   {
/* 109 */     return this.useRdpConnection;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUseRdpConnection(Boolean value)
/*     */   {
/* 121 */     this.useRdpConnection = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getUsername()
/*     */   {
/* 133 */     return this.username;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsername(JAXBElement<String> value)
/*     */   {
/* 145 */     this.username = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis\RdpConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */