package com.mediametadata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mediametadata.request.SearchMovieNameRequest;
import com.mediametadata.request.SearchSerieNameRequest;
import com.mediametadata.response.SearchMovieNameResponse;
import com.mediametadata.response.SearchSerieNameResponse;
import com.mediametadata.services.iface.ISearches;

@Controller
public class Search
{
	@Autowired
	private ISearches searches;

	@RequestMapping( value = "/search/movie/name", method = RequestMethod.POST )
	public @ResponseBody SearchMovieNameResponse searchMovieByName(@RequestBody SearchMovieNameRequest searchMovieName)
	{
		return searches.searchMovieByName(searchMovieName);
	}

	@RequestMapping( value = "/search/serie/name", method = RequestMethod.POST )
	public @ResponseBody SearchSerieNameResponse searchSerieByName(@RequestBody SearchSerieNameRequest searchSerieName)
	{
		return searches.searchSerieByName(searchSerieName);
	}
}