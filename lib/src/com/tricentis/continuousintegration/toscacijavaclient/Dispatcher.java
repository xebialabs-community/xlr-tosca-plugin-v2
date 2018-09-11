/*    */ package com.tricentis.continuousintegration.toscacijavaclient;
/*    */ 
/*    */ import com.tricentis.continuousintegration.toscacijavaclient.Exceptions.ClientException;
/*    */ import com.tricentis.continuousintegration.toscacixecution.utils.Util;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.InputStream;
/*    */ import java.io.StringWriter;
/*    */ import java.rmi.RemoteException;
/*    */ import javax.xml.parsers.DocumentBuilder;
/*    */ import javax.xml.parsers.DocumentBuilderFactory;
/*    */ import javax.xml.transform.Transformer;
/*    */ import javax.xml.transform.TransformerFactory;
/*    */ import javax.xml.transform.dom.DOMSource;
/*    */ import javax.xml.transform.stream.StreamResult;
/*    */ import org.tempuri.IRemoteExecutionService;
/*    */ import org.tempuri.RemoteExecutionService;
/*    */ import org.w3c.dom.Document;
/*    */ 
/*    */ public class Dispatcher extends AbstractDispatcher
/*    */ {
/* 22 */   private IRemoteExecutionService basicHttpService = null;
/*    */   
/*    */   public Dispatcher(Options options) {
/* 25 */     super(options);
/*    */   }
/*    */   
/*    */   public void Connect()
/*    */   {
/* 30 */     RemoteExecutionService service = new RemoteExecutionService();
/* 31 */     this.basicHttpService = service.getBasicHttpBindingIRemoteExecutionService();
/*    */   }
/*    */   
/*    */   public void Execute() throws RemoteException, Exception, ClientException
/*    */   {
/* 36 */     if (this.options.hasConfig()) {
/* 37 */       String config = loadConfig(this.options.getConfigPath());
/* 38 */       HandleResult(this.basicHttpService.executeWithConfig(Util.sha256(ClientProperties.getUsername()), Util.sha256(ClientProperties.getPassword()), config, ClientProperties.getResultType()));
/*    */     } else {
/* 40 */       HandleResult(this.basicHttpService.executeWithoutConfig(Util.sha256(ClientProperties.getUsername()), Util.sha256(ClientProperties.getPassword()), ClientProperties.getResultType()));
/*    */     }
/*    */   }
/*    */   
/*    */   public String loadConfig(String fileName) {
/*    */     try {
/* 46 */       DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
/* 47 */       InputStream inputStream = new FileInputStream(new File(fileName));
/* 48 */       Document doc = documentBuilderFactory.newDocumentBuilder().parse(inputStream);
/* 49 */       StringWriter stw = new StringWriter();
/* 50 */       Transformer serializer = TransformerFactory.newInstance().newTransformer();
/* 51 */       serializer.transform(new DOMSource(doc), new StreamResult(stw));
/* 52 */       return stw.toString();
/*    */     } catch (Exception e) {
/* 54 */       e.printStackTrace();
/*    */     }
/* 56 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacijavaclient\Dispatcher.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */