package com.golabs.railway.portal.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

public class GolabsRailwayWebAppWCI extends WebContentInterceptor {

	public GolabsRailwayWebAppWCI() {
		setRequireSession(false);
		setCacheSeconds(120);
		setSupportedMethods("GET","POST", "OPTIONS", "HEAD");
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws ServletException {
			super.preHandle(request, response, handler);
		//Define the customer prehandle here
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
		//Define your custome post handle here
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		super.afterCompletion(request, response, handler, ex);
		//Define your custome after-completion here
	}
	
}
