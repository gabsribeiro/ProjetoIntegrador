package com.Projeto.Integrador.Grupo4.Controller;

import java.util.List;

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
import com.Projeto.Integrador.Grupo4.Model.CategoryModel;
import com.Projeto.Integrador.Grupo4.Repository.BookRepository;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookRepository repository;

	@GetMapping
	public ResponseEntity<List<BookModel>> getAll() {
		List<BookModel> obj = repository.findAll();
		return ResponseEntity.ok().body(obj);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<BookModel> findById(@PathVariable Integer id) {
		ResponseEntity<BookModel> obj = repository.findById((int) id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
		return obj;
	}

	@PostMapping
	public ResponseEntity<BookModel> post(@Valid @RequestBody BookModel book) {
		return ResponseEntity.status(201).body(repository.save(book));
	}

	@PutMapping
	public ResponseEntity<BookModel> update(@Valid @RequestBody BookModel updateBook) {
		return ResponseEntity.status(201).body(repository.save(updateBook));
	}

	@DeleteMapping
	public void deleteById(@PathVariable Integer id) {
		repository.deleteById(id);
	}

}
