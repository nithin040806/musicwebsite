package com.demo.MusicWebsite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.MusicWebsite.model.FavouritesModel;

public interface FavouriteRepository extends JpaRepository<FavouritesModel, Integer>{
	FavouritesModel findByUserIdAndMusicIdAndPostercardurlAndPageurl(Integer userid,Integer musicid,String postercardurl,String pageurl);
	FavouritesModel findByUserIdAndMusicId(Integer userid,Integer musicid);
	List<FavouritesModel> findByUserId(Integer userid);
}
