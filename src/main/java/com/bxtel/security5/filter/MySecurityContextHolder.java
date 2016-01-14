package com.bxtel.security5.filter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bxtel.security5.auth.IAuthenticationResponse;
import com.bxtel.security5.auth.exceiption.AccountIsNotAuthenticatedException;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;


@Component
public class MySecurityContextHolder {
	
	@Autowired
	CacheManager cacheManager;
	
	public IAuthenticationResponse getSecurityContext(HttpServletRequest  servletRequest)
	{
		HttpSession ses = servletRequest.getSession(false);
		if(ses!=null)
		{
			IAuthenticationResponse auth =(IAuthenticationResponse) ses.getAttribute("securitycontext");
			if(auth!=null)
			{
				return auth;
			}
		}
		String token=servletRequest.getHeader("token");
		if(token==null || "".equals(token))
		{
			throw new AccountIsNotAuthenticatedException("token is not exits!");
		}
		Element cache = cacheManager.getCache("user").get(token);
		if(token==null || "".equals(token))
		{
			throw new AccountIsNotAuthenticatedException("token is invalid!");
		}
		IAuthenticationResponse resp=(IAuthenticationResponse) cache.getObjectValue();
		return resp;
	}
	
	public void setSecurityContext(IAuthenticationResponse  auth,HttpServletRequest request)
	{
		HttpSession ses = request.getSession(true);
		if(ses!=null)
		{
			ses.setAttribute("securitycontext",auth);
		}
	}
}
