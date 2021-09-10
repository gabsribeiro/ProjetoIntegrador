package com.Projeto.Integrador.Grupo4.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Projeto.Integrador.Grupo4.Model.UserModel;
import com.Projeto.Integrador.Grupo4.Repository.UserRepository;

@RestController 
@CrossOrigin ("*")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public ResponseEntity<List<UserModel>> findByAll() {
		List<UserModel> listObject = repository.findAll();
		if(listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}
		

}
