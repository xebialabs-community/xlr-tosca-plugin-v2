/*    */ package org.datacontract.schemas._2004._07.system;
/*    */ 
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
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="TupleOfstringbase64Binary", propOrder={"mItem1", "mItem2"})
/*    */ public class TupleOfstringbase64Binary
/*    */ {
/*    */   @XmlElement(name="m_Item1", required=true, nillable=true)
/*    */   protected String mItem1;
/*    */   @XmlElement(name="m_Item2", required=true, nillable=true)
/*    */   protected byte[] mItem2;
/*    */   
/*    */   public String getMItem1()
/*    */   {
/* 51 */     return this.mItem1;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setMItem1(String value)
/*    */   {
/* 63 */     this.mItem1 = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public byte[] getMItem2()
/*    */   {
/* 74 */     return this.mItem2;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setMItem2(byte[] value)
/*    */   {
/* 85 */     this.mItem2 = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\system\TupleOfstringbase64Binary.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */