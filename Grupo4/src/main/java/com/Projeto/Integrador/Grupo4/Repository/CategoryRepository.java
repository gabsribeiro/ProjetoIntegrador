package com.Projeto.Integrador.Grupo4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Projeto.Integrador.Grupo4.Model.CategoryModel;

public interface CategoryRepository extends JpaRepository<CategoryModel,Integer> {

	@Query("SELECT obj FROM CategoryModel obj WHERE UPPER(obj.genre) LIKE CONCAT('%',UPPER(:genre),'%')")
	CategoryModel findByDescriptionGenre(@Param("genre") String genre);

}
