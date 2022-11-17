package com.musicplayerapi.services;

import javax.security.auth.login.LoginException;

import com.musicplayerapi.entity.LoginDTO;

public interface LoginService {
	
	public String logIntoAccount(LoginDTO dto)throws LoginException;

	public String logOutFromAccount(String key)throws LoginException;

}

