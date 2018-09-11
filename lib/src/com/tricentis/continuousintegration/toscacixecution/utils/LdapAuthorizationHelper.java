/*     */ package com.tricentis.continuousintegration.toscacixecution.utils;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.net.InetAddress;
/*     */ import java.net.UnknownHostException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Hashtable;
/*     */ import java.util.List;
/*     */ import javax.naming.InitialContext;
/*     */ import javax.naming.NamingEnumeration;
/*     */ import javax.naming.NamingException;
/*     */ import javax.naming.directory.Attribute;
/*     */ import javax.naming.directory.Attributes;
/*     */ import javax.naming.directory.BasicAttribute;
/*     */ import javax.naming.directory.BasicAttributes;
/*     */ import javax.naming.directory.DirContext;
/*     */ import javax.naming.directory.InitialDirContext;
/*     */ import javax.naming.directory.SearchControls;
/*     */ import javax.naming.directory.SearchResult;
/*     */ import javax.naming.ldap.InitialLdapContext;
/*     */ 
/*     */ public class LdapAuthorizationHelper
/*     */ {
/*  24 */   public static String ProcessUserDNSDomainName = System.getenv("USERDNSDOMAIN");
/*  25 */   public static String ProcessUserDomainName = System.getenv("USERDOMAIN");
/*  26 */   public static String ProcessUserName = System.getenv("USERNAME");
/*     */   
/*     */   public static String GetLdapProcessUserBasic() throws UnknownHostException {
/*  29 */     if (Util.IsNullOrWhiteSpace(ProcessUserDNSDomainName)) {
/*  30 */       InetAddress addr = InetAddress.getByName(InetAddress.getLocalHost().getHostName());
/*  31 */       String hostnameCanonical = addr.getCanonicalHostName();
/*  32 */       ProcessUserDNSDomainName = hostnameCanonical.substring(hostnameCanonical.indexOf(".") + 1, hostnameCanonical.length());
/*     */     }
/*     */     
/*  35 */     return "ldap://" + toDC(ProcessUserDNSDomainName);
/*     */   }
/*     */   
/*     */   private static String GetLdapProcessUser() {
/*     */     try {
/*  40 */       Hashtable<String, Object> env = initEnvironmentHashtable();
/*  41 */       InitialContext context = new InitialLdapContext(env, null);
/*     */       
/*  43 */       System.out.println("Authentication succeeded!");
/*     */       
/*  45 */       searchLdapContext(context);
/*     */     }
/*     */     catch (NamingException namingEx) {
/*  48 */       System.out.println("Failed to bind to LDAP / get account information: " + namingEx);
/*  49 */       System.exit(-1);
/*     */     }
/*     */     
/*  52 */     return "";
/*     */   }
/*     */   
/*     */   private static Hashtable<String, Object> initEnvironmentHashtable() throws NamingException {
/*  56 */     List<String> servers = findLDAPServersInWindowsDomain(ProcessUserDNSDomainName);
/*  57 */     if (servers.size() <= 0)
/*     */     {
/*  59 */       return null;
/*     */     }
/*     */     
/*  62 */     Hashtable<String, Object> env = new Hashtable();
/*  63 */     env.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
/*  64 */     env.put("java.naming.provider.url", "LDAP://" + (String)servers.get(0));
/*     */     
/*  66 */     env.put("java.naming.security.authentication", "none");
/*  67 */     env.put("java.naming.security.principal", ProcessUserName + "@" + ProcessUserDomainName);
/*     */     
/*  69 */     return env;
/*     */   }
/*     */   
/*     */   private static List<String> findLDAPServersInWindowsDomain(String domain) throws NamingException {
/*  73 */     List<String> servers = new ArrayList();
/*  74 */     Hashtable<String, String> env = new Hashtable();
/*  75 */     env.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
/*  76 */     env.put("java.naming.provider.url", "dns:");
/*  77 */     DirContext ctx = new InitialDirContext(env);
/*  78 */     Attributes attributes = ctx.getAttributes("_ldap._tcp." + domain, new String[] { "SRV" });
/*  79 */     Attribute a = attributes.get("SRV");
/*  80 */     for (int i = 0; i < a.size(); i++) {
/*  81 */       String srvRecord = a.get(i).toString();
/*     */       
/*     */ 
/*  84 */       servers.add(srvRecord.split(" ")[3]);
/*     */     }
/*  86 */     ctx.close();
/*  87 */     return servers;
/*     */   }
/*     */   
/*     */   public static void searchLdapContext(InitialContext initContext) throws NamingException {
/*  91 */     DirContext context = (DirContext)initContext;
/*     */     
/*  93 */     String filter = "(&(objectClass=user)(sAMAccountName=" + ProcessUserName + "@" + ProcessUserDNSDomainName + "))";
/*  94 */     String propertyToLoad = "distinguishedname";
/*     */     
/*     */ 
/*  97 */     SearchControls controls = new SearchControls();
/*  98 */     controls.setSearchScope(2);
/*     */     
/* 100 */     NamingEnumeration<SearchResult> renum = context.search(toDC(ProcessUserDNSDomainName), filter, controls);
/*     */     
/* 102 */     if (!renum.hasMore()) {
/* 103 */       System.out.println("Cannot locate user information for " + ProcessUserName);
/* 104 */       System.exit(-1);
/*     */     }
/* 106 */     SearchResult result = (SearchResult)renum.next();
/*     */     
/*     */ 
/* 109 */     Attribute memberOf = result.getAttributes().get("memberOf");
/* 110 */     if (memberOf != null) {
/*     */       Attribute att;
/* 112 */       for (int i = 0; i < memberOf.size(); i++) {
/* 113 */         Attributes atts = context.getAttributes(memberOf.get(i).toString(), new String[] { "CN" });
/* 114 */         att = atts.get("CN");
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 119 */     context.close();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */     String[] attrIDs = { "sn", "number", "value", "mail" };
/*     */     
/* 127 */     Attributes matchAttrs = new BasicAttributes(true);
/* 128 */     matchAttrs.put(new BasicAttribute("sn", ProcessUserName));
/* 129 */     matchAttrs.put(new BasicAttribute("mail"));
/*     */     
/* 131 */     NamingEnumeration e = context.search("ou=People", matchAttrs, attrIDs);
/*     */     
/* 133 */     while (e.hasMore()) {
/* 134 */       SearchResult entry = (SearchResult)e.next();
/* 135 */       System.out.println(entry.getName());
/*     */     }
/*     */   }
/*     */   
/*     */   private static String toDC(String domainName) {
/* 140 */     StringBuilder buf = new StringBuilder();
/* 141 */     for (String token : domainName.split("\\."))
/* 142 */       if (token.length() != 0)
/*     */       {
/*     */ 
/* 145 */         if (buf.length() > 0) {
/* 146 */           buf.append(",");
/*     */         }
/* 148 */         buf.append("DC=").append(token);
/*     */       }
/* 150 */     return buf.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacixecution\utils\LdapAuthorizationHelper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */