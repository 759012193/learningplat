package com.dreamfish.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dreamfish.domain.Catalog;
import com.dreamfish.domain.User;


public interface CatalogService {
	/**
	 * 保存Catalog
	 * @param catalog
	 * @return
	 */
	Catalog saveCatalog(Catalog catalog);
	
	/**
	 * 删除Catalog
	 * @param id
	 * @return
	 */
	void removeCatalog(Long id);

	/**
	 * 根据id获取Catalog
	 * @param id
	 * @return
	 */
	Catalog getCatalogById(Long id);
	
	/**
	 * 获取Catalog列表
	 * @return
	 */
	List<Catalog> listCatalogs(User user);
	/**
	 * 获取所有catalog
	 * @return
	 */
	List<Catalog> listAllCatalogs();
	
	Page<Catalog> listCatalogsByPage(Pageable pageable);
}
