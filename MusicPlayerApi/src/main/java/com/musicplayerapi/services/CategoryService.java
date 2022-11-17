package com.musicplayerapi.services;

import java.util.List;


import com.musicplayerapi.entity.Song;
import com.musicplayerapi.exceptions.CategoryException;

public interface CategoryService {
	
	
	public List<Song> getAllsongsByCategoryid(Integer cid) throws CategoryException;

}
