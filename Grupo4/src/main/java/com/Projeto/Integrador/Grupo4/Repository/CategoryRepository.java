package com.Projeto.Integrador.Grupo4.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Projeto.Integrador.Grupo4.Model.CategoryModel;

public interface CategoryRepository extends JpaRepository<CategoryModel,Long> {

	@Query("SELECT obj FROM CategoryModel obj WHERE UPPER(obj.genre) LIKE CONCAT('%',UPPER(:genre),'%')")
	List<CategoryModel> findByDescriptionGenre(@Param("genre") String genre);

}
