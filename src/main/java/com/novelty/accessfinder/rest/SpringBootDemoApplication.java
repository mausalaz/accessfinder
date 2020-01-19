package com.novelty.accessfinder.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
@SpringBootApplication
public class SpringBootDemoApplication extends SpringBootServletInitializer implements CommandLineRunner {
	
	private static Logger LOGGER = LogManager.getLogger(SpringBootDemoApplication.class);
	
	@Autowired
    private ApplicationContext appContext;
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(SpringBootDemoApplication.class);
	    }
 
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
        
        LOGGER.info("Simple log statement with inputs 1, 2 and 3");
    }
    
    @Override
    public void run(String... args) throws Exception 
    {
        String[] beans = appContext.getBeanDefinitionNames();
        Arrays.sort(beans);
        for (String bean : beans) 
        {
            System.out.println(bean + " of Type :: " + appContext.getBean(bean).getClass());
        }
    }
}
