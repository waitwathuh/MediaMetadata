package com.mediametadata.response;

import java.util.List;

public class SearchSerieNameResponse
{
	 private List<SeriesResponse> serieList;
 
	 public SearchSerieNameResponse()
	 {
		 
	 }

	public List<SeriesResponse> getSerieList()
	{
		return serieList;
	}

	public void setSerieList(List<SeriesResponse> serieList)
	{
		this.serieList = serieList;
	}
}