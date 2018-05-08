package com.dreamfish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamfish.domain.Authority;


public interface AuthorityRepository extends JpaRepository<Authority, Long>{
}
