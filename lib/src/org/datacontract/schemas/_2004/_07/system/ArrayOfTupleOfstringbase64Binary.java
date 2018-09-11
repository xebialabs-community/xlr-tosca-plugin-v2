/*    */ package org.datacontract.schemas._2004._07.system;
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
/*    */ @XmlType(name="ArrayOfTupleOfstringbase64Binary", propOrder={"tupleOfstringbase64Binary"})
/*    */ public class ArrayOfTupleOfstringbase64Binary
/*    */ {
/*    */   @XmlElement(name="TupleOfstringbase64Binary", nillable=true)
/*    */   protected List<TupleOfstringbase64Binary> tupleOfstringbase64Binary;
/*    */   
/*    */   public List<TupleOfstringbase64Binary> getTupleOfstringbase64Binary()
/*    */   {
/* 63 */     if (this.tupleOfstringbase64Binary == null) {
/* 64 */       this.tupleOfstringbase64Binary = new ArrayList();
/*    */     }
/* 66 */     return this.tupleOfstringbase64Binary;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\system\ArrayOfTupleOfstringbase64Binary.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */