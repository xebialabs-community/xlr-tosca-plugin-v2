/*     */ package com.tricentis.continuousintegration.toscacixecution.utils;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.io.StringReader;
/*     */ import java.io.StringWriter;
/*     */ import java.security.MessageDigest;
/*     */ import java.util.GregorianCalendar;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import javax.xml.bind.JAXBContext;
/*     */ import javax.xml.bind.Marshaller;
/*     */ import javax.xml.datatype.DatatypeConfigurationException;
/*     */ import javax.xml.datatype.DatatypeFactory;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ import javax.xml.parsers.DocumentBuilder;
/*     */ import javax.xml.parsers.DocumentBuilderFactory;
/*     */ import javax.xml.parsers.ParserConfigurationException;
/*     */ import org.w3c.dom.Document;
/*     */ import org.xml.sax.InputSource;
/*     */ import org.xml.sax.SAXException;
/*     */ 
/*     */ public final class Util
/*     */ {
/*     */   private static final String SALT = "olaio345!fa65zs7v5ke9%37fjis2jh35vfslan7h$v56e9jk902vk";
/*     */   
/*     */   public static <T> Document CreateXmlFromTypedTestResult(T testResultRootNode) throws javax.xml.bind.JAXBException
/*     */   {
/*  30 */     System.out.println("Serializing TestResult to XML Document. TestResult Type is: " + testResultRootNode.getClass().getName());
/*     */     
/*  32 */     if (testResultRootNode != null) {
/*     */       try {
/*  34 */         StringWriter writer = new StringWriter();
/*  35 */         JAXBContext context = JAXBContext.newInstance(new Class[] { testResultRootNode.getClass() });
/*  36 */         Marshaller m = context.createMarshaller();
/*  37 */         m.marshal(testResultRootNode, writer);
/*     */         
/*  39 */         DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
/*  40 */         DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
/*  41 */         return builder.parse(new InputSource(new StringReader(writer.getBuffer().toString())));
/*     */       }
/*     */       catch (SAXException|IOException|ParserConfigurationException ex)
/*     */       {
/*  45 */         System.err.println(ex);
/*     */       }
/*     */     }
/*  48 */     return null;
/*     */   }
/*     */   
/*     */   public static boolean IsNullOrEmpty(String value) {
/*  52 */     if (value != null) {
/*  53 */       return value.length() == 0;
/*     */     }
/*     */     
/*  56 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean IsNullOrWhiteSpace(String value) {
/*  60 */     if (value != null) {
/*  61 */       String cleanValue = value.replaceAll("\\s", "");
/*  62 */       return IsNullOrEmpty(cleanValue);
/*     */     }
/*     */     
/*  65 */     return true;
/*     */   }
/*     */   
/*     */   public static String sha256(String base) throws Exception {
/*  69 */     String textToEncrypt = "olaio345!fa65zs7v5ke9%37fjis2jh35vfslan7h$v56e9jk902vk" + base;
/*  70 */     MessageDigest md = MessageDigest.getInstance("SHA-256");
/*  71 */     md.update(textToEncrypt.getBytes("UTF-8"));
/*  72 */     byte[] byteData = md.digest();
/*  73 */     StringBuilder hexString = new StringBuilder();
/*     */     
/*  75 */     for (int i = 0; i < byteData.length; i++) {
/*  76 */       String hex = Integer.toHexString(0xFF & byteData[i]);
/*  77 */       if (hex.length() == 1) {
/*  78 */         hexString.append('0');
/*     */       }
/*  80 */       hexString.append(hex);
/*     */     }
/*     */     
/*  83 */     return hexString.toString();
/*     */   }
/*     */   
/*     */   public static String CleanInvalidXmlCharacters(String resultString) {
/*  87 */     String xml11pattern = "[^\001-퟿-�𐀀-􏿿]+";
/*  88 */     return resultString.replaceAll(xml11pattern, "");
/*     */   }
/*     */   
/*     */   public static XMLGregorianCalendar getXMLGregorianCalendarNow() throws DatatypeConfigurationException {
/*  92 */     GregorianCalendar gregorianCalendar = new GregorianCalendar();
/*  93 */     DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
/*  94 */     XMLGregorianCalendar now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
/*  95 */     return now;
/*     */   }
/*     */   
/*     */   public static String expandEnvironmentVariables(String path) {
/*  99 */     if (OsUtils.containsEnvironmentChars(path)) {
/* 100 */       Pattern pattern = Pattern.compile(OsUtils.getEnvironmentVarPattern());
/* 101 */       Matcher matcher = pattern.matcher(path);
/*     */       
/* 103 */       while (matcher.find()) {
/* 104 */         String found = matcher.group(0);
/* 105 */         String environmentVariable = OsUtils.getEnvironmentVariable(found);
/* 106 */         path = path.replace(found, environmentVariable);
/* 107 */         matcher.reset(path);
/*     */       }
/*     */     }
/* 110 */     return path.replace("\\", File.separator).replace("\\\\", File.separator);
/*     */   }
/*     */   
/*     */   public static String getDefaultPathToResultFile() {
/*     */     try {
/* 115 */       return (OsUtils.getTempDir() + "\\TOSCACIClientResult.xml").replace("\\", File.separator).replace("\\\\", File.separator);
/*     */     } catch (SecurityException e) {
/* 117 */       System.err.println("recieving the systems temp path threw an exception: " + e.getMessage()); }
/* 118 */     return "";
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacixecution\utils\Util.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */