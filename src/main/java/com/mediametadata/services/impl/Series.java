package com.mediametadata.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediametadata.dao.iface.ISeriesDAO;
import com.mediametadata.factories.MapAllSeriesResponse;
import com.mediametadata.factories.MapSeriesDetailsResponse;
import com.mediametadata.response.GetAllSeriesListResponse;
import com.mediametadata.response.SeriesDetailsResponse;
import com.mediametadata.services.iface.ISeries;

@Service
public class Series implements ISeries
{
	@Autowired
	private ISeriesDAO seriesDAO;

	public GetAllSeriesListResponse getAllSeries()
	{
		return MapAllSeriesResponse.map(seriesDAO.getAllSeries());
	}

	public SeriesDetailsResponse getSeriesDetails(String seriesId)
	{
		return MapSeriesDetailsResponse.map(seriesDAO.getSeriesDetails(seriesId));
	}
}