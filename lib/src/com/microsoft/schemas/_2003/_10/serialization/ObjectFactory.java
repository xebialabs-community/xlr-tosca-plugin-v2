/*     */ package com.microsoft.schemas._2003._10.serialization;
/*     */ 
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlElementDecl;
/*     */ import javax.xml.bind.annotation.XmlRegistry;
/*     */ import javax.xml.datatype.Duration;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ import javax.xml.namespace.QName;
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
/*     */ @XmlRegistry
/*     */ public class ObjectFactory
/*     */ {
/*  31 */   private static final QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
/*  32 */   private static final QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
/*  33 */   private static final QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
/*  34 */   private static final QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
/*  35 */   private static final QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
/*  36 */   private static final QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
/*  37 */   private static final QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
/*  38 */   private static final QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
/*  39 */   private static final QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
/*  40 */   private static final QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
/*  41 */   private static final QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
/*  42 */   private static final QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
/*  43 */   private static final QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
/*  44 */   private static final QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
/*  45 */   private static final QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
/*  46 */   private static final QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
/*  47 */   private static final QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
/*  48 */   private static final QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
/*  49 */   private static final QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
/*  50 */   private static final QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
/*  51 */   private static final QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
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
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="duration")
/*     */   public JAXBElement<Duration> createDuration(Duration value)
/*     */   {
/*  66 */     return new JAXBElement(_Duration_QNAME, Duration.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="long")
/*     */   public JAXBElement<Long> createLong(Long value)
/*     */   {
/*  75 */     return new JAXBElement(_Long_QNAME, Long.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="dateTime")
/*     */   public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value)
/*     */   {
/*  84 */     return new JAXBElement(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="string")
/*     */   public JAXBElement<String> createString(String value)
/*     */   {
/*  93 */     return new JAXBElement(_String_QNAME, String.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="unsignedInt")
/*     */   public JAXBElement<Long> createUnsignedInt(Long value)
/*     */   {
/* 102 */     return new JAXBElement(_UnsignedInt_QNAME, Long.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="char")
/*     */   public JAXBElement<Integer> createChar(Integer value)
/*     */   {
/* 111 */     return new JAXBElement(_Char_QNAME, Integer.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="short")
/*     */   public JAXBElement<Short> createShort(Short value)
/*     */   {
/* 120 */     return new JAXBElement(_Short_QNAME, Short.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="boolean")
/*     */   public JAXBElement<Boolean> createBoolean(Boolean value)
/*     */   {
/* 129 */     return new JAXBElement(_Boolean_QNAME, Boolean.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="int")
/*     */   public JAXBElement<Integer> createInt(Integer value)
/*     */   {
/* 138 */     return new JAXBElement(_Int_QNAME, Integer.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="QName")
/*     */   public JAXBElement<QName> createQName(QName value)
/*     */   {
/* 147 */     return new JAXBElement(_QName_QNAME, QName.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="unsignedLong")
/*     */   public JAXBElement<BigInteger> createUnsignedLong(BigInteger value)
/*     */   {
/* 156 */     return new JAXBElement(_UnsignedLong_QNAME, BigInteger.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="unsignedByte")
/*     */   public JAXBElement<Short> createUnsignedByte(Short value)
/*     */   {
/* 165 */     return new JAXBElement(_UnsignedByte_QNAME, Short.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="unsignedShort")
/*     */   public JAXBElement<Integer> createUnsignedShort(Integer value)
/*     */   {
/* 174 */     return new JAXBElement(_UnsignedShort_QNAME, Integer.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="float")
/*     */   public JAXBElement<Float> createFloat(Float value)
/*     */   {
/* 183 */     return new JAXBElement(_Float_QNAME, Float.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="anyType")
/*     */   public JAXBElement<Object> createAnyType(Object value)
/*     */   {
/* 192 */     return new JAXBElement(_AnyType_QNAME, Object.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="guid")
/*     */   public JAXBElement<String> createGuid(String value)
/*     */   {
/* 201 */     return new JAXBElement(_Guid_QNAME, String.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="decimal")
/*     */   public JAXBElement<BigDecimal> createDecimal(BigDecimal value)
/*     */   {
/* 210 */     return new JAXBElement(_Decimal_QNAME, BigDecimal.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="base64Binary")
/*     */   public JAXBElement<byte[]> createBase64Binary(byte[] value)
/*     */   {
/* 219 */     return new JAXBElement(_Base64Binary_QNAME, byte[].class, null, (byte[])value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="anyURI")
/*     */   public JAXBElement<String> createAnyURI(String value)
/*     */   {
/* 228 */     return new JAXBElement(_AnyURI_QNAME, String.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="byte")
/*     */   public JAXBElement<Byte> createByte(Byte value)
/*     */   {
/* 237 */     return new JAXBElement(_Byte_QNAME, Byte.class, null, value);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @XmlElementDecl(namespace="http://schemas.microsoft.com/2003/10/Serialization/", name="double")
/*     */   public JAXBElement<Double> createDouble(Double value)
/*     */   {
/* 246 */     return new JAXBElement(_Double_QNAME, Double.class, null, value);
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\microsoft\schemas\_2003\_10\serialization\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */