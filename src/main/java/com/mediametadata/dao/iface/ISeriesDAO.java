package com.mediametadata.dao.iface;

import java.util.List;

import com.mediametadata.entities.Series;

public interface ISeriesDAO
{
	public List<Series> getAllSeries();
	public Series getSeriesDetails(String seriesId);
	public List<Series> searchSeriesByName(String name);
}