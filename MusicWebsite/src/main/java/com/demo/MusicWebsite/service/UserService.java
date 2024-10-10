package com.demo.MusicWebsite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.MusicWebsite.model.UserModel;
import com.demo.MusicWebsite.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public boolean registerUser(String login,String password)
	{
		if(userRepository.findByLoginAndPassword(login, password).isPresent())
		{
			return false;
		}
		else {
			UserModel userModel=new UserModel();
			userModel.setLogin(login);
			userModel.setPassword(password);
			userRepository.save(userModel);
		}
		return true;
	}
	public boolean authenticate(String login,String password)
	{
		if(userRepository.findByLoginAndPassword(login, password).isPresent())
		{
			return true;
		}
		return false;
	}
}
