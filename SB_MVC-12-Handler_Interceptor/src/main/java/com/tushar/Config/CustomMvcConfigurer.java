package com.tushar.Config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tushar.Interceptors.EOD_TimeCheck_Interceptor;

@Component
public class CustomMvcConfigurer implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("CustomMvcConfigurer.addInterceptors()");
		registry.addInterceptor(new EOD_TimeCheck_Interceptor());
	}
	
	
}
