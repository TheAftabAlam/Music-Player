package com.musicplayerapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.musicplayerapi.entity.Favorites;
import com.musicplayerapi.entity.Song;
import com.musicplayerapi.exceptions.SongException;
import com.musicplayerapi.services.FavoriteService;

@RestController
@RequestMapping("/favroite")
public class FavroiteController {
	
	@Autowired
	private FavoriteService favoriteService;
	
	@PostMapping("/addSong/{id}")
	private ResponseEntity<Favorites> addSongById(@PathVariable("id") Integer id,@RequestParam(required = false) String key) throws SongException, Exception
	{
		Favorites song= favoriteService.addSong(id, key);
		
		return new ResponseEntity<Favorites>(song,HttpStatus.OK);
	}
	
	
	@GetMapping("/getSongById/{id}")
	private ResponseEntity<Song> getSongById(@PathVariable("id") Integer id,@RequestParam(required = false) String key) throws SongException, Exception
	{
		Song song= favoriteService.getSongID(id, key);
		
		return new ResponseEntity<Song>(song,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteSongById/{id}")
	private ResponseEntity<Favorites> deleteSongById(@PathVariable("id") Integer id,@RequestParam(required = false) String key) throws SongException, Exception
	{
		Favorites song= favoriteService.deleteSong(id, key);
		
		return new ResponseEntity<Favorites>(song,HttpStatus.OK);
	}


}
