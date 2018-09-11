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
/*    */ @XmlType(name="DistributionEventState", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.Server")
/*    */ @XmlEnum
/*    */ public enum DistributionEventState
/*    */ {
/* 31 */   QUEUED("Queued"), 
/*    */   
/* 33 */   RUNNING("Running"), 
/*    */   
/* 35 */   FINISHED("Finished"), 
/*    */   
/* 37 */   CANCELING("Canceling"), 
/*    */   
/* 39 */   CANCELED("Canceled");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   private DistributionEventState(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 48 */     return this.value;
/*    */   }
/*    */   
/*    */   public static DistributionEventState fromValue(String v) {
/* 52 */     for (DistributionEventState c : ) {
/* 53 */       if (c.value.equals(v)) {
/* 54 */         return c;
/*    */       }
/*    */     }
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver\DistributionEventState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */