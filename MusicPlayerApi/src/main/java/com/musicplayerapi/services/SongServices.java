package com.musicplayerapi.services;



import com.musicplayerapi.entity.Song;
import com.musicplayerapi.exceptions.SongException;

public interface SongServices {

	public Song addSong(Song song);
	public Song delete(Integer idInteger)throws SongException;
	
	
}
