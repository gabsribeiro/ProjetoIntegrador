package com.Projeto.Integrador.Grupo4.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Projeto.Integrador.Grupo4.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService service;
	
	
	public void instanceDB() {
		
		this.service.instanceDB();
	}
}
