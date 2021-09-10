package com.Projeto.Integrador.Grupo4.service;

import java.nio.charset.Charset;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.Projeto.Integrador.Grupo4.Model.UserModel;
import com.Projeto.Integrador.Grupo4.Model.Utilities.UserDTO;
import com.Projeto.Integrador.Grupo4.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public Optional<?> registerUser(UserModel newUser) {
		return repository.findByEmail(newUser.getEmail()).map(usuarioExistente -> {
			return Optional.empty();
		}).orElseGet(() -> {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			String passEncoder = encoder.encode(newUser.getPassword());
			newUser.setPassword(passEncoder);
			return Optional.ofNullable(repository.save(newUser));
		});
	}

	public Optional<?> getCredential(Optional<UserDTO> login) {
		return repository.findByEmail(login.get().getEmail()).map(usuarioExistente -> {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if(encoder.matches(login.get().getPassword(), usuarioExistente.getPassword())) {
				String auth = login.get().getEmail() + ":" + login.get().getPassword();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
			
				login.get().setToken(authHeader);
				login.get().setIdClient(usuarioExistente.getIdClient());
				login.get().setName(usuarioExistente.getName());
				login.get().setPassword(usuarioExistente.getPassword());
				login.get().setType_user(usuarioExistente.getType_user());
				
				return Optional.ofNullable(login);
			}else {
				return Optional.empty();
			}	
		}).orElseGet(() -> {
			return Optional.empty();
		});
	}
	
	

}
