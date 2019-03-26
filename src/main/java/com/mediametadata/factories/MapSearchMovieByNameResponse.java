package com.mediametadata.factories;

import java.util.ArrayList;
import java.util.List;

import com.mediametadata.entities.Movie;
import com.mediametadata.response.MoviesResponse;
import com.mediametadata.response.SearchMovieNameResponse;

public class MapSearchMovieByNameResponse
{
	public static SearchMovieNameResponse map(List<Movie> movieListFromDB)
	{
		SearchMovieNameResponse response = new SearchMovieNameResponse();
		List<MoviesResponse> allMoviesList = new ArrayList<MoviesResponse>();

		for (Movie movie : movieListFromDB)
		{
			MoviesResponse moviesResponse = new MoviesResponse();
			moviesResponse.setId(movie.getId());
			moviesResponse.setMovieName(movie.getMovieName());
			moviesResponse.setYear(movie.getMetaData().getYear());

			allMoviesList.add(moviesResponse);
		}

		response.setMovieList(allMoviesList);
		return response;
	}
}