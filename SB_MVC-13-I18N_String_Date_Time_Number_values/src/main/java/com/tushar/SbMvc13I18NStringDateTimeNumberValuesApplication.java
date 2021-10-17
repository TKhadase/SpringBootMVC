package com.tushar;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class SbMvc13I18NStringDateTimeNumberValuesApplication {

	@Bean("messageSource")//fixed id
	public ResourceBundleMessageSource createLocaleSpecificText() {
		ResourceBundleMessageSource rbms  =new ResourceBundleMessageSource();
		rbms.setBasenames("com/tushar/common/App");
		return rbms;
	}
	
	@Bean("localeResolver")//fixed id
	public SessionLocaleResolver setDefaultLocale() {
		SessionLocaleResolver locale = new SessionLocaleResolver();
		locale.setDefaultLocale(new Locale("en", "US"));
		return locale;
	}
	
	@Bean("lci")// not fixed id
	public LocaleChangeInterceptor handleLocaleRequest() {
		LocaleChangeInterceptor localeIcp = new LocaleChangeInterceptor();
		localeIcp.setParamName("lang");
		return localeIcp;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SbMvc13I18NStringDateTimeNumberValuesApplication.class, args);
	}

}
