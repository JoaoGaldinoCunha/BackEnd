package br.com.school.educanet.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.school.educanet.model.TbUser;


@Repository
public interface UserRepository extends JpaRepository<TbUser,Integer>{
	
	 TbUser findByEmail(String email);
	 boolean existsByPasswordAndEmail(String password,String email);
}