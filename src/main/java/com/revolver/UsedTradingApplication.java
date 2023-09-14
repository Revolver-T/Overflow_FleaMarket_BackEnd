package com.revolver;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.revolver.mapper")
@SpringBootApplication
public class UsedTradingApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsedTradingApplication.class, args);
	}

}
