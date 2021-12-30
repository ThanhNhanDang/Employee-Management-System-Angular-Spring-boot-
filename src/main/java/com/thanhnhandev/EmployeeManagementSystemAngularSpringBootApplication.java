package com.thanhnhandev;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class EmployeeManagementSystemAngularSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemAngularSpringBootApplication.class, args);
	}
	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowCredentials(true);
		configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		configuration.setAllowedHeaders(Arrays.asList("Origin", "Accecss-Control-Allow-Origin","Content-Type","Accept"
				,"Authorization", "Origin,Accept","X-Requested-With","Accecss-Control-Request-Method","Accecss-Control-Request-Headers"));
		configuration.setExposedHeaders(Arrays.asList("Origin","Content-Type","Accept"
				,"Authorization","Accecss-Control-Allow-Origin","Accecss-Control-Allow-Origin","Accecss-Control-Allow-Credentials"));
		configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource basedCorsConfigurationSource= new UrlBasedCorsConfigurationSource();
		basedCorsConfigurationSource.registerCorsConfiguration("/**", configuration);
		return new CorsFilter(basedCorsConfigurationSource);
	}
}
