/*    */ package com.microsoft.schemas._2003._10.serialization.arrays;
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
/* 27 */   private static final QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
/* 28 */   private static final QName _ArrayOfKeyValueOfstringstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringstring");
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
/*    */   public ArrayOfKeyValueOfstringstring createArrayOfKeyValueOfstringstring()
/*    */   {
/* 42 */     return new ArrayOfKeyValueOfstringstring();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public ArrayOfstring createArrayOfstring()
/*    */   {
/* 50 */     return new ArrayOfstring();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public ArrayOfKeyValueOfstringstring.KeyValueOfstringstring createArrayOfKeyValueOfstringstringKeyValueOfstringstring()
/*    */   {
/* 58 */     return new ArrayOfKeyValueOfstringstring.KeyValueOfstringstring();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/Arrays", name="ArrayOfstring")
/*    */   public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value)
/*    */   {
/* 67 */     return new JAXBElement(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/Arrays", name="ArrayOfKeyValueOfstringstring")
/*    */   public JAXBElement<ArrayOfKeyValueOfstringstring> createArrayOfKeyValueOfstringstring(ArrayOfKeyValueOfstringstring value)
/*    */   {
/* 76 */     return new JAXBElement(_ArrayOfKeyValueOfstringstring_QNAME, ArrayOfKeyValueOfstringstring.class, null, value);
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\microsoft\schemas\_2003\_10\serialization\arrays\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */