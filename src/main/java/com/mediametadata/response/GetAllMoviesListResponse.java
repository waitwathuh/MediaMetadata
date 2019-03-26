package com.mediametadata.response;

import java.util.List;

public class GetAllMoviesListResponse
{
	private List<MoviesResponse> movieList;

	public GetAllMoviesListResponse()
	{
		
	}

	public List<MoviesResponse> getMovieList()
	{
		return movieList;
	}

	public void setMovieList(List<MoviesResponse> movieList)
	{
		this.movieList = movieList;
	}
}