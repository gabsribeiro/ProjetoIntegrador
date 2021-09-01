package com.Projeto.Integrador.Grupo4.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<List<CategoryModel>> findAll(){
		List<CategoryModel> obj = repository.findAll();
		return ResponseEntity.ok().body(obj);
		
	}
	
	@GetMapping (value = "/{id}")
	public ResponseEntity<CategoryModel> findById(@PathVariable Integer id){
		ResponseEntity<CategoryModel> obj = repository.findById((int) id).map(
                resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
		return obj;
	}
	
	
}
