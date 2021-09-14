package com.Projeto.Integrador.Grupo4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Projeto.Integrador.Grupo4.Model.BookModel;
import com.Projeto.Integrador.Grupo4.Repository.BookRepository;
import com.Projeto.Integrador.Grupo4.service.exception.DataIntegratyViolationException;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;

	public ResponseEntity<List<BookModel>> findByDescriptionTitle(String title) {
		List<BookModel> listObj = repository.findByDescriptionTitle(title);
		if (listObj.isEmpty()) {
			throw new DataIntegratyViolationException("Não existe nenhum livro com esse título");
		}
		return ResponseEntity.status(200).body(listObj);
	}

}
