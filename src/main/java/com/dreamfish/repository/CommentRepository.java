package com.dreamfish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamfish.domain.Comment;


public interface CommentRepository extends JpaRepository<Comment, Long>{
 
}
