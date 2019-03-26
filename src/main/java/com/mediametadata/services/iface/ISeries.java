package com.mediametadata.services.iface;

import com.mediametadata.response.GetAllSeriesListResponse;
import com.mediametadata.response.SeriesDetailsResponse;

public interface ISeries
{
	public GetAllSeriesListResponse getAllSeries();
	public SeriesDetailsResponse getSeriesDetails(String seriesId);
}