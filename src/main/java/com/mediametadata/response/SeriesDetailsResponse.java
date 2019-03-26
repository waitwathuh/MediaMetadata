package com.mediametadata.response;

import java.util.List;

public class SeriesDetailsResponse
{
	private long id;

	private String seriesName;

	private MetaDataResponse metaData;

	private List<SeasonResponse> seasons;

	public SeriesDetailsResponse()
	{
		
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getSeriesName()
	{
		return seriesName;
	}

	public void setSeriesName(String seriesName)
	{
		this.seriesName = seriesName;
	}

	public MetaDataResponse getMetaData()
	{
		return metaData;
	}

	public void setMetaData(MetaDataResponse metaData)
	{
		this.metaData = metaData;
	}

	public List<SeasonResponse> getSeasons()
	{
		return seasons;
	}

	public void setSeasons(List<SeasonResponse> seasons)
	{
		this.seasons = seasons;
	}
}