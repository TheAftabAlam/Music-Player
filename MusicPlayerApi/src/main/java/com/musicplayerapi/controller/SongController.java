package com.musicplayerapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musicplayerapi.entity.Song;
import com.musicplayerapi.exceptions.SongException;
import com.musicplayerapi.services.SongServices;

@RestController
@RequestMapping("/song")
public class SongController {
	
	@Autowired
	private SongServices songServices;
	

	@PostMapping("/add")
	public ResponseEntity<Song> addSongHandler(@RequestBody Song song)
	{
		Song song2= songServices.addSong(song);
		return new ResponseEntity<Song>(song2, HttpStatus.CREATED);
	}
	
	@PostMapping("/delete/{id}")
	public ResponseEntity<Song> deleteSongHandler(@PathVariable("id") Integer id) throws SongException
	{
		Song song2= songServices.delete(id);
		return new ResponseEntity<Song>(song2, HttpStatus.ACCEPTED);
	}
	
	
	
	
}
