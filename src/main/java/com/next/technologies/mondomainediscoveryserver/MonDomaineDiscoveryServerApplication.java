package com.next.technologies.mondomainediscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MonDomaineDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonDomaineDiscoveryServerApplication.class, args);
	}

}
