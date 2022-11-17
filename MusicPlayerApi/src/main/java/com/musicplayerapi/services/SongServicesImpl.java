package com.musicplayerapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicplayerapi.entity.Category;
import com.musicplayerapi.entity.Song;
import com.musicplayerapi.exceptions.SongException;

import com.musicplayerapi.repository.SongDao;

@Service
public class SongServicesImpl implements SongServices{

	@Autowired
	private SongDao songDao;
	
	
	
	@Override
	public Song addSong(Song song) {
		Category category= song.getCategory();
		category.getSongs().add(song);
		
		return  songDao.save(song);
	
	}

	@Override
	public Song delete(Integer id) throws SongException {
	Optional<Song> optional=	songDao.findById(id);
	
	if(optional.isPresent())
	{
		songDao.delete(optional.get());
		return optional.get();
	}
		
	else {
		throw new SongException("Song not found");
	}
	}

}
