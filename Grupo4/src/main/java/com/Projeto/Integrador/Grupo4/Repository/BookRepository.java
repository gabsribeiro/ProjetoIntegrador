package com.Projeto.Integrador.Grupo4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projeto.Integrador.Grupo4.Model.BookModel;

public interface BookRepository extends JpaRepository <BookModel, Integer>{

}
