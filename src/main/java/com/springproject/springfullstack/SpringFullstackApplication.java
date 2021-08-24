package com.springproject.springfullstack;

import com.springproject.springfullstack.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// Implicitly defines a base search package for the classpath scan
// Best practice to keep with main class/method
@Configuration
@ComponentScan
@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringFullstackApplication extends SpringBootServletInitializer {

	/*public static void main(String[] args) {
		// Starts application, creates servlet container, hosts application within that container
		// More specifically, sets up the default configuration, starts the Spring Application Context,
		//		performs class path scan (annotations), and starts Tomcat server.
		// arg1 = class where main method lives, arg2 = args variable from main method
		SpringApplication.run(SpringFullstackApplication.class, args);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SpringFullstackApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}

	private static Class<SpringFullstackApplication> applicationClass = SpringFullstackApplication.class;

}
