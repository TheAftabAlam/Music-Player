package com.musicplayerapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicplayerapi.entity.CurrentUserSession;
import com.musicplayerapi.entity.Favorites;
import com.musicplayerapi.entity.Song;
import com.musicplayerapi.exceptions.SongException;
import com.musicplayerapi.repository.FavoritesDao;
import com.musicplayerapi.repository.SessionDao;
import com.musicplayerapi.repository.SongDao;

@Service
public class FavoriteServiceImpl implements FavoriteService{

	@Autowired
	private SessionDao sessionDao;
	
	@Autowired
	private FavoritesDao favoritesDao;
	
	@Autowired
	private SongDao songDao;
	
	
	
	@Override
	public Favorites addSong(Integer id, String uuid) throws Exception , SongException{
		CurrentUserSession userSession= sessionDao.findByUuid(uuid);
		if(userSession!=null)
		{
		  Optional<Song> song=	songDao.findById(id);
		  if(song.isPresent())
		  {
			  Favorites favorites=new Favorites();
			  favorites.setSong_id(song.get().getId());
			  favorites.setUser_id(userSession.getUserId());
			  
			  return favoritesDao.save(favorites);
		  }
		  else {
			  throw new SongException("Song not found");
			
		}
		}
		else {
			throw new Exception("Please login first");
		}
	}



	@Override
	public Song getSongID(Integer id, String uuid) throws Exception, SongException {
		
		CurrentUserSession userSession= sessionDao.findByUuid(uuid);
		if(userSession!=null)
		{
			 Optional<Song> song=	songDao.findById(id);
			 if(song.isPresent())
			  {
				 return song.get();
			  }
			 else {
				 throw new SongException("song not found");
			}
		}
		else {
			throw new Exception("Please login first");
		}
		
		
	}



	@Override
	public Favorites deleteSong(Integer song_id, String uuid) throws Exception, SongException {
		CurrentUserSession userSession= sessionDao.findByUuid(uuid);
		if(userSession!=null)
		{
		  Optional<Favorites> song=	favoritesDao.findById(song_id);
		  if(song.isPresent())
		  {
			 favoritesDao.delete(song.get());
			  
			  return song.get();
		  }
		  else {
			  throw new SongException("Song not found");
			
		}
		}
		else {
			throw new Exception("Please login first");
		}
	}


	

}
