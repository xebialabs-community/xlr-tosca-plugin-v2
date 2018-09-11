/*    */ package org.datacontract.schemas._2004._07.tricentis;
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
/*    */ @XmlType(name="ResultLocation")
/*    */ @XmlEnum
/*    */ public enum ResultLocation
/*    */ {
/* 28 */   SERVER("Server"), 
/*    */   
/* 30 */   AGENT("Agent");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   private ResultLocation(String v) {
/* 35 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 39 */     return this.value;
/*    */   }
/*    */   
/*    */   public static ResultLocation fromValue(String v) {
/* 43 */     for (ResultLocation c : ) {
/* 44 */       if (c.value.equals(v)) {
/* 45 */         return c;
/*    */       }
/*    */     }
/* 48 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis\ResultLocation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */