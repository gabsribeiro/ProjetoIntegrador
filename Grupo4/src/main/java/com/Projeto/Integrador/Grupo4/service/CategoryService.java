package com.Projeto.Integrador.Grupo4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Projeto.Integrador.Grupo4.Model.CategoryModel;
import com.Projeto.Integrador.Grupo4.Repository.CategoryRepository;


@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public ResponseEntity<CategoryModel> findByDescriptionGenre(String genre) {
		return ResponseEntity.ok(repository.findByDescriptionGenre(genre));
	}
}
