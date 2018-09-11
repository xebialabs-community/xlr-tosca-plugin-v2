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
/*    */ @XmlType(name="DistributionItemState", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.Server")
/*    */ @XmlEnum
/*    */ public enum DistributionItemState
/*    */ {
/* 32 */   NOT_STARTED("NotStarted"), 
/*    */   
/* 34 */   FINISHED("Finished"), 
/*    */   
/* 36 */   RUNNING("Running"), 
/*    */   
/* 38 */   ERROR("Error"), 
/*    */   
/* 40 */   CANCELING("Canceling"), 
/*    */   
/* 42 */   CANCELED("Canceled");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   private DistributionItemState(String v) {
/* 47 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 51 */     return this.value;
/*    */   }
/*    */   
/*    */   public static DistributionItemState fromValue(String v) {
/* 55 */     for (DistributionItemState c : ) {
/* 56 */       if (c.value.equals(v)) {
/* 57 */         return c;
/*    */       }
/*    */     }
/* 60 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver\DistributionItemState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */