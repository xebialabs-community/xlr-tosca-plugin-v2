/*    */ package org.datacontract.schemas._2004._07.system_collections;
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
/* 27 */   private static final QName _ArrayOfKeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringstring");
/* 28 */   private static final QName _KeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
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
/*    */   public KeyValuePairOfstringstring createKeyValuePairOfstringstring()
/*    */   {
/* 42 */     return new KeyValuePairOfstringstring();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public ArrayOfKeyValuePairOfstringstring createArrayOfKeyValuePairOfstringstring()
/*    */   {
/* 50 */     return new ArrayOfKeyValuePairOfstringstring();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/System.Collections.Generic", name="ArrayOfKeyValuePairOfstringstring")
/*    */   public JAXBElement<ArrayOfKeyValuePairOfstringstring> createArrayOfKeyValuePairOfstringstring(ArrayOfKeyValuePairOfstringstring value)
/*    */   {
/* 59 */     return new JAXBElement(_ArrayOfKeyValuePairOfstringstring_QNAME, ArrayOfKeyValuePairOfstringstring.class, null, value);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   @XmlElementDecl(namespace="http://schemas.datacontract.org/2004/07/System.Collections.Generic", name="KeyValuePairOfstringstring")
/*    */   public JAXBElement<KeyValuePairOfstringstring> createKeyValuePairOfstringstring(KeyValuePairOfstringstring value)
/*    */   {
/* 68 */     return new JAXBElement(_KeyValuePairOfstringstring_QNAME, KeyValuePairOfstringstring.class, null, value);
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\system_collections\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */