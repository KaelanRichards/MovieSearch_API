package com.apicapstone.APICapstone.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apicapstone.APICapstone.daorepository.FavoriteMovieRepository;
import com.apicapstone.APICapstone.entity.FavoriteMovie;
import com.apicapstone.APICapstone.entity.Movie;
import com.apicapstone.APICapstone.entity.Result;

@Controller
public class MovieController {

	@Autowired
	FavoriteMovieRepository movieRepo;
	
	@RequestMapping("/")
	public ModelAndView home() {
//		RestTemplate restTemplate = new RestTemplate();
//		Result result = restTemplate.getForObject("https://api.themoviedb.org/3/search/movie?api_key=5f7ade35c2750e7f20ae72f746fa944c&query="+, Result.class);
//		ArrayList<Movie> movie = result.getResults();
		
	//	return new ModelAndView("index", "movietest", movie);
		return new ModelAndView("index");
	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam("keyword") String keyword) {
		RestTemplate restTemplate = new RestTemplate();
		Result result = restTemplate.getForObject("https://api.themoviedb.org/3/search/movie?api_key=5f7ade35c2750e7f20ae72f746fa944c&query=" + keyword, Result.class);
		ArrayList<Movie> movie = result.getResults();
		
		return new ModelAndView("search","results", movie);
	}
	
	@RequestMapping("/addfavorite")
	public ModelAndView addForm() {
		ModelAndView mv = new ModelAndView("search");

		mv.addObject("title", "Add Item");

		return mv;

	}

	@RequestMapping("/addfavorite/{id}/{title}/{overview}/{video}")
	public ModelAndView addTeam(@PathVariable("id") int id, @PathVariable("title") String title,
			@PathVariable("overview") String overview, @PathVariable("video") Boolean video) {
		ModelAndView mv = new ModelAndView("redirect:/");
		FavoriteMovie favMovie = new FavoriteMovie(id, title, video, overview);
		movieRepo.save(favMovie);
		return mv;

	}
	
	@RequestMapping("/favorites")
	public ModelAndView displayFavorites() {
		ModelAndView mv = new ModelAndView("favorites");
		mv.addObject("favoriteList", movieRepo.findAll());
		return mv;
	}
	
	@RequestMapping("/favorites/{id}/delete")
	public ModelAndView deleteMember(@PathVariable("id") int id) {
		movieRepo.deleteById(id);
		return new ModelAndView("redirect:/favorites");
	}
}
