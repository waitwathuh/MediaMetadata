package com.mediametadata.response;

public class ParentalRatingResponse
{
	private long parentalRatingId;

	private String ratingSymbol;

	private String meaning;

	public ParentalRatingResponse()
	{
		
	}

	public long getParentalRatingId()
	{
		return parentalRatingId;
	}

	public void setParentalRatingId(long parentalRatingId)
	{
		this.parentalRatingId = parentalRatingId;
	}

	public String getRatingSymbol()
	{
		return ratingSymbol;
	}

	public void setRatingSymbol(String ratingSymbol)
	{
		this.ratingSymbol = ratingSymbol;
	}

	public String getMeaning()
	{
		return meaning;
	}

	public void setMeaning(String meaning)
	{
		this.meaning = meaning;
	}
}