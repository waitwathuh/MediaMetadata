package com.mediametadata.services.iface;

import com.mediametadata.request.SearchMovieNameRequest;
import com.mediametadata.request.SearchSerieNameRequest;
import com.mediametadata.response.SearchMovieNameResponse;
import com.mediametadata.response.SearchSerieNameResponse;

public interface ISearches
{
	public SearchMovieNameResponse searchMovieByName(SearchMovieNameRequest searchMovieName);
	public SearchSerieNameResponse searchSerieByName(SearchSerieNameRequest searchSerieName);
}