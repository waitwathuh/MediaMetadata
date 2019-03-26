package com.mediametadata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mediametadata.response.GetAllSeriesListResponse;
import com.mediametadata.response.SeriesDetailsResponse;
import com.mediametadata.services.iface.ISeries;

@Controller
public class Serie
{
	@Autowired
	private ISeries series;

	@RequestMapping( value = "/serie", method = RequestMethod.GET )
	public @ResponseBody GetAllSeriesListResponse getAllSeries()
	{
		return series.getAllSeries();
	}

	@RequestMapping( value = "/serie/{seriesId}", method = RequestMethod.GET )
	public @ResponseBody SeriesDetailsResponse getSeriesDetails(@PathVariable("seriesId") String seriesId)
	{
		return series.getSeriesDetails(seriesId);
	}
}