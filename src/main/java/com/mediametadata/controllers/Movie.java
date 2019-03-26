package com.mediametadata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mediametadata.response.GetAllMoviesListResponse;
import com.mediametadata.response.MovieDetailsResponse;
import com.mediametadata.services.iface.IMovies;

@Controller
public class Movie
{
	@Autowired
	private IMovies movies;

	@RequestMapping( value = "/movie", method = RequestMethod.GET )
	public @ResponseBody GetAllMoviesListResponse getAllMovies()
	{
		return movies.getAllMovies();
	}

	@RequestMapping( value = "/movie/{movieId}", method = RequestMethod.GET )
	public @ResponseBody MovieDetailsResponse getMovieDetails(@PathVariable("movieId") String movieId)
	{
		return movies.getMovieDetails(movieId);
	}
}