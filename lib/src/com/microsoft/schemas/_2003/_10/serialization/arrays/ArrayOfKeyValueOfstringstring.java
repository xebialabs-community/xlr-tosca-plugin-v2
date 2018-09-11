/*     */ package com.microsoft.schemas._2003._10.serialization.arrays;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ArrayOfKeyValueOfstringstring", propOrder={"keyValueOfstringstring"})
/*     */ public class ArrayOfKeyValueOfstringstring
/*     */ {
/*     */   @XmlElement(name="KeyValueOfstringstring")
/*     */   protected List<KeyValueOfstringstring> keyValueOfstringstring;
/*     */   
/*     */   public List<KeyValueOfstringstring> getKeyValueOfstringstring()
/*     */   {
/*  74 */     if (this.keyValueOfstringstring == null) {
/*  75 */       this.keyValueOfstringstring = new ArrayList();
/*     */     }
/*  77 */     return this.keyValueOfstringstring;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"key", "value"})
/*     */   public static class KeyValueOfstringstring
/*     */   {
/*     */     @XmlElement(name="Key", required=true, nillable=true)
/*     */     protected String key;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     @XmlElement(name="Value", required=true, nillable=true)
/*     */     protected String value;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public String getKey()
/*     */     {
/* 122 */       return this.key;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public void setKey(String value)
/*     */     {
/* 134 */       this.key = value;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public String getValue()
/*     */     {
/* 146 */       return this.value;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public void setValue(String value)
/*     */     {
/* 158 */       this.value = value;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\microsoft\schemas\_2003\_10\serialization\arrays\ArrayOfKeyValueOfstringstring.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */