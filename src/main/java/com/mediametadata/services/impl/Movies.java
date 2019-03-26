package com.mediametadata.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediametadata.dao.iface.IMoviesDAO;
import com.mediametadata.factories.MapAllMovieResponse;
import com.mediametadata.factories.MapMovieDetailsResponse;
import com.mediametadata.response.GetAllMoviesListResponse;
import com.mediametadata.response.MovieDetailsResponse;
import com.mediametadata.services.iface.IMovies;

@Service
public class Movies implements IMovies
{
	@Autowired
	private IMoviesDAO moviesDAO;

	public GetAllMoviesListResponse getAllMovies()
	{
		return MapAllMovieResponse.map(moviesDAO.getAllMovies());
	}

	public MovieDetailsResponse getMovieDetails(String movieId)
	{
		return MapMovieDetailsResponse.map(moviesDAO.getMovieDetails(movieId));
	}
}