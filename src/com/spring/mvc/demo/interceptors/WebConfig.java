package com.spring.mvc.demo.interceptors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new Intercept()).addPathPatterns("/**");
		// registry.addInterceptor(new
		// ThemeInterceptor()).addPathPatterns("/**").excludePathPatterns("/admin/**");

		// multiple urls (same is possible for `exludePathPatterns`)
		// registry.addInterceptor(new
		// SecurityInterceptor()).addPathPatterns("/secure/*", "/admin/**",
		// "/profile/**");
	}
}

