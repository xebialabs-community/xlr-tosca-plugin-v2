/*    */ package com.tricentis.continuousintegration.toscacixecution.utils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class OsUtils
/*    */ {
/* 10 */   private static String OS = null;
/* 11 */   private static String UserDir = null;
/* 12 */   private static String TempDir = null;
/*    */   
/* 14 */   private static String OS_WINDOWS = "windows";
/* 15 */   private static String OS_OSX = "osx";
/* 16 */   private static String OS_SOLARIS = "solaris";
/* 17 */   private static String OS_LINUX = "linux";
/*    */   
/*    */   public static String getUserDir() {
/* 20 */     if (UserDir == null) {
/* 21 */       UserDir = System.getProperty("user.dir");
/*    */     }
/* 23 */     return UserDir;
/*    */   }
/*    */   
/*    */   public static String getTempDir() {
/* 27 */     if (TempDir == null) {
/* 28 */       TempDir = System.getProperty("java.io.tmpdir");
/*    */     }
/* 30 */     return TempDir;
/*    */   }
/*    */   
/*    */   public static String getOsName() {
/* 34 */     if (OS == null) {
/* 35 */       OS = System.getProperty("os.name").toLowerCase();
/*    */     }
/* 37 */     return OS;
/*    */   }
/*    */   
/*    */   public static boolean isWindows() {
/* 41 */     return getOsName().startsWith(OS_WINDOWS);
/*    */   }
/*    */   
/*    */   public static boolean isLinux() {
/* 45 */     return getOsName().startsWith(OS_LINUX);
/*    */   }
/*    */   
/*    */   public static boolean isSolaris() {
/* 49 */     return getOsName().startsWith(OS_SOLARIS);
/*    */   }
/*    */   
/*    */   public static boolean isOSX() {
/* 53 */     return getOsName().startsWith(OS_OSX);
/*    */   }
/*    */   
/*    */   public static boolean containsEnvironmentChars(String path) {
/* 57 */     return ((isWindows()) && (path.contains("%"))) || ((isLinux()) && (path.contains("$")));
/*    */   }
/*    */   
/*    */   public static String getEnvironmentVarPattern() {
/* 61 */     String pattern = "";
/* 62 */     if (isWindows()) {
/* 63 */       pattern = "%[a-zA-Z0-9_]+%";
/* 64 */     } else if (isLinux()) {
/* 65 */       pattern = "\\$[a-zA-Z0-9_]+";
/*    */     }
/*    */     
/* 68 */     return pattern;
/*    */   }
/*    */   
/*    */   public static String getEnvironmentVariable(String patternMatch) {
/* 72 */     String envVar = patternMatch.toUpperCase();
/* 73 */     if (isWindows()) {
/* 74 */       envVar = envVar.substring(1, envVar.length() - 1);
/* 75 */     } else if (isLinux()) {
/* 76 */       envVar = envVar.substring(1, envVar.length());
/*    */     }
/*    */     
/* 79 */     return System.getenv(envVar);
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacixecution\utils\OsUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */