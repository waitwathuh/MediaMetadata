package com.mediametadata.response;

import java.util.List;

public class MetaDataResponse
{
	private List<GenreResponse> genreList;

	private ParentalRatingResponse parentalRating;

	private String studio;

	private String year;

	private String runtime;

	public MetaDataResponse()
	{
		
	}

	public List<GenreResponse> getGenreList()
	{
		return genreList;
	}

	public void setGenreList(List<GenreResponse> genreList)
	{
		this.genreList = genreList;
	}

	public ParentalRatingResponse getParentalRating()
	{
		return parentalRating;
	}

	public void setParentalRating(ParentalRatingResponse parentalRating)
	{
		this.parentalRating = parentalRating;
	}

	public String getStudio()
	{
		return studio;
	}

	public void setStudio(String studio)
	{
		this.studio = studio;
	}

	public String getYear()
	{
		return year;
	}

	public void setYear(String year)
	{
		this.year = year;
	}

	public String getRuntime()
	{
		return runtime;
	}

	public void setRuntime(String runtime)
	{
		this.runtime = runtime;
	}
}