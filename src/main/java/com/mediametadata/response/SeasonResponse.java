package com.mediametadata.response;

public class SeasonResponse
{
	private long seasonId;

	private String seasonName;

	private int numberOfEpisodes;

	public SeasonResponse()
	{
		
	}

	public long getSeasonId()
	{
		return seasonId;
	}

	public void setSeasonId(long seasonId)
	{
		this.seasonId = seasonId;
	}

	public String getSeasonName()
	{
		return seasonName;
	}

	public void setSeasonName(String seasonName)
	{
		this.seasonName = seasonName;
	}

	public int getNumberOfEpisodes()
	{
		return numberOfEpisodes;
	}

	public void setNumberOfEpisodes(int numberOfEpisodes)
	{
		this.numberOfEpisodes = numberOfEpisodes;
	}
}