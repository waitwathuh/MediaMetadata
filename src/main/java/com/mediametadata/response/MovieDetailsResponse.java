package com.mediametadata.response;

public class MovieDetailsResponse
{
	private long id;

	private String movieName;

	private MetaDataResponse metaData;

	public MovieDetailsResponse()
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

	public String getMovieName()
	{
		return movieName;
	}

	public void setMovieName(String movieName)
	{
		this.movieName = movieName;
	}

	public MetaDataResponse getMetaData()
	{
		return metaData;
	}

	public void setMetaData(MetaDataResponse metaData)
	{
		this.metaData = metaData;
	}
}