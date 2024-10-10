package com.demo.MusicWebsite.model;


import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="favourites")
public class FavouritesModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer favouritesId;
	Integer userId;
	Integer musicId;
	@Column(length=1000)
	String postercardurl;
	String pageurl;
	public Integer getFavouritesId() {
		return favouritesId;
	}
	public void setFavouritesId(Integer favouritesId) {
		this.favouritesId = favouritesId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getMusicId() {
		return musicId;
	}
	public void setMusicId(Integer musicId) {
		this.musicId = musicId;
	}
	public String getPostercardurl() {
		return postercardurl;
	}
	public void setPostercardurl(String postercardurl) {
		this.postercardurl = postercardurl;
	}
	public String getPageurl() {
		return pageurl;
	}
	public void setPageurl(String pageurl) {
		this.pageurl = pageurl;
	}
	@Override
	public int hashCode() {
		return Objects.hash(favouritesId, musicId, pageurl, postercardurl, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FavouritesModel other = (FavouritesModel) obj;
		return Objects.equals(favouritesId, other.favouritesId) && Objects.equals(musicId, other.musicId)
				&& Objects.equals(pageurl, other.pageurl) && Objects.equals(postercardurl, other.postercardurl)
				&& Objects.equals(userId, other.userId);
	}
	@Override
	public String toString() {
		return "FavouritesModel [favouritesId=" + favouritesId + ", userId=" + userId + ", musicId=" + musicId
				+ ", postercardurl=" + postercardurl + ", pageurl=" + pageurl + "]";
	}
	
	
	
}
