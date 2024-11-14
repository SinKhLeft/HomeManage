//package com.home.Left.config;
//
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import jakarta.activation.DataSource;
//
//
//@Configuration
//public class DataBaseConfig {
//	
//	@Bean
//	@Primary
//	@ConfigurationProperties(prefix = "main.datasource")
//	public DataSource DataSource() {
//		System.out.println("call this!!!!!!!!!!!!!!!!!!!");
//	    return (DataSource) DataSourceBuilder.create().build();
//	}
//}