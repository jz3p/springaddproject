package main.java.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationStarter {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ApplicationStarter.class).web(true).run(args);
	}
}
