package br.dev.mvidal.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.mvidal.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);	
}
