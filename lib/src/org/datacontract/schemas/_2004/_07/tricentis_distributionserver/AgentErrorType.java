/*    */ package org.datacontract.schemas._2004._07.tricentis_distributionserver;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
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
/*    */ @XmlType(name="AgentErrorType")
/*    */ @XmlEnum
/*    */ public enum AgentErrorType
/*    */ {
/* 31 */   AGENT_ERROR("AgentError"), 
/*    */   
/* 33 */   OBJECT_NOT_FOUND("ObjectNotFound"), 
/*    */   
/* 35 */   OBJECT_ALREADY_CHECKED_OUT("ObjectAlreadyCheckedOut"), 
/*    */   
/* 37 */   UNKNOWN("Unknown"), 
/*    */   
/* 39 */   UNAUTHORIZED("Unauthorized");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   private AgentErrorType(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 48 */     return this.value;
/*    */   }
/*    */   
/*    */   public static AgentErrorType fromValue(String v) {
/* 52 */     for (AgentErrorType c : ) {
/* 53 */       if (c.value.equals(v)) {
/* 54 */         return c;
/*    */       }
/*    */     }
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver\AgentErrorType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */