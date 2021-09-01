package com.Projeto.Integrador.Grupo4.Controller;

import java.util.List;

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

@CrossOrigin("*")
@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private CategoryRepository repository;

	@GetMapping
	public ResponseEntity<List<CategoryModel>> findAll() {
		List<CategoryModel> obj = repository.findAll();
		return ResponseEntity.ok().body(obj);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<CategoryModel> findById(@PathVariable Integer id) {
		ResponseEntity<CategoryModel> obj = repository.findById((int) id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
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
	public void deleteById(@PathVariable Integer id) {
		repository.deleteById(id);
	}
}