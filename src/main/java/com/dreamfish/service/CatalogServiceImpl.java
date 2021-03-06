package com.dreamfish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dreamfish.domain.Catalog;
import com.dreamfish.domain.User;
import com.dreamfish.repository.CatalogRepository;


@Service
public class CatalogServiceImpl implements CatalogService{

	@Autowired
	private CatalogRepository catalogRepository;
	
	@Override
	public Catalog saveCatalog(Catalog catalog) {
		// 判断重复
		List<Catalog> list = catalogRepository.findByUserAndName(catalog.getUser(), catalog.getName());
		if(list !=null && list.size() > 0) {
			throw new IllegalArgumentException("该分类已经存在了");
		}
		return catalogRepository.save(catalog);
	}

	@Override
	public void removeCatalog(Long id) {
		catalogRepository.delete(id);
	}

	@Override
	public Catalog getCatalogById(Long id) {
		return catalogRepository.findOne(id);
	}

	@Override
	public List<Catalog> listCatalogs(User user) {
		return catalogRepository.findByUser(user);
	}

	@Override
	public List<Catalog> listAllCatalogs() {
		// TODO Auto-generated method stub
		return catalogRepository.findAll();
	}
	@Override
	public Page<Catalog> listCatalogsByPage(Pageable pageable) {
		// TODO Auto-generated method stub
		
		Page<Catalog> catalogs = catalogRepository.findAll(pageable);
		return catalogs;
	}
	

}
