package com.demo.MusicWebsite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.MusicWebsite.model.MusicModel;

public interface MusicRepository extends JpaRepository<MusicModel, Integer>{
	List<MusicModel> findByLanguage(String language);
	MusicModel findByMusicName(String music_name);
	@Query(nativeQuery = true,value="Select * from music where music_name LIKE :name% or movie_name LIKE :name% or language LIKE :name")
	List<MusicModel> getByMusicNameOrMovieName(@Param("name") String name);
	@Query(nativeQuery = true,value="Select * from music where relaseyear_integer<2024")
	List<MusicModel> getByOldSongs();
	@Query(nativeQuery = true,value="Select * from music where relaseyear_integer=2024 order by musicid desc")
	List<MusicModel> getByNewSongs();
}
