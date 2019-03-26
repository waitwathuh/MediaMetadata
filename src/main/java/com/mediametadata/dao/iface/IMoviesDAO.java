package com.mediametadata.dao.iface;

import java.util.List;

import com.mediametadata.entities.Movie;

public interface IMoviesDAO
{
	public List<Movie> getAllMovies();
	public Movie getMovieDetails(String movieId);
	public List<Movie> searchMovieByName(String name);
}