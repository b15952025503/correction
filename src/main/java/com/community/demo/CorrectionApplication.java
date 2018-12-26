package com.community.demo;

import com.github.pagehelper.PageHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@SpringBootApplication
public class CorrectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorrectionApplication.class, args);
	}


}
