/*    */ package com.tricentis.continuousintegration.toscacijavaclient;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import javax.xml.xpath.XPathExpressionException;
/*    */ import org.w3c.dom.Document;
/*    */ 
/*    */ public class Main
/*    */ {
/*    */   private static final int execution_ok = 0;
/*    */   private static final int execuiton_failed = -1;
/*    */   private static final int unhandled_exception = -1;
/*    */   private static final int invalid_options = 1;
/*    */   
/*    */   public static void main(String[] args)
/*    */   {
/*    */     try
/*    */     {
/* 18 */       ClientProperties.LoadProperties();
/* 19 */       Options options = new Options(args);
/* 20 */       if (options.checkOptions()) {
/* 21 */         AbstractDispatcher dispatcher = AbstractDispatcher.createDispatcher(options);
/* 22 */         dispatcher.Connect();
/* 23 */         dispatcher.ShowDetails();
/* 24 */         dispatcher.Execute();
/* 25 */         if (ClientProperties.getConsiderExecutionResult())
/*    */         {
/* 27 */           if (!testResultPassed(dispatcher.getResultDocument(Boolean.valueOf(false)))) {
/* 28 */             System.out.println("test execution failed...Client will exit with -1");
/* 29 */             System.exit(-1);
/*    */           } else {
/* 31 */             System.out.println("test execution passed...Client will exit with 0");
/* 32 */             System.exit(0);
/*    */           }
/*    */         }
/*    */       } else {
/* 36 */         options.showUsage();
/* 37 */         System.exit(1);
/*    */       }
/*    */     } catch (com.tricentis.continuousintegration.toscacijavaclient.Exceptions.TimeoutException e) {
/* 40 */       System.exit(-1);
/*    */     } catch (Exception e) {
/* 42 */       e.printStackTrace();
/* 43 */       System.out.println(e.getStackTrace());
/* 44 */       System.out.println("Message: " + e.getMessage());
/* 45 */       System.exit(-1);
/*    */     }
/*    */   }
/*    */   
/*    */   private static boolean testResultPassed(Document resultDoc) {
/* 50 */     String xpath = "testResult/executionState";
/* 51 */     javax.xml.xpath.XPath xPath = javax.xml.xpath.XPathFactory.newInstance().newXPath();
/*    */     try {
/* 53 */       String result = xPath.evaluate(xpath, resultDoc);
/* 54 */       if (result.toLowerCase().contains("passed")) {
/* 55 */         return true;
/*    */       }
/*    */     } catch (XPathExpressionException e) {
/* 58 */       System.out.println("Exception occured: " + e.toString());
/* 59 */       return false;
/*    */     }
/* 61 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacijavaclient\Main.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */