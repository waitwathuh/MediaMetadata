package com.mediametadata.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediametadata.dao.iface.IMoviesDAO;
import com.mediametadata.dao.iface.ISeriesDAO;
import com.mediametadata.factories.MapSearchMovieByNameResponse;
import com.mediametadata.factories.MapSearchSerieByNameResponse;
import com.mediametadata.request.SearchMovieNameRequest;
import com.mediametadata.request.SearchSerieNameRequest;
import com.mediametadata.response.SearchMovieNameResponse;
import com.mediametadata.response.SearchSerieNameResponse;
import com.mediametadata.services.iface.ISearches;

@Service
public class Searches implements ISearches
{
	@Autowired
	private IMoviesDAO moviesDAO;

	@Autowired
	private ISeriesDAO seriesDAO;

	public SearchMovieNameResponse searchMovieByName(SearchMovieNameRequest searchMovieName)
	{
		return MapSearchMovieByNameResponse.map(moviesDAO.searchMovieByName(searchMovieName.getName()));
	}

	public SearchSerieNameResponse searchSerieByName(SearchSerieNameRequest searchSerieName)
	{
		return MapSearchSerieByNameResponse.map(seriesDAO.searchSeriesByName(searchSerieName.getName()));
	}
}