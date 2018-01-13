package com.dbs.moneythor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages={"com.dbs.moneythor"})
public class MoneythorMain extends SpringBootServletInitializer{
 
     
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MoneythorMain .class);
    }
    
	
	private final static Logger logger = LoggerFactory.getLogger(MoneythorMain.class);
	
	public static void main(String[] args) throws Exception {
		logger.debug("MoneythorMain is STARTing...");
		SpringApplication.run(MoneythorMain.class, args);
	}
}
