package br.com.school.educanet.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.school.educanet.model.TbUser;
import br.com.school.educanet.repository.UserRepository;

@Service
public class ValidationService {
	@Autowired
	UserRepository userRepository;
		public TbUser  ValditionUser(String email,String password) {
			if(userRepository.existsByPasswordAndEmail(password, email)){
	            throw new RuntimeException("Usuário encontrado!");            
		}
            throw new RuntimeException("Usuário não encontrado!");

	}
}