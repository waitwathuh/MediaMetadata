package com.mediametadata.factories;

import java.util.ArrayList;
import java.util.List;

import com.mediametadata.entities.Genre;
import com.mediametadata.entities.MetaData;
import com.mediametadata.entities.ParentalRating;
import com.mediametadata.entities.Season;
import com.mediametadata.entities.Series;
import com.mediametadata.response.GenreResponse;
import com.mediametadata.response.MetaDataResponse;
import com.mediametadata.response.SeriesDetailsResponse;
import com.mediametadata.response.ParentalRatingResponse;
import com.mediametadata.response.SeasonResponse;

public class MapSeriesDetailsResponse
{
	public static SeriesDetailsResponse map(Series seriesFromDB)
	{
		ParentalRatingResponse parentalRating = getParentalRating(seriesFromDB.getMetaData().getParentalRating());
		List<GenreResponse> genreList = getGenreResponseList(seriesFromDB.getMetaData().getGenreList());
		MetaDataResponse meta = getMetaDataResponse(parentalRating, genreList, seriesFromDB.getMetaData());
		List<SeasonResponse> seasons = getSeasonList(seriesFromDB.getSeasonList());
		return getResponse(seriesFromDB, meta, seasons);
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

	private static SeriesDetailsResponse getResponse(Series seriesFromDB, MetaDataResponse meta, List<SeasonResponse> seasons)
	{
		SeriesDetailsResponse response = new SeriesDetailsResponse();
		response.setId(seriesFromDB.getId());
		response.setSeriesName(seriesFromDB.getSeriesName());
		response.setMetaData(meta);
		response.setSeasons(seasons);
		return response;
	}

	private static List<SeasonResponse> getSeasonList(List<Season> seasonList)
	{
		List<SeasonResponse> response = new ArrayList<SeasonResponse>();

		for (Season season : seasonList)
		{
			SeasonResponse sr = new SeasonResponse();
			sr.setSeasonId(season.getId());
			sr.setSeasonName(season.getSeasonName());
			sr.setNumberOfEpisodes(season.getNumberOfEpisodes());

			response.add(sr);
		}

		return response;
	}
}