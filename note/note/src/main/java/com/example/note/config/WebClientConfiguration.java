package com.example.note.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Configuration
//@Data
//@AllArgsConstructor
@NoArgsConstructor
public class WebClientConfiguration {
	 
   // @LoadBalanced
	@Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
