package com.mediametadata.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

@Entity
@Table( name = "Season" )
public class Season
{
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "SeasonId" )
	private long id;

	@NotNull
	@Column( name = "SeasonName" )
	private String seasonName;

	@NotNull
	@Column( name = "NumberOfEpisodes" )
	private int numberOfEpisodes;

	public Season()
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
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