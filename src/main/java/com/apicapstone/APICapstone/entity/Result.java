package com.apicapstone.APICapstone.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	
	@JsonProperty("page")
	private String page;
	@JsonProperty("total_results")
	private Integer total_results;
	@JsonProperty("total_pages")
	private Integer total_pages;
	@JsonProperty("results")
	private ArrayList<Movie> results;
	public Result() {
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public Integer getTotal_results() {
		return total_results;
	}
	public void setTotal_results(Integer total_results) {
		this.total_results = total_results;
	}
	public Integer getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(Integer total_pages) {
		this.total_pages = total_pages;
	}
	public ArrayList<Movie> getResults() {
		return results;
	}
	public void setResults(ArrayList<Movie> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "Result [page=" + page + ", total_results=" + total_results + ", total_pages=" + total_pages
				+ ", results=" + results + "]";
	}
	
	
	
}
