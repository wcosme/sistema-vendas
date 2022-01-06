package br.com.vendas.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vendas.api.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
	List<Client> findByNameIgnoreCase(String name);

}
