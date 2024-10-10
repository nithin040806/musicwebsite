package com.demo.MusicWebsite.model;


import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Music")
public class MusicModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer musicid;
	String musicName;
	String movieName;
	String language;
	Integer relaseyearInteger;
	String posterurl;
	String postercardurl;
	String pageurl;
	@Column(length=1000)
	String musicurl;
	String genere;
	public Integer getMusicid() {
		return musicid;
	}
	public void setMusicid(Integer musicid) {
		this.musicid = musicid;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Integer getRelaseyearInteger() {
		return relaseyearInteger;
	}
	public void setRelaseyearInteger(Integer relaseyearInteger) {
		this.relaseyearInteger = relaseyearInteger;
	}
	public String getPosterurl() {
		return posterurl;
	}
	public void setPosterurl(String posterurl) {
		this.posterurl = posterurl;
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
	public String getMusicurl() {
		return musicurl;
	}
	public void setMusicurl(String musicurl) {
		this.musicurl = musicurl;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	@Override
	public int hashCode() {
		return Objects.hash(genere, language, movieName, musicName, musicid, musicurl, pageurl, postercardurl,
				posterurl, relaseyearInteger);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MusicModel other = (MusicModel) obj;
		return Objects.equals(genere, other.genere) && Objects.equals(language, other.language)
				&& Objects.equals(movieName, other.movieName) && Objects.equals(musicName, other.musicName)
				&& Objects.equals(musicid, other.musicid) && Objects.equals(musicurl, other.musicurl)
				&& Objects.equals(pageurl, other.pageurl) && Objects.equals(postercardurl, other.postercardurl)
				&& Objects.equals(posterurl, other.posterurl)
				&& Objects.equals(relaseyearInteger, other.relaseyearInteger);
	}
	@Override
	public String toString() {
		return "MusicModel [musicid=" + musicid + ", musicName=" + musicName + ", movieName=" + movieName
				+ ", language=" + language + ", relaseyearInteger=" + relaseyearInteger + ", posterurl=" + posterurl
				+ ", postercardurl=" + postercardurl + ", pageurl=" + pageurl + ", musicurl=" + musicurl + ", genere="
				+ genere + "]";
	}
	
}
