package com.musicplayerapi.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.musicplayerapi.entity.Category;



@Repository
public interface CategoryDao  extends JpaRepository<Category, Integer> {

	
}
