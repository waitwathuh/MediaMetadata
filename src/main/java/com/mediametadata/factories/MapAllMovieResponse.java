package com.mediametadata.factories;

import java.util.ArrayList;
import java.util.List;

import com.mediametadata.entities.Movie;
import com.mediametadata.response.GetAllMoviesListResponse;
import com.mediametadata.response.MoviesResponse;

public class MapAllMovieResponse
{
	public static GetAllMoviesListResponse map(List<Movie> movieListFromDB)
	{
		GetAllMoviesListResponse response = new GetAllMoviesListResponse();
		List<MoviesResponse> allMoviesList = new ArrayList<MoviesResponse>();

		for (Movie movie : movieListFromDB)
		{
			MoviesResponse gamr = new MoviesResponse();
			gamr.setId(movie.getId());
			gamr.setMovieName(movie.getMovieName());
			gamr.setYear(movie.getMetaData().getYear());

			allMoviesList.add(gamr);
		}

		response.setMovieList(allMoviesList);
		return response;
	}
}