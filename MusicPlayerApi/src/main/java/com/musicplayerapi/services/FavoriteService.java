package com.musicplayerapi.services;

import com.musicplayerapi.entity.Favorites;
import com.musicplayerapi.entity.Song;
import com.musicplayerapi.exceptions.SongException;

public interface FavoriteService {
	
	 public Song getSongID(Integer id,String uuid)throws Exception , SongException;
	 public Favorites addSong(Integer song_id, String uuid)throws Exception , SongException;
	 public Favorites deleteSong(Integer song_id, String uuid)throws Exception , SongException;
}
