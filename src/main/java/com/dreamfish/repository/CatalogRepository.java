package com.dreamfish.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamfish.domain.Catalog;
import com.dreamfish.domain.User;


public interface CatalogRepository extends JpaRepository<Catalog, Long>{
	
	/**
	 * 根据用户查询
	 * @param user
	 * @return
	 */
	List<Catalog> findByUser(User user);
	
	/**
	 * 根据用户查询
	 * @param user
	 * @param name
	 * @return
	 */
	List<Catalog> findByUserAndName(User user,String name);
	
	
}
