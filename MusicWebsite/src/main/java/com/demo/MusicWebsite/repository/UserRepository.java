package com.demo.MusicWebsite.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.MusicWebsite.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Integer>{
	public UserModel findOneByLoginAndPassword(String login,String password);
	Optional<UserModel> findByLoginAndPassword(String login,String password);
}
