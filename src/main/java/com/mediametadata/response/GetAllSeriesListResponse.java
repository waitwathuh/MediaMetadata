package com.mediametadata.response;

import java.util.List;

public class GetAllSeriesListResponse
{
	private List<SeriesResponse> seriesList;

	public GetAllSeriesListResponse()
	{
		
	}

	public List<SeriesResponse> getSeriesList()
	{
		return seriesList;
	}

	public void setSeriesList(List<SeriesResponse> seriesList)
	{
		this.seriesList = seriesList;
	}
}