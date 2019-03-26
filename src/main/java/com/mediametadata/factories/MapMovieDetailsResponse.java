package com.mediametadata.factories;

import java.util.ArrayList;
import java.util.List;

import com.mediametadata.entities.Genre;
import com.mediametadata.entities.MetaData;
import com.mediametadata.entities.Movie;
import com.mediametadata.entities.ParentalRating;
import com.mediametadata.response.GenreResponse;
import com.mediametadata.response.MetaDataResponse;
import com.mediametadata.response.MovieDetailsResponse;
import com.mediametadata.response.ParentalRatingResponse;

public class MapMovieDetailsResponse
{
	public static MovieDetailsResponse map(Movie movieFromDB)
	{
		ParentalRatingResponse parentalRating = getParentalRating(movieFromDB.getMetaData().getParentalRating());
		List<GenreResponse> genreList = getGenreResponseList(movieFromDB.getMetaData().getGenreList());
		MetaDataResponse meta = getMetaDataResponse(parentalRating, genreList, movieFromDB.getMetaData());
		return getResponse(movieFromDB, meta);
	}

	private static ParentalRatingResponse getParentalRating(ParentalRating parentalRating)
	{
		ParentalRatingResponse response = new ParentalRatingResponse();
		response.setParentalRatingId(parentalRating.getId());
		response.setMeaning(parentalRating.getMeaning());
		response.setRatingSymbol(parentalRating.getRatingSymbol());
		return response;
	}

	private static List<GenreResponse> getGenreResponseList(List<Genre> genreList)
	{
		List<GenreResponse> response = new ArrayList<GenreResponse>();

		for (Genre genre : genreList)
		{
			GenreResponse gr = new GenreResponse();
			gr.setGenreId(genre.getId());
			gr.setName(genre.getName());

			response.add(gr);
		}

		return response;
	}

	private static MetaDataResponse getMetaDataResponse(ParentalRatingResponse parentalRating, List<GenreResponse> genreList, MetaData metaData)
	{
		MetaDataResponse response = new MetaDataResponse();
		response.setGenreList(genreList);
		response.setParentalRating(parentalRating);
		response.setRuntime(metaData.getRuntime());
		response.setStudio(metaData.getStudio());
		response.setYear(metaData.getYear());

		return response;
	}

	private static MovieDetailsResponse getResponse(Movie movieFromDB, MetaDataResponse meta)
	{
		MovieDetailsResponse response = new MovieDetailsResponse();
		response.setId(movieFromDB.getId());
		response.setMovieName(movieFromDB.getMovieName());
		response.setMetaData(meta);
		return response;
	}
}