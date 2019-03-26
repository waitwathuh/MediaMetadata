package com.mediametadata.response;

import java.util.List;

public class SearchMovieNameResponse
{
	private List<MoviesResponse> movieList;

	public SearchMovieNameResponse()
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