package com.example.demo4.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo4.data.entity.Posts;

public interface PostRepository extends JpaRepository<Posts, Integer>{
	
}
