package com.Projeto.Integrador.Grupo4.Model.Utilities;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserDTO {
	
	
	private long IdClient;
	
	private String name;
	
	@NotBlank
	@Email
	private String email;
	
	@NotBlank
	private String password;
	
	private String type_user;

	private String token;

	public long getIdClient() {
		return IdClient;
	}

	public void setIdClient(long idClient) {
		IdClient = idClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType_user() {
		return type_user;
	}

	public void setType_user(String type_user) {
		this.type_user = type_user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
