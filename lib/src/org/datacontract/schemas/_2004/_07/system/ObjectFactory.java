/*    */ package org.datacontract.schemas._2004._07.system;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlElementDecl;
/*    */ import javax.xml.bind.annotation.XmlRegistry;
/*    */ import javax.xml.namespace.QName;
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
/*    */ @XmlRegistry
/*    */ public class ObjectFactory
/*    */ {
/* 27 */   private static final QName _TupleOfstringbase64Binary_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "TupleOfstringbase64Binary");
/* 28 */   private static final QName _ArrayOfTupleOfstringbase64Binary_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "ArrayOfTupleOfstringbase64Binary");
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
/*    */   public ArrayOfTupleOfstringbase64Binary createArrayOfTupleOfstringbase64Binary()
/*    */   {
/* 42 */     return new ArrayOfTupleOfstringbase64Binary();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public TupleOfstringbase64Binary createTupleOfstringbase64Binary()
/*    */   {
/* 50 */     return new TupleOfstringbase64Binary();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/System", name="TupleOfstringbase64Binary")
/*    */   public JAXBElement<TupleOfstringbase64Binary> createTupleOfstringbase64Binary(TupleOfstringbase64Binary value)
/*    */   {
/* 59 */     return new JAXBElement(_TupleOfstringbase64Binary_QNAME, TupleOfstringbase64Binary.class, null, value);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/System", name="ArrayOfTupleOfstringbase64Binary")
/*    */   public JAXBElement<ArrayOfTupleOfstringbase64Binary> createArrayOfTupleOfstringbase64Binary(ArrayOfTupleOfstringbase64Binary value)
/*    */   {
/* 68 */     return new JAXBElement(_ArrayOfTupleOfstringbase64Binary_QNAME, ArrayOfTupleOfstringbase64Binary.class, null, value);
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\system\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */