package com.musicplayerapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicplayerapi.entity.Category;
import com.musicplayerapi.entity.Song;
import com.musicplayerapi.exceptions.CategoryException;
import com.musicplayerapi.repository.CategoryDao;
@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	



	@Override
	public List<Song> getAllsongsByCategoryid(Integer cid) throws CategoryException{
		Optional<Category> optional= categoryDao.findById(cid);
		if(optional.isPresent())
		{
			List<Song> songs=optional.get().getSongs();
			return songs;
		}
		else {
			throw new CategoryException("category not found");
		}
	}

}
