package com.mediametadata.factories;

import java.util.ArrayList;
import java.util.List;

import com.mediametadata.entities.Series;
import com.mediametadata.response.SeriesResponse;
import com.mediametadata.response.GetAllSeriesListResponse;

public class MapAllSeriesResponse
{
	public static GetAllSeriesListResponse map(List<Series> seriesListFromDB)
	{
		GetAllSeriesListResponse response = new GetAllSeriesListResponse();
		List<SeriesResponse> allMoviesList = new ArrayList<SeriesResponse>();

		for (Series series : seriesListFromDB)
		{
			SeriesResponse seriesResponse = new SeriesResponse();
			seriesResponse.setId(series.getId());
			seriesResponse.setSeriesName(series.getSeriesName());
			seriesResponse.setYear(series.getMetaData().getYear());

			allMoviesList.add(seriesResponse);
		}

		response.setSeriesList(allMoviesList);
		return response;
	}
}