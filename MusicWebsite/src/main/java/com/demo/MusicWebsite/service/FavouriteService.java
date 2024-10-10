package com.demo.MusicWebsite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.MusicWebsite.model.FavouritesModel;
import com.demo.MusicWebsite.repository.FavouriteRepository;

@Service
public class FavouriteService {
	@Autowired
	FavouriteRepository favouriteRepository;
	public boolean isfavourite(Integer userId,Integer musicId)
	{
		if(favouriteRepository.findByUserIdAndMusicId(userId, musicId)!=null)
		{
			return true;
		}
		return false;
	}
	public void addFavourite(Integer userId,Integer musicId,String postercardurl,String pageurl)
	{
		FavouritesModel favouritesModel=new FavouritesModel();
		favouritesModel.setUserId(userId);
		favouritesModel.setMusicId(musicId);
		favouritesModel.setPostercardurl(postercardurl);
		favouritesModel.setPageurl(pageurl);
		favouriteRepository.save(favouritesModel);
	}
	public void removeFavourite(Integer userId,Integer musicId)
	{
		FavouritesModel favouritesModel=new FavouritesModel();
		favouritesModel.setUserId(userId);
		favouritesModel.setMusicId(musicId);
		favouriteRepository.delete(favouritesModel);
	}
}
