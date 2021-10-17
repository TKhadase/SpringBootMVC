package com.tushar.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import com.tushar.Interceptors.EOD_TimeCheck_Interceptor;

@Component
public class CustomMvcConfigurer implements WebMvcConfigurer {

	@Autowired
	private LocaleChangeInterceptor lci;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("CustomMvcConfigurer.addInterceptors()");
		registry.addInterceptor(new EOD_TimeCheck_Interceptor());
		registry.addInterceptor(lci);
	}
	
	
}
