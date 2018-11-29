package org.xxjr.cust;


import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@Slf4j
@ComponentScan(basePackages={"org.xxjr.cust"})
public class CustApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustApplication.class, args);
		log.info("cust server is run success!!!!!!");	
	}
}
