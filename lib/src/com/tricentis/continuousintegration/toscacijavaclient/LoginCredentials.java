/*    */ package com.tricentis.continuousintegration.toscacijavaclient;
/*    */ 
/*    */ import com.tricentis.continuousintegration.toscacixecution.utils.Util;
/*    */ 
/*    */ public class LoginCredentials {
/*    */   private String username;
/*    */   private String password;
/*  8 */   private String usernameHash = "";
/*  9 */   private String passwordHash = "";
/*    */   
/*    */   public void setUsername(String name) {
/* 12 */     this.username = name;
/*    */   }
/*    */   
/*    */   public String getUsername() {
/* 16 */     return this.username;
/*    */   }
/*    */   
/*    */   public void setPassword(String pw) {
/* 20 */     this.password = pw;
/*    */   }
/*    */   
/*    */   public String getPassword() {
/* 24 */     return this.password;
/*    */   }
/*    */   
/*    */   public void setUsernameHash(String nameHash) {
/* 28 */     this.usernameHash = nameHash;
/*    */   }
/*    */   
/*    */   public String getUserNameHash() {
/* 32 */     return this.usernameHash;
/*    */   }
/*    */   
/*    */   public void setPasswordHash(String pwHash) {
/* 36 */     this.passwordHash = pwHash;
/*    */   }
/*    */   
/*    */   public String getPasswordHash() {
/* 40 */     return this.passwordHash;
/*    */   }
/*    */   
/*    */   public boolean valid() {
/* 44 */     return (!Util.IsNullOrEmpty(this.username)) || (!Util.IsNullOrEmpty(this.password));
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacijavaclient\LoginCredentials.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */