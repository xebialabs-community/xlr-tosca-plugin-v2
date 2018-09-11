/*    */ package com.tricentis.continuousintegration.toscacijavaclient.Exceptions;
/*    */ 
/*    */ public class ClientException extends Exception
/*    */ {
/*    */   public ClientException(String message) {
/*  6 */     super(message);
/*    */   }
/*    */   
/*    */   public ClientException(String message, Exception innerException) {
/* 10 */     super(message, innerException);
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacijavaclient\Exceptions\ClientException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */