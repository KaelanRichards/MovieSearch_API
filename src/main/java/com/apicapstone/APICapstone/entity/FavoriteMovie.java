package com.apicapstone.APICapstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class FavoriteMovie {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="movieid")
	private int id;
	private String title;
	private Boolean video;
	private String overview;
	public FavoriteMovie(int id, String title, Boolean video, String overview) {
		this.id = id;
		this.title = title;
		this.video = video;
		this.overview = overview;
	}
	public FavoriteMovie(String title, Boolean video, String overview) {
		
		this.title = title;
		this.video = video;
		this.overview = overview;
	}
	public FavoriteMovie() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Boolean getVideo() {
		return video;
	}
	public void setVideo(Boolean video) {
		this.video = video;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	@Override
	public String toString() {
		return "FavoriteMovie [id=" + id + ", title=" + title + ", video=" + video + ", overview=" + overview + "]";
	}
	
	
	
}
