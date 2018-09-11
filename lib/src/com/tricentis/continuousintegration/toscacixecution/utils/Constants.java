/*    */ package com.tricentis.continuousintegration.toscacixecution.utils;
/*    */ 
/*    */ public enum Constants {
/*  4 */   ExecutionPassed("Passed"), 
/*  5 */   ExecutionFailed("Failed"), 
/*  6 */   TqlCiFlaggedExecutionLists("=>SUBPARTS:ExecutionList[(ContinuousIntegration=i=\"true\") AND (IsViewingAllowed=i=\"true\")]"), 
/*  7 */   TqlCiFlaggedBuildRootFolder("=>SUBPARTS:TCFolder[(PossibleContent=?\"ExecutionList\") AND (ContinuousIntegrationBuildRootFolder=i=\"true\") AND (IsViewingAllowed=i=\"true\")]"), 
/*  8 */   JUnitResultType("junit"), 
/*  9 */   NoCIBuildRootFolderFound("No ContinuousIntegrationBuildRootFolder found in project! Please flag at least one ExecutionListFolder with the custom property 'ContinuousIntegrationBuildRootFolder' and the value 'True', or define a BuildRootFolder within you 'TestConfig.xml'."), 
/* 10 */   MoreThanOneFolderFound("More than one matching BuildRootFolder found!");
/*    */   
/*    */   private Constants(String constant) {
/* 13 */     this.constant = constant;
/*    */   }
/*    */   
/*    */   private final String constant;
/*    */   public String getConstant()
/*    */   {
/* 19 */     return this.constant;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 24 */     return this.constant;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacixecution\utils\Constants.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */