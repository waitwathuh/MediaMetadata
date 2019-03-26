package com.mediametadata.factories;

import java.util.ArrayList;
import java.util.List;

import com.mediametadata.entities.Series;
import com.mediametadata.response.SearchSerieNameResponse;
import com.mediametadata.response.SeriesResponse;

public class MapSearchSerieByNameResponse
{
	public static SearchSerieNameResponse map(List<Series> serieListFromDB)
	{
		SearchSerieNameResponse response = new SearchSerieNameResponse();
		List<SeriesResponse> allSeriesList = new ArrayList<SeriesResponse>();

		for ( Series serie : serieListFromDB )
		{
			SeriesResponse seriesResponse = new SeriesResponse();
			seriesResponse.setId(serie.getId());
			seriesResponse.setSeriesName(serie.getSeriesName());
			seriesResponse.setYear(serie.getMetaData().getYear());

			allSeriesList.add(seriesResponse);
		}

		response.setSerieList(allSeriesList);
		return response;
	}
}