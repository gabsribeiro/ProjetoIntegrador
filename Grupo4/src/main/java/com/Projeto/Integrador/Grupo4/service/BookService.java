package com.Projeto.Integrador.Grupo4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Projeto.Integrador.Grupo4.Model.BookModel;
import com.Projeto.Integrador.Grupo4.Repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;

	public ResponseEntity<BookModel> findByDescriptionTitle(String title) {
		return ResponseEntity.ok(repository.findByDescriptionTitle(title));
	}
	
	
}
