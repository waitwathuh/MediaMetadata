package com.mediametadata.services.iface;

import com.mediametadata.response.GetAllMoviesListResponse;
import com.mediametadata.response.MovieDetailsResponse;

public interface IMovies
{
	public GetAllMoviesListResponse getAllMovies();
	public MovieDetailsResponse getMovieDetails(String movieId);
}