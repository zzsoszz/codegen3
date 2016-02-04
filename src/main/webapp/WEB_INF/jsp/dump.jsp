<%@ page language="java" pageEncoding="UTF-8"%>  
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib  uri="http://www.springframework.org/tags" prefix="spr"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.Enumeration"%>
<%@ page import="dinamica.util.HttpHelper"%>
<%@ page import="java.util.HashSet"%>

<body>
<%
	
	out.println("==========================================================================application"+" <br/>");
	Enumeration<String> names = application.getAttributeNames(); 
	while (names.hasMoreElements())
	{
	     String sname = names.nextElement();     
	     String value = application.getAttribute(sname).toString();  
	     out.println(sname+" = " +value+"<br>");  
	}
	HashSet sessions = (HashSet) application.getAttribute("sessions");
	out.println("session size:"+sessions.size());
	out.println("<br/>");
	out.println("==========================================================================session"+" <br/>");
	out.println("<br> SESSION ID:" + session.getId()+"<br>"); 
    names = session.getAttributeNames(); 
    while (names.hasMoreElements())
    {
         String sname = names.nextElement();     
         String value = session.getAttribute(sname).toString();  
         out.println(sname+" = " +value+"<br>");  
    }
    out.println("==========================================================================request"+" <br/>");
    String path= HttpHelper.saveHttp(request);
    out.println("path ="+path+" <br/>");
	out.println("HTTP-request info start");
	out.println("getCharacterEncoding:"+request.getCharacterEncoding()+" <br/>");
	out.println("getContentType:"+request.getContentType()+" <br/>");
	out.println("getRequestedSessionId:"+request.getRequestedSessionId()+" <br/>");
    out.println("getMethod:"+request.getMethod()+" <br/>");
    out.println("getPathInfo:"+request.getPathInfo()+" <br/>");
    out.println("getQueryString:"+request.getQueryString()+" <br/>");
    out.println("getRequestURI:"+request.getRequestURI()+" <br/>");
    out.println("getServerPort:"+request.getServerPort()+" <br/>");
    out.println("getRequestURL:"+request.getRequestURL().toString()+" <br/>");
    out.println("getScheme:"+request.getScheme());
    out.println("getServerName:"+request.getServerName()+" <br/>");
    out.println("getContextPath:"+request.getContextPath()+" <br/>");
    out.println("getServletPath:"+request.getServletPath()+" <br/>");
    out.println("getRemoteAddr:"+request.getRemoteAddr()+" <br/>");
    out.println("getRemoteHost:"+request.getRemoteHost()+" <br/>");
    out.println("getRemotePort:"+request.getRemotePort()+" <br/>");
    out.println("getRemoteUser:"+request.getRemoteUser()+" <br/>");
    out.println("HTTP-request info end"+" <br/>");
    
    
    out.println("HTTP-Header:start"+" <br/>");
	Enumeration headerNames = request.getHeaderNames();
	while (headerNames.hasMoreElements()) 
	{
		String headerName = (String) headerNames.nextElement();
		String headerValues = request.getHeader(headerName);
		out.println("HeaderName:"+headerName+"   HeaderValue:"+headerValues+" <br/>");
	}
	out.println("HTTP-Header:end"+" <br/>");
	
	
	
	out.println("HTTP-Body:start"+" <br/>");
	Enumeration paramNames = request.getParameterNames();
	while (paramNames.hasMoreElements()) 
	{
		String paramName = (String) paramNames.nextElement();
		String[] paramValues = request.getParameterValues(paramName);
		for(int i=0;i<paramValues.length;i++)
		{
			////out.println("ParamName:"+paramName+"   ParamValue:"+new String(paramValues[i].getBytes("iso-8859-1"),"gbk"));
			out.println("ParamName:"+paramName+"   ParamValue:"+paramValues[i]+" <br/>");
		}
	}
	out.println("HTTP-Body:end"+" <br/>");
	
	
	out.println("HTTP-Session:start"+" <br/>");
	
	if(request.getSession(false)!=null)
	{
		Enumeration en = request.getSession(false).getAttributeNames();
		while(en.hasMoreElements())
		{
			String str=(String) en.nextElement();
			out.println("ParamName:"+str+"   ParamValue:"+request.getSession().getAttribute(str)+" <br/>");
		}
	}
	out.println("HTTP-Session:end"+" <br/>");
	
	
	
	out.println("HTTP-Cookie:start"+" <br/>");
	if(request.getCookies()!=null)
	{
		Cookie[] cookie = request.getCookies();
		for(Cookie c:cookie)
		{
			out.println("   Name:"+c.getName()+"  Secure:"+c.getSecure()+"   Value:"+c.getValue()+"  Comment:"+c.getComment()+"   MaxAge:"+c.getMaxAge()+"   Path:"+c.getPath()+"   Version:"+c.getVersion()+"   Domain:"+c.getDomain()+" <br/>");
		}
	}
	
	out.println("HTTP-Cookie:end"+" <br/>");
	out.println("=========================================================================="+" <br/>");
	
   	
 %>
</body>
