package com.Projeto.Integrador.Grupo4.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Projeto.Integrador.Grupo4.Model.BookModel;
import com.Projeto.Integrador.Grupo4.Repository.BookRepository;
import com.Projeto.Integrador.Grupo4.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookRepository repository;
	
	@Autowired
	private BookService service;

	public ResponseEntity<List<BookModel>> getAll() {
		List<BookModel> obj = repository.findAll();
		if(obj.isEmpty()) {
			return ResponseEntity.status(204).build();
		}else {
			return ResponseEntity.status(200).body(obj);
		}
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<BookModel> findById(@PathVariable Long id) {
		Optional<BookModel> idObj = repository.findById(id);
		if(idObj.isPresent()) {
			return ResponseEntity.status(200).body(idObj.get());
		}else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping(value = "/title/{title}")
	public ResponseEntity<BookModel> findByDescriptionTitle(@PathVariable String title){
		ResponseEntity<BookModel> titleObj = service.findByDescriptionTitle(title);
		return titleObj;
		
		
	}
	
	@PostMapping
	public ResponseEntity<BookModel> post(@Valid @RequestBody BookModel book) {
		return ResponseEntity.status(201).body(repository.save(book));
	}

	@PutMapping
	public ResponseEntity<BookModel> update(@Valid @RequestBody BookModel updateBook) {
		return ResponseEntity.status(201).body(repository.save(updateBook));
	}

	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
