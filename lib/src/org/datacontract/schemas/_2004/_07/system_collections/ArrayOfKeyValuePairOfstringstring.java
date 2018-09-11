/*    */ package org.datacontract.schemas._2004._07.system_collections;
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
/*    */ @XmlType(name="ArrayOfKeyValuePairOfstringstring", propOrder={"keyValuePairOfstringstring"})
/*    */ public class ArrayOfKeyValuePairOfstringstring
/*    */ {
/*    */   @XmlElement(name="KeyValuePairOfstringstring")
/*    */   protected List<KeyValuePairOfstringstring> keyValuePairOfstringstring;
/*    */   
/*    */   public List<KeyValuePairOfstringstring> getKeyValuePairOfstringstring()
/*    */   {
/* 63 */     if (this.keyValuePairOfstringstring == null) {
/* 64 */       this.keyValuePairOfstringstring = new ArrayList();
/*    */     }
/* 66 */     return this.keyValuePairOfstringstring;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\system_collections\ArrayOfKeyValuePairOfstringstring.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */