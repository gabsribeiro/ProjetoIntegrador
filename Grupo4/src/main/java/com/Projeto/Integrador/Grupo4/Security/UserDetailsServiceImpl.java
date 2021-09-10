package com.Projeto.Integrador.Grupo4.Security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Projeto.Integrador.Grupo4.Model.UserModel;
import com.Projeto.Integrador.Grupo4.Repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String Username) throws UsernameNotFoundException{
		Optional<UserModel> objectOptional = repository.findByEmail(Username);
		if (objectOptional.isPresent()) {
			return new UserDetailsImpl(objectOptional.get());
		}
		
		else {
			throw new UsernameNotFoundException(Username + "nao existe");
		}
	
	}

}
