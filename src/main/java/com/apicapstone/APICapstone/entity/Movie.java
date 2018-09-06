package com.apicapstone.APICapstone.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Movie {
	
	@JsonProperty("id")
	private int id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("video")
	private Boolean video;
	@JsonProperty("overview")
	private String overview;
	
	public Movie() {
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
		return "Movie [id=" + id + ", title=" + title + ", video=" + video + ", overview=" + overview + "]";
	}

	
	
	
}
