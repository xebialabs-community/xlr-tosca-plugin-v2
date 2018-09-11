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
/*    */ @XmlType(name="TestResult", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.Server")
/*    */ @XmlEnum
/*    */ public enum TestResult
/*    */ {
/* 31 */   PASSED("Passed"), 
/*    */   
/* 33 */   FAILED("Failed"), 
/*    */   
/* 35 */   ERROR("Error"), 
/*    */   
/* 37 */   NO_RESULT("NoResult"), 
/*    */   
/* 39 */   CANCELLED("Cancelled");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   private TestResult(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 48 */     return this.value;
/*    */   }
/*    */   
/*    */   public static TestResult fromValue(String v) {
/* 52 */     for (TestResult c : ) {
/* 53 */       if (c.value.equals(v)) {
/* 54 */         return c;
/*    */       }
/*    */     }
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver\TestResult.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */