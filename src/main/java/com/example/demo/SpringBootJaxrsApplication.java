package com.example.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.jboss.resteasy.plugins.server.servlet.FilterDispatcher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan
//@EnableAutoConfiguration
@Configuration
public class SpringBootJaxrsApplication  {

	private Set<Object> singletons = new HashSet<Object>();

	public static void main(String[] args) {
		//new SpringBootJaxrsApplication().configure(new SpringApplicationBuilder(SpringBootJaxrsApplication.class)).run(args);
		SpringApplication.run(SpringBootJaxrsApplication.class, args);
	}

	
	/* @Bean
	    public ServletContextInitializer initializer() {
	            return servletContext -> {                      
	                    // RestEasy configuration
	                    servletContext.setInitParameter("resteasy.scan", "true");
	                    servletContext.setInitParameter("resteasy.servlet.mapping.prefix", "/services");
	            };
	    }    

	    @Bean
	    public ServletContextListener restEasyBootstrap() {
	            return new ResteasyBootstrap();
	    }

	    @Bean
	    public ServletRegistrationBean restEasyServlet() {
	            final ServletRegistrationBean registrationBean = new ServletRegistrationBean();
	            registrationBean.setServlet(new HttpServletDispatcher());
	            registrationBean.setName("restEasy-servlet");
	            registrationBean.addUrlMappings("/services/*");
	         //   registrationBean.addInitParameter("javax.ws.rs.Application", "com.example.demo.MyApplication");
	            return registrationBean;
	    }*/
	
	@Bean
	public FilterRegistrationBean<FilterDispatcher> filterRegistrationBean() {
	    Map<String, String> initParams = new HashMap<>();
	    initParams.put("javax.ws.rs.Application", MyApplication.class.getCanonicalName());

	    FilterRegistrationBean<FilterDispatcher> registrationBean = new FilterRegistrationBean<FilterDispatcher>();
	    registrationBean.setFilter(new FilterDispatcher());
	    registrationBean.setInitParameters(initParams);
	    return registrationBean;
	} 
	
}

