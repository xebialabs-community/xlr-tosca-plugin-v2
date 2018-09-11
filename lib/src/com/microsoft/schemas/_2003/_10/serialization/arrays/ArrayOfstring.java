/*    */ package com.microsoft.schemas._2003._10.serialization.arrays;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
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
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="ArrayOfstring", propOrder={"string"})
/*    */ public class ArrayOfstring
/*    */ {
/*    */   @XmlElement(nillable=true)
/*    */   protected List<String> string;
/*    */   
/*    */   public List<String> getString()
/*    */   {
/* 63 */     if (this.string == null) {
/* 64 */       this.string = new ArrayList();
/*    */     }
/* 66 */     return this.string;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\microsoft\schemas\_2003\_10\serialization\arrays\ArrayOfstring.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */