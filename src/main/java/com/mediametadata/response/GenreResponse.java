package com.mediametadata.response;

public class GenreResponse
{
	private long genreId;

	private String name;

	public GenreResponse()
	{
		
	}

	public long getGenreId()
	{
		return genreId;
	}

	public void setGenreId(long genreId)
	{
		this.genreId = genreId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}