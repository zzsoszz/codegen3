package com.bxtel.security5.filter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.bxtel.security5.auth.IAuthenticationResponse;


public class MySecurityContextHolder {
	
	public IAuthenticationResponse getSecurityContext(HttpServletRequest  servletRequest)
	{
		HttpSession ses = servletRequest.getSession(false);
		IAuthenticationResponse auth =(IAuthenticationResponse) ses.getAttribute("securitycontext");
		if(auth!=null)
		{
			return auth;
		}
		
		return null;
	}
}
