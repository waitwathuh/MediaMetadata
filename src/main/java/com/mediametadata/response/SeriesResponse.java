package com.mediametadata.response;

public class SeriesResponse
{
	private long id;

	private String seriesName;

	private String year;

	public SeriesResponse()
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

	public String getYear()
	{
		return year;
	}

	public void setYear(String year)
	{
		this.year = year;
	}
}