package com.tricentis.continuousintegration.toscacijavaclient;

public abstract interface IOptions
{
  public abstract String getConfigPath();
  
  public abstract void setConfigPath(String paramString);
  
  public abstract String getPathToResult();
  
  public abstract void setPathToResult(String paramString);
  
  public abstract boolean hasConfig();
}


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacijavaclient\IOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */