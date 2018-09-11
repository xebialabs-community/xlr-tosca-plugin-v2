/*     */ package com.tricentis.continuousintegration.toscacixecution.testconfiguration;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlElementWrapper;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ 
/*     */ @XmlRootElement(name="testConfiguration")
/*     */ @XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
/*     */ public class TestConfigurationRootNode implements Serializable
/*     */ {
/*     */   @XmlElement(name="buildRootFolder")
/*  16 */   private String buildrootfolder = "";
/*     */   @XmlElement(name="cleanOldResults")
/*     */   private boolean cleanoldresults;
/*     */   
/*  20 */   public String getBuildRootFolder() { return this.buildrootfolder; }
/*     */   
/*     */   public void setBuildRootFolder(String value)
/*     */   {
/*  24 */     this.buildrootfolder = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean getCleanOldResults()
/*     */   {
/*  31 */     return this.cleanoldresults;
/*     */   }
/*     */   
/*     */ 
/*  35 */   public void setCleanOldResults(boolean value) { this.cleanoldresults = value; }
/*     */   
/*     */   @XmlElement(name="testMandateName")
/*  38 */   private String testmandatename = "";
/*     */   @XmlElement(name="packageName", nillable=true)
/*     */   private String packagename;
/*     */   
/*  42 */   public String getTestMandateName() { return this.testmandatename; }
/*     */   
/*     */   public void setTestMandateName(String value)
/*     */   {
/*  46 */     this.testmandatename = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public String getPackageName()
/*     */   {
/*  53 */     return this.packagename;
/*     */   }
/*     */   
/*     */ 
/*  57 */   public void setPackageName(String value) { this.packagename = value; }
/*     */   
/*     */   @XmlElement(name="splitTestSuites")
/*  60 */   private boolean splittestsuites = true;
/*     */   @XmlElement(name="ignoreNonMatchingIds")
/*     */   private boolean ignorenonmatchingids;
/*     */   
/*  64 */   public boolean getSplitTestsuites() { return this.splittestsuites; }
/*     */   
/*     */   public void setSplitTestsuites(boolean value)
/*     */   {
/*  68 */     this.splittestsuites = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean getIgnoreNonMatchingIds()
/*     */   {
/*  75 */     return this.ignorenonmatchingids;
/*     */   }
/*     */   
/*     */ 
/*  79 */   public void setIgnoreNonMatchingIds(boolean value) { this.ignorenonmatchingids = value; }
/*     */   @XmlElementWrapper(name="surrogateIds")
/*     */   @XmlElement(name="surrogateId")
/*  82 */   private Collection<String> surrogateIds = new ArrayList();
/*     */   
/*     */ 
/*     */   public Collection<String> getSurrogateIds()
/*     */   {
/*  87 */     return this.surrogateIds;
/*     */   }
/*     */   
/*     */ 
/*  91 */   public void setSurrogateIds(Collection<String> value) { this.surrogateIds = value; }
/*     */   @XmlElementWrapper(name="customProperties")
/*     */   @XmlElement(name="property")
/*  94 */   private Collection<CustomProperty> customProperties = new ArrayList();
/*     */   
/*     */ 
/*     */   public Collection<CustomProperty> getCustomProperties()
/*     */   {
/*  99 */     return this.customProperties;
/*     */   }
/*     */   
/*     */ 
/* 103 */   public void setCustomProperties(Collection<CustomProperty> value) { this.customProperties = value; }
/*     */   @XmlElementWrapper(name="ExecutionTypes")
/*     */   @XmlElement(name="ExecutionType")
/* 106 */   private Collection<String> executionTypes = new ArrayList();
/*     */   
/*     */ 
/*     */   public Collection<String> getExecutionTypes()
/*     */   {
/* 111 */     return this.executionTypes;
/*     */   }
/*     */   
/*     */   public void setExecutionTypes(Collection<String> value) {
/* 115 */     this.executionTypes = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacixecution\testconfiguration\TestConfigurationRootNode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */