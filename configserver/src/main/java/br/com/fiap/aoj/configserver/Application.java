package br.com.fiap.aoj.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

import static br.com.fiap.aoj.configserver.Application.BASE_PACKAGE;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = { BASE_PACKAGE })
public class Application {

	static final String BASE_PACKAGE = "br.com.fiap.aoj";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}