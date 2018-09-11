/*     */ package com.tricentis.continuousintegration.toscacijavaclient;
/*     */ 
/*     */ import com.tricentis.continuousintegration.toscacixecution.utils.Util;
/*     */ 
/*     */ public class Options implements IOptions
/*     */ {
/*     */   public static enum ModeFor {
/*   8 */     local, 
/*   9 */     distributed;
/*     */     
/*     */     private ModeFor() {} }
/*  12 */   private String configPath = "";
/*     */   
/*  14 */   private ModeFor modeFor = ModeFor.local;
/*     */   
/*     */   public Options(String[] args) {
/*  17 */     parseOptions(args);
/*     */   }
/*     */   
/*     */   public String getConfigPath()
/*     */   {
/*  22 */     return this.configPath;
/*     */   }
/*     */   
/*     */   public void setConfigPath(String path)
/*     */   {
/*  27 */     this.configPath = path;
/*     */   }
/*     */   
/*     */   public String getPathToResult()
/*     */   {
/*  32 */     return ClientProperties.getPathToResultFile();
/*     */   }
/*     */   
/*     */   public void setPathToResult(String value)
/*     */   {
/*  37 */     if (!Util.IsNullOrEmpty(value)) {
/*  38 */       ClientProperties.setPathToResultFile(value);
/*     */     }
/*     */   }
/*     */   
/*     */   private void setAuthenticationLogin(String value) {
/*  43 */     if (!Util.IsNullOrEmpty(value)) {
/*  44 */       ClientProperties.setUsername(value);
/*     */     }
/*     */   }
/*     */   
/*     */   public String getAuthenticationLogin() {
/*  49 */     return ClientProperties.getUsername();
/*     */   }
/*     */   
/*     */   private void setResultType(String value) {
/*  53 */     if (!Util.IsNullOrEmpty(value)) {
/*  54 */       ClientProperties.setResultType(value);
/*     */     }
/*     */   }
/*     */   
/*     */   public String getResultType() {
/*  59 */     return ClientProperties.getResultType();
/*     */   }
/*     */   
/*     */   private void setAuthenticationPassword(String value) {
/*  63 */     if (!Util.IsNullOrEmpty(value)) {
/*  64 */       ClientProperties.setPassword(value);
/*     */     }
/*     */   }
/*     */   
/*     */   public String getAuthenticationPassword() {
/*  69 */     return ClientProperties.getPassword();
/*     */   }
/*     */   
/*     */   private void setModeFor(String value) {
/*  73 */     this.modeFor = ModeFor.valueOf(value);
/*     */   }
/*     */   
/*     */   ModeFor getModeFor() {
/*  77 */     return this.modeFor;
/*     */   }
/*     */   
/*     */   public boolean hasConfig()
/*     */   {
/*  82 */     return !Util.IsNullOrEmpty(getConfigPath());
/*     */   }
/*     */   
/*     */   private void parseOptions(String[] args) {
/*  86 */     for (int i = 0; i < args.length; i += 2) {
/*  87 */       if ((args[i].startsWith("-")) && (args[i].length() == 2) && (args.length > i + 1)) {
/*  88 */         setOption(args[i].charAt(1), args[(i + 1)]);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void setOption(char charAt, String value)
/*     */   {
/*  95 */     switch (charAt) {
/*     */     case 'r': 
/*  97 */       setPathToResult(value);
/*  98 */       break;
/*     */     
/*     */     case 'm': 
/* 101 */       setModeFor(value);
/* 102 */       break;
/*     */     
/*     */     case 't': 
/* 105 */       setResultType(value);
/* 106 */       break;
/*     */     
/*     */     case 'c': 
/* 109 */       setConfigPath(value);
/* 110 */       break;
/*     */     
/*     */     case 'l': 
/* 113 */       setAuthenticationLogin(value);
/* 114 */       break;
/*     */     
/*     */     case 'p': 
/* 117 */       setAuthenticationPassword(value);
/* 118 */       break;
/*     */     
/*     */     case 'e': 
/* 121 */       ClientProperties.setAddress(value);
/* 122 */       break;
/*     */     
/*     */     case 'x': 
/* 125 */       ClientProperties.setConsiderExecutionResult(value);
/* 126 */       break;
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */ 
/*     */   public int showUsage()
/*     */   {
/* 134 */     System.out.println("Please use the following options:");
/* 135 */     System.out.println("-m <local | distributed> -c <configuration file path> [-r <result file path>] [-e <endpoint address>] [-l <webservice authentication login>] [-p <webservice authentication password>] [-x <consider result of test execution for client return value>]");
/* 136 */     return -1;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean checkOptions()
/*     */   {
/* 142 */     if (Util.IsNullOrEmpty(ClientProperties.getAddress())) {
/* 143 */       return false;
/*     */     }
/* 145 */     if ((!ClientProperties.getAddress().endsWith("/")) || (!ClientProperties.getAddress().endsWith("\\"))) {
/* 146 */       String refactoredEndpoint = ClientProperties.getAddress().concat("/");
/* 147 */       ClientProperties.setAddress(refactoredEndpoint);
/*     */     }
/*     */     
/* 150 */     if (Util.IsNullOrEmpty(getPathToResult())) {
/* 151 */       return false;
/*     */     }
/*     */     
/* 154 */     return checkResultFilePath();
/*     */   }
/*     */   
/*     */   public boolean checkResultFilePath() {
/* 158 */     java.io.File resultFolder = new java.io.File(getPathToResult()).getParentFile();
/*     */     
/* 160 */     if ((!resultFolder.exists()) && 
/* 161 */       (!resultFolder.mkdirs())) {
/* 162 */       System.out.println("Filepath for >" + getPathToResult() + "< does not exist!");
/* 163 */       return false;
/*     */     }
/*     */     
/*     */ 
/* 167 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacijavaclient\Options.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */