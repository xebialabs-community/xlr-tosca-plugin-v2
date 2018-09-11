/*    */ package org.datacontract.schemas._2004._07.system_collections;
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
/*    */ @XmlType(name="KeyValuePairOfstringstring", propOrder={"key", "value"})
/*    */ public class KeyValuePairOfstringstring
/*    */ {
/*    */   @XmlElement(required=true, nillable=true)
/*    */   protected String key;
/*    */   @XmlElement(required=true, nillable=true)
/*    */   protected String value;
/*    */   
/*    */   public String getKey()
/*    */   {
/* 51 */     return this.key;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setKey(String value)
/*    */   {
/* 63 */     this.key = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String getValue()
/*    */   {
/* 75 */     return this.value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setValue(String value)
/*    */   {
/* 87 */     this.value = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\system_collections\KeyValuePairOfstringstring.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */