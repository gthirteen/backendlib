package com.thirteen.oph;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages= {"com.thirteen.oph.hr.mapper", "com.thirteen.oph.pm.mapper"})
public class OphWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(OphWebApplication.class, args);
	}

}
