package com.NetflixEurekaServer.NetflixProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class NetflixProjectApplication
{

	public static void main(String[] args) 
	{
		SpringApplication.run(NetflixProjectApplication.class, args);
	}

}
