package com.dreamfish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamfish.domain.Vote;


public interface VoteRepository extends JpaRepository<Vote, Long>{
 
}
