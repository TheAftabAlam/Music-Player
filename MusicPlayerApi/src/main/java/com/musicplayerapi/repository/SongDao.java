package com.musicplayerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musicplayerapi.entity.Song;

@Repository
public interface SongDao extends JpaRepository<Song, Integer> {

		
}
