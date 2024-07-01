package com.cetpa.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer 
{
	protected Class<?>[] getRootConfigClasses() 
	{
		return null;
	}
	protected Class<?>[] getServletConfigClasses() 
	{
		Class [] arr=new Class[] {SpringConfig.class};
		return arr;
	}
	protected String[] getServletMappings() 
	{
		String [] str=new String[] {"/"};
		return str;
	}
}
