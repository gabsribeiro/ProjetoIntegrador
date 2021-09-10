package com.Projeto.Integrador.Grupo4.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Projeto.Integrador.Grupo4.Model.CategoryModel;
import com.Projeto.Integrador.Grupo4.Repository.CategoryRepository;
import com.Projeto.Integrador.Grupo4.service.CategoryService;

@CrossOrigin("*")
@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryRepository repository;
	
	@Autowired
	private CategoryService service;

	@GetMapping
	public ResponseEntity<List<CategoryModel>> findAll() {
		List<CategoryModel> obj = repository.findAll();
		if(obj.isEmpty()){
			return ResponseEntity.status(204).build();
		}else{
			return ResponseEntity.status(200).body(obj);
		}
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<CategoryModel> findById(@PathVariable Long id) {
		Optional<CategoryModel> idObj = repository.findById((long) id);
		if(idObj.isPresent()) {
			return ResponseEntity.status(200).body(idObj.get());
		}else{
			return ResponseEntity.status(204).build();
		}
	}
	
	@GetMapping(value = "/genre/{genre}")
	public ResponseEntity<CategoryModel> findByDescriptionGenre(@PathVariable String genre){
		ResponseEntity<CategoryModel> obj = service.findByDescriptionGenre(genre);
		return obj;
	}

	@PostMapping
	public ResponseEntity<CategoryModel> post(@Valid @RequestBody CategoryModel category) {
		return ResponseEntity.status(201).body(repository.save(category));
	}

	@PutMapping
	public ResponseEntity<CategoryModel> update(@Valid @RequestBody CategoryModel updateCategory) {
		return ResponseEntity.status(201).body(repository.save(updateCategory));
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}