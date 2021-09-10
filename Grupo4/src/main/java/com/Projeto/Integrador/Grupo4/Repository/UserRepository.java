package com.Projeto.Integrador.Grupo4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Projeto.Integrador.Grupo4.Model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
