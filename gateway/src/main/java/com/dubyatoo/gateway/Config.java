package com.dubyatoo.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dubyatoo.gateway.filters.pre.SimpleFilter;

@Configuration
public class Config {
	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
}
