package com.app;

import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages ={"com.app","com.app.web","com.app.services","com.app.repository","com.app.domain"})
public class ProjectBoardApplication extends SpringBootServletInitializer {
	
	private static final Logger log = LoggerFactory.getLogger(ProjectBoardApplication.class);
	
	@Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(ProjectBoardApplication.class);
	  }

	
	public static void main(String args[])
	{
		SpringApplication.run(ProjectBoardApplication.class, args);
	}
}
