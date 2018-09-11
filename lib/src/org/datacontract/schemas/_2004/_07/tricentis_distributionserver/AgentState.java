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
/*    */ 
/*    */ 
/*    */ @XmlType(name="AgentState")
/*    */ @XmlEnum
/*    */ public enum AgentState
/*    */ {
/* 33 */   STARTING("Starting"), 
/*    */   
/* 35 */   IDLE("Idle"), 
/*    */   
/* 37 */   EXECUTING("Executing"), 
/*    */   
/* 39 */   FAILURE("Failure"), 
/*    */   
/* 41 */   EXECUTION_CANCELING("ExecutionCanceling"), 
/*    */   
/* 43 */   PAUSE("Pause"), 
/*    */   
/* 45 */   ABORTING("Aborting");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   private AgentState(String v) {
/* 50 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 54 */     return this.value;
/*    */   }
/*    */   
/*    */   public static AgentState fromValue(String v) {
/* 58 */     for (AgentState c : ) {
/* 59 */       if (c.value.equals(v)) {
/* 60 */         return c;
/*    */       }
/*    */     }
/* 63 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver\AgentState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */