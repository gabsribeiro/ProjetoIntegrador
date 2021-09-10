package com.Projeto.Integrador.Grupo4.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Projeto.Integrador.Grupo4.Model.UserModel;
import com.Projeto.Integrador.Grupo4.Model.Utilities.UserDTO;
import com.Projeto.Integrador.Grupo4.Repository.UserRepository;
import com.Projeto.Integrador.Grupo4.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository repository;
	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<UserModel>> findByAll() {
		List<UserModel> listObject = repository.findAll();
		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@GetMapping("/{id_user}")
	public ResponseEntity<UserModel> findById(@PathVariable(value = "id_post") Long id) {
		Optional<UserModel> postObject = repository.findById(id);
		if (postObject.isPresent()) {
			return ResponseEntity.status(200).body(postObject.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("/email/{email}")
	public ResponseEntity<Optional<UserModel>> findByEmail(@PathVariable(value = "email") String email) {
		Optional<UserModel> emailObject = repository.findByEmail(email);
		if (emailObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(emailObject);
		}
	}

	@PostMapping("/register")
	public ResponseEntity<Object> registerUser(@Valid @RequestBody UserModel newUser) {
		Optional<Object> registeredObject = service.registerUser(newUser);
		if (registeredObject.isPresent()) {
			return ResponseEntity.status(201).body(registeredObject.get());
		} else {
			return ResponseEntity.status(401).build();
		}
	}

	@PutMapping("/auth")
	public ResponseEntity<Object> getCredential(@Valid @RequestBody UserDTO login) {
		Optional<?> credentialObject = service.getCredential(login);
		if (credentialObject.isPresent()) {
			return ResponseEntity.status(201).body(credentialObject.get());
		} else {
			return ResponseEntity.status(401).build();
		}
	}

}
