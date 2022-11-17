package com.musicplayerapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.musicplayerapi.entity.Song;
import com.musicplayerapi.exceptions.CategoryException;
import com.musicplayerapi.services.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/songByName/{id}")
	public ResponseEntity<List<Song>> getSongByCategoryName(@PathVariable("id") Integer id) throws CategoryException
	{
		List<Song> songs= categoryService.getAllsongsByCategoryid(id);
		
		return new ResponseEntity<List<Song>>(songs,HttpStatus.OK);
	
	}

}
