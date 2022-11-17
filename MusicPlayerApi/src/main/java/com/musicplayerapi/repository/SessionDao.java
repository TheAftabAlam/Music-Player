package com.musicplayerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.musicplayerapi.entity.CurrentUserSession;

public interface SessionDao extends JpaRepository<CurrentUserSession, Integer> {

	
	public  CurrentUserSession  findByUuid(String uuid);
}
