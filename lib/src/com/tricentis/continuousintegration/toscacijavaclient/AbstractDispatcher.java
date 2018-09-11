/*     */ package com.tricentis.continuousintegration.toscacijavaclient;
/*     */ 
/*     */ import com.tricentis.continuousintegration.toscacijavaclient.Exceptions.ClientException;
/*     */ import com.tricentis.continuousintegration.toscacixecution.utils.Util;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.io.StringReader;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Paths;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.parsers.DocumentBuilder;
/*     */ import javax.xml.parsers.DocumentBuilderFactory;
/*     */ import javax.xml.parsers.ParserConfigurationException;
/*     */ import javax.xml.transform.Transformer;
/*     */ import javax.xml.transform.TransformerFactory;
/*     */ import javax.xml.transform.dom.DOMSource;
/*     */ import javax.xml.xpath.XPath;
/*     */ import javax.xml.xpath.XPathConstants;
/*     */ import javax.xml.xpath.XPathFactory;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Node;
/*     */ import org.w3c.dom.NodeList;
/*     */ import org.xml.sax.InputSource;
/*     */ import org.xml.sax.SAXException;
/*     */ 
/*     */ abstract class AbstractDispatcher
/*     */ {
/*     */   protected final Options options;
/*     */   
/*     */   protected Options getOpetions()
/*     */   {
/*  35 */     return this.options;
/*     */   }
/*     */   
/*  38 */   protected final String jUnitResultType = "junit";
/*     */   private Document resultDocument;
/*     */   
/*  41 */   protected AbstractDispatcher(Options options) { this.options = options; }
/*     */   
/*     */   public static AbstractDispatcher createDispatcher(Options options) throws AssertionError, IOException, ParserConfigurationException, SAXException, Exception
/*     */   {
/*  45 */     switch (options.getModeFor()) {
/*     */     case local: 
/*  47 */       return new Dispatcher(options);
/*     */     case distributed: 
/*  49 */       byte[] encoded = Files.readAllBytes(Paths.get(options.getConfigPath(), new String[0]));
/*     */       
/*     */ 
/*  52 */       String fileContentAsString = new String(encoded);
/*  53 */       Document doc = GetXML(fileContentAsString);
/*     */       
/*  55 */       List<String> testEvents = tryGetTestEvents(doc);
/*     */       
/*  57 */       if (!testEvents.isEmpty()) {
/*  58 */         return new DexDispatcher(options, testEvents, doc);
/*     */       }
/*  60 */       throw new Exception("No Testevents found for execution");
/*     */     }
/*  62 */     throw new Exception("No Testevents found for execution");
/*     */   }
/*     */   
/*     */   private static List<String> tryGetTestEvents(Document doc) throws Exception
/*     */   {
/*  67 */     List<String> events = new ArrayList();
/*     */     try {
/*  69 */       doc.normalize();
/*     */       
/*  71 */       if (doc.hasChildNodes()) {
/*  72 */         NodeList elements = doc.getElementsByTagName("*");
/*  73 */         for (int i = 0; i < elements.getLength(); i++) {
/*  74 */           if (elements.item(i).getNodeName().equalsIgnoreCase("testevent")) {
/*  75 */             events.add(elements.item(i).getTextContent());
/*     */           }
/*     */         }
/*  78 */         if (!events.isEmpty()) {
/*  79 */           return events;
/*     */         }
/*     */       }
/*  82 */       throw new Exception();
/*     */     } catch (Exception e) {
/*  84 */       throw new Exception();
/*     */     }
/*     */   }
/*     */   
/*     */   private String resultSaveLocation;
/*     */   public Document getResultDocument(Boolean considerType)
/*     */   {
/*  91 */     if ((considerType.booleanValue() == true) && (this.options.getResultType() != null) && (this.options.getResultType().equalsIgnoreCase("junit"))) {
/*  92 */       return GetJUnitXmlContent(this.resultDocument);
/*     */     }
/*     */     
/*  95 */     return this.resultDocument;
/*     */   }
/*     */   
/*     */   protected void setResultDocument(Document value) {
/*  99 */     this.resultDocument = value;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getResultSaveLocation()
/*     */   {
/* 105 */     return this.resultSaveLocation;
/*     */   }
/*     */   
/*     */   public void setResultSaveLocation(String value) {
/* 109 */     this.resultSaveLocation = value;
/*     */   }
/*     */   
/*     */   public abstract void Connect() throws ClientException;
/*     */   
/*     */   public abstract void Execute() throws java.rmi.RemoteException, Exception, ClientException;
/*     */   
/*     */   public void ShowDetails() {
/* 117 */     System.out.println("*********************************************************\n* TRICENTIS Technology & Consulting GmbH                *\n* www.tricentis.com                                     *\n* support@tricentis.com                                 *\n*********************************************************\n* TOSCAContinuousIntegrationClient                      *\n*********************************************************\n\n\n");
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */     System.out.println(" Client state:\n---------------------------------------------------------");
/* 127 */     System.out.println(" Endpoints:");
/* 128 */     System.out.println("---------------------------------------------------------");
/* 129 */     System.out.println(ClientProperties.getAddress());
/* 130 */     System.out.println();
/* 131 */     System.out.println("---------------------------------------------------------");
/*     */   }
/*     */   
/*     */   public static Document GetXML(String resultString) {
/*     */     try {
/* 136 */       String result = Util.CleanInvalidXmlCharacters(resultString);
/* 137 */       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
/* 138 */       DocumentBuilder builder = factory.newDocumentBuilder();
/* 139 */       return builder.parse(new InputSource(new StringReader(result)));
/*     */     } catch (Exception ex) {
/* 141 */       System.err.println(ex);
/*     */     }
/* 143 */     return null;
/*     */   }
/*     */   
/*     */   protected String GetResultType(String resultType) {
/* 147 */     if (!Util.IsNullOrEmpty(resultType)) {
/* 148 */       return resultType;
/*     */     }
/* 150 */     return ClientProperties.getResultType();
/*     */   }
/*     */   
/*     */   protected Document GetJUnitXmlContent(Document resultDocument)
/*     */   {
/*     */     try {
/* 156 */       DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
/* 157 */       Document jUnitDoc = documentBuilderFactory.newDocumentBuilder().newDocument();
/*     */       
/* 159 */       XPath xPath = XPathFactory.newInstance().newXPath();
/* 160 */       NodeList nodes = null;
/*     */       try {
/* 162 */         nodes = (NodeList)xPath.evaluate("testResult/testsuites", resultDocument, XPathConstants.NODESET);
/*     */         
/* 164 */         Node testSuites = jUnitDoc.importNode(nodes.item(0), true);
/* 165 */         jUnitDoc.appendChild(testSuites);
/*     */       } catch (Exception ex) {
/* 167 */         System.err.println(ex);
/*     */       }
/*     */       
/* 170 */       return jUnitDoc;
/*     */     } catch (ParserConfigurationException ex) {
/* 172 */       System.err.println(ex);
/*     */     }
/* 174 */     return null;
/*     */   }
/*     */   
/*     */   protected String GetResultFilePath() throws IOException {
/*     */     String pathToResultFile;
/*     */     String pathToResultFile;
/* 180 */     if (!Util.IsNullOrEmpty(this.options.getPathToResult())) {
/* 181 */       pathToResultFile = this.options.getPathToResult();
/*     */     } else { String pathToResultFile;
/* 183 */       if (!Util.IsNullOrEmpty(ClientProperties.getPathToResultFile())) {
/* 184 */         pathToResultFile = ClientProperties.getPathToResultFile();
/*     */       } else {
/* 186 */         pathToResultFile = Util.getDefaultPathToResultFile();
/*     */       }
/*     */     }
/*     */     
/* 190 */     if (Util.IsNullOrWhiteSpace(pathToResultFile)) {
/* 191 */       return pathToResultFile;
/*     */     }
/*     */     
/* 194 */     File file = new File(Util.expandEnvironmentVariables(pathToResultFile));
/* 195 */     String directoryPath = file.getParent();
/* 196 */     if (!Files.exists(Paths.get(directoryPath, new String[0]), new java.nio.file.LinkOption[0])) {
/* 197 */       System.out.println("Directory >" + directoryPath + "< does not exist! Try to create Directory.");
/*     */       try {
/* 199 */         File directory = new File(directoryPath);
/* 200 */         directory.mkdir();
/* 201 */         if (!directory.canWrite()) {
/* 202 */           System.err.println("Write-Access for Resultfile to path >" + directoryPath + "< denied!");
/* 203 */           pathToResultFile = Util.getDefaultPathToResultFile();
/* 204 */           System.out.println("Setting resultfilepath to default value >" + Util.getDefaultPathToResultFile() + "< .");
/*     */         }
/*     */       } catch (Exception e) {
/* 207 */         System.err.println("An Error occured during setting the result file path. " + e.getMessage());
/*     */         
/* 209 */         System.out.println("Setting resultfilepath to default value >" + Util.getDefaultPathToResultFile() + "< .");
/* 210 */         pathToResultFile = "";
/*     */       }
/*     */     }
/*     */     
/* 214 */     file = new File(pathToResultFile);
/* 215 */     if (!file.exists()) {
/*     */       try {
/* 217 */         file.createNewFile();
/*     */       } catch (IOException ex) {
/* 219 */         System.err.println("An Error occured while trying to create new file in location:" + pathToResultFile + ". " + ex.getMessage());
/* 220 */         throw ex;
/*     */       }
/*     */     }
/*     */     
/* 224 */     return pathToResultFile;
/*     */   }
/*     */   
/*     */   protected void HandleResult(String result) throws IOException {
/* 228 */     HandleResult(GetXML(result));
/*     */   }
/*     */   
/*     */   protected void HandleResult(Document result) throws IOException {
/* 232 */     System.out.println("HandleResult invoked");
/* 233 */     String pathToResultFile = GetResultFilePath();
/* 234 */     System.out.println("Try to write result to file: " + pathToResultFile);
/* 235 */     setResultDocument(result);
/* 236 */     Document resultDocument = getResultDocument(Boolean.valueOf(true));
/* 237 */     WriteResult(resultDocument, pathToResultFile);
/*     */   }
/*     */   
/*     */   protected void WriteResult(Document xdoc, String path) {
/* 241 */     if (!Util.IsNullOrEmpty(path)) {
/*     */       try {
/* 243 */         setResultSaveLocation(path);
/*     */         
/* 245 */         Transformer tr = TransformerFactory.newInstance().newTransformer();
/* 246 */         tr.transform(new DOMSource(xdoc), new javax.xml.transform.stream.StreamResult(new FileOutputStream(path)));
/*     */       } catch (Exception ex) {
/* 248 */         System.err.println(ex);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacijavaclient\AbstractDispatcher.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */