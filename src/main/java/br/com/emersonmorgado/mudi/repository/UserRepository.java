package br.com.emersonmorgado.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.emersonmorgado.mudi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	User findByUsername(String username);
}
