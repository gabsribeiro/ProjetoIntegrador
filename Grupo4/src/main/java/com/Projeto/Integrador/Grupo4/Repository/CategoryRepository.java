package com.Projeto.Integrador.Grupo4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Projeto.Integrador.Grupo4.Model.CategoryModel;

public interface CategoryRepository extends JpaRepository<CategoryModel,Integer> {

}
