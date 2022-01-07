package br.com.vendas.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vendas.api.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
	
	List<Item> findByNameIgnoreCase(String name);

}
