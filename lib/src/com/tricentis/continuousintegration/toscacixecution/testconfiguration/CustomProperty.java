/*    */ package com.tricentis.continuousintegration.toscacixecution.testconfiguration;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ 
/*    */ @XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
/*    */ public class CustomProperty
/*    */ {
/*    */   @javax.xml.bind.annotation.XmlValue
/*    */   private String value;
/*    */   @javax.xml.bind.annotation.XmlAttribute(name="name")
/*    */   private String name;
/*    */   
/*    */   public String getValue() {
/* 14 */     return this.value;
/*    */   }
/*    */   
/*    */   public void setValue(String value) {
/* 18 */     this.value = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public String getName()
/*    */   {
/* 25 */     return this.name;
/*    */   }
/*    */   
/*    */   public void setName(String value) {
/* 29 */     this.name = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacixecution\testconfiguration\CustomProperty.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */