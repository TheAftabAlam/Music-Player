package com.musicplayerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musicplayerapi.entity.Favorites;
@Repository
public interface FavoritesDao extends JpaRepository<Favorites, Integer>{

	
}
