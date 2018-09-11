/*     */ package com.tricentis.continuousintegration.toscacijavaclient;
/*     */ 
/*     */ import com.tricentis.continuousintegration.toscacixecution.utils.Util;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.net.URL;
/*     */ import java.net.URLDecoder;
/*     */ import java.util.Properties;
/*     */ 
/*     */ public class ClientProperties
/*     */ {
/*  13 */   private static String address = "http://localhost:8732/TOSCARemoteExecutionService/";
/*  14 */   private static String username = "";
/*  15 */   private static String password = "";
/*  16 */   private static boolean considerExecutionResult = false;
/*  17 */   private static String resultType = "Default";
/*  18 */   private static String pathToResultFile = Util.getDefaultPathToResultFile();
/*  19 */   private static int dexPollingInterval = 300000;
/*  20 */   private static int ciClientTimeout = 10800000;
/*     */   
/*     */   public static void LoadProperties() throws java.io.FileNotFoundException, IOException {
/*  23 */     Properties properties = new Properties();
/*     */     
/*  25 */     File ciClientJarPath = new File(ClientProperties.class.getProtectionDomain().getCodeSource().getLocation().getPath());
/*  26 */     String ciClientParentDirPath = ciClientJarPath.getParentFile().getAbsolutePath();
/*     */     
/*  28 */     File file = new File(URLDecoder.decode(ciClientParentDirPath, "UTF-8") + "/config.properties");
/*  29 */     if ((file.exists()) && (file.isFile()) && (file.canRead()))
/*     */     {
/*  31 */       FileInputStream fileInputStream = new FileInputStream(file);
/*     */       try
/*     */       {
/*  34 */         properties.load(fileInputStream);
/*     */       } catch (NullPointerException e) {
/*  36 */         throw new IOException("Failed to load properties! Make sure that file >config.properties< is available." + e.getStackTrace());
/*     */       }
/*     */       
/*  39 */       setAddress(properties.getProperty("address"));
/*  40 */       setUsername(properties.getProperty("username"));
/*  41 */       setPassword(properties.getProperty("password"));
/*  42 */       setConsiderExecutionResult(properties.getProperty("considerexecutionresult"));
/*  43 */       setResultType(properties.getProperty("resulttype"));
/*  44 */       setPathToResultFile(properties.getProperty("pathtoresultfile"));
/*  45 */       setDexPollingInterval(properties.getProperty("dexpollinginterval"));
/*  46 */       setCiClientTimeout(properties.getProperty("ciclienttimeout"));
/*  47 */       fileInputStream.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setDexPollingInterval(String value) {
/*  52 */     if (!Util.IsNullOrEmpty(value)) {
/*  53 */       dexPollingInterval = Integer.parseInt(value);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int getDexPollingInterval() {
/*  58 */     return dexPollingInterval;
/*     */   }
/*     */   
/*     */   public static void setCiClientTimeout(String value) {
/*  62 */     if (!Util.IsNullOrEmpty(value)) {
/*  63 */       ciClientTimeout = Integer.parseInt(value);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int getCiClientTimeout() {
/*  68 */     return ciClientTimeout;
/*     */   }
/*     */   
/*     */   public static void setResultType(String value) {
/*  72 */     if (!Util.IsNullOrEmpty(value)) {
/*  73 */       resultType = value;
/*     */     }
/*     */   }
/*     */   
/*     */   public static String getResultType() {
/*  78 */     return resultType;
/*     */   }
/*     */   
/*     */   public static void setPathToResultFile(String value) {
/*  82 */     if (!Util.IsNullOrEmpty(value)) {
/*  83 */       pathToResultFile = Util.expandEnvironmentVariables(value);
/*     */     }
/*     */   }
/*     */   
/*     */   public static String getPathToResultFile() {
/*  88 */     return pathToResultFile;
/*     */   }
/*     */   
/*     */   public static void setConsiderExecutionResult(String value) {
/*  92 */     if (!Util.IsNullOrEmpty(value)) {
/*  93 */       considerExecutionResult = Boolean.valueOf(value).booleanValue();
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean getConsiderExecutionResult() {
/*  98 */     return considerExecutionResult;
/*     */   }
/*     */   
/*     */   public static String getAddress() {
/* 102 */     return address;
/*     */   }
/*     */   
/*     */   public static void setAddress(String value) {
/* 106 */     if (!Util.IsNullOrEmpty(value)) {
/* 107 */       address = value;
/*     */     }
/*     */   }
/*     */   
/*     */   public static String getUsername() {
/* 112 */     return username;
/*     */   }
/*     */   
/*     */   public static void setUsername(String value) {
/* 116 */     if (!Util.IsNullOrEmpty(value)) {
/* 117 */       username = value;
/*     */     }
/*     */   }
/*     */   
/*     */   public static String getPassword() {
/* 122 */     return password;
/*     */   }
/*     */   
/*     */   public static void setPassword(String value) {
/* 126 */     if (!Util.IsNullOrEmpty(value)) {
/* 127 */       password = value;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacijavaclient\ClientProperties.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */