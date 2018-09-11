/*     */ package org.datacontract.schemas._2004._07.tricentis;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.datacontract.schemas._2004._07.system.ArrayOfTupleOfstringbase64Binary;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="CloudResultContainer", propOrder={"x003CDistributionItemIdX003EKBackingField", "x003CEventIdX003EKBackingField", "x003CExecutionListSurrogateX003EKBackingField", "x003CIdX003EKBackingField", "x003CResultLocationX003EKBackingField", "x003CResultSubsetsX003EKBackingField", "x003CResultTakenX003EKBackingField", "x003CWorkspaceIdX003EKBackingField", "filePath"})
/*     */ public class CloudResultContainer
/*     */ {
/*     */   @XmlElement(name="_x003C_DistributionItemId_x003E_k__BackingField", required=true)
/*     */   protected String x003CDistributionItemIdX003EKBackingField;
/*     */   @XmlElement(name="_x003C_EventId_x003E_k__BackingField", required=true)
/*     */   protected String x003CEventIdX003EKBackingField;
/*     */   @XmlElement(name="_x003C_ExecutionListSurrogate_x003E_k__BackingField", required=true, nillable=true)
/*     */   protected String x003CExecutionListSurrogateX003EKBackingField;
/*     */   @XmlElement(name="_x003C_Id_x003E_k__BackingField", required=true, nillable=true)
/*     */   protected String x003CIdX003EKBackingField;
/*     */   @XmlElement(name="_x003C_ResultLocation_x003E_k__BackingField", required=true)
/*     */   protected ResultLocation x003CResultLocationX003EKBackingField;
/*     */   @XmlElement(name="_x003C_ResultSubsets_x003E_k__BackingField", required=true, nillable=true)
/*     */   protected ArrayOfTupleOfstringbase64Binary x003CResultSubsetsX003EKBackingField;
/*     */   @XmlElement(name="_x003C_ResultTaken_x003E_k__BackingField")
/*     */   protected boolean x003CResultTakenX003EKBackingField;
/*     */   @XmlElement(name="_x003C_WorkspaceId_x003E_k__BackingField", required=true, nillable=true)
/*     */   protected String x003CWorkspaceIdX003EKBackingField;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected String filePath;
/*     */   
/*     */   public String getX003CDistributionItemIdX003EKBackingField()
/*     */   {
/*  80 */     return this.x003CDistributionItemIdX003EKBackingField;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setX003CDistributionItemIdX003EKBackingField(String value)
/*     */   {
/*  92 */     this.x003CDistributionItemIdX003EKBackingField = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getX003CEventIdX003EKBackingField()
/*     */   {
/* 104 */     return this.x003CEventIdX003EKBackingField;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setX003CEventIdX003EKBackingField(String value)
/*     */   {
/* 116 */     this.x003CEventIdX003EKBackingField = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getX003CExecutionListSurrogateX003EKBackingField()
/*     */   {
/* 128 */     return this.x003CExecutionListSurrogateX003EKBackingField;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setX003CExecutionListSurrogateX003EKBackingField(String value)
/*     */   {
/* 140 */     this.x003CExecutionListSurrogateX003EKBackingField = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getX003CIdX003EKBackingField()
/*     */   {
/* 152 */     return this.x003CIdX003EKBackingField;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setX003CIdX003EKBackingField(String value)
/*     */   {
/* 164 */     this.x003CIdX003EKBackingField = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ResultLocation getX003CResultLocationX003EKBackingField()
/*     */   {
/* 176 */     return this.x003CResultLocationX003EKBackingField;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setX003CResultLocationX003EKBackingField(ResultLocation value)
/*     */   {
/* 188 */     this.x003CResultLocationX003EKBackingField = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayOfTupleOfstringbase64Binary getX003CResultSubsetsX003EKBackingField()
/*     */   {
/* 200 */     return this.x003CResultSubsetsX003EKBackingField;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setX003CResultSubsetsX003EKBackingField(ArrayOfTupleOfstringbase64Binary value)
/*     */   {
/* 212 */     this.x003CResultSubsetsX003EKBackingField = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isX003CResultTakenX003EKBackingField()
/*     */   {
/* 220 */     return this.x003CResultTakenX003EKBackingField;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setX003CResultTakenX003EKBackingField(boolean value)
/*     */   {
/* 228 */     this.x003CResultTakenX003EKBackingField = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getX003CWorkspaceIdX003EKBackingField()
/*     */   {
/* 240 */     return this.x003CWorkspaceIdX003EKBackingField;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setX003CWorkspaceIdX003EKBackingField(String value)
/*     */   {
/* 252 */     this.x003CWorkspaceIdX003EKBackingField = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getFilePath()
/*     */   {
/* 264 */     return this.filePath;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFilePath(String value)
/*     */   {
/* 276 */     this.filePath = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis\CloudResultContainer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */