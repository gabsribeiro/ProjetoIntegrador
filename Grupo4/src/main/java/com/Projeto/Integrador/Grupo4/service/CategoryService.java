package com.Projeto.Integrador.Grupo4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Projeto.Integrador.Grupo4.Model.CategoryModel;
import com.Projeto.Integrador.Grupo4.Repository.CategoryRepository;
import com.Projeto.Integrador.Grupo4.service.exception.DataIntegratyViolationException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public ResponseEntity<List<CategoryModel>> findByDescriptionGenre(String genre) {
		List<CategoryModel> listObj = repository.findByDescriptionGenre(genre);
		if (listObj.isEmpty()) {
			throw new DataIntegratyViolationException("Não existe nenhum gênero com esse nome");
		}
		return ResponseEntity.status(200).body(listObj);

	}
}
