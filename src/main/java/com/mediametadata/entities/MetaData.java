package com.mediametadata.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
@Table( name = "MetaData" )
public class MetaData
{
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "MetaDataId" )
	private long id;

	@ManyToMany
	private List<Genre> genreList;

	@OneToOne
	@JoinColumn( name = "ParentalRatingId" )
	private ParentalRating parentalRating;

	// TODO - String list of People

	@NotNull
	@Column( name = "Studio" )
	private String studio;

	// TODO - Create and link to list of Tags

	@NotNull
	@Column( name = "Year" )
	private String year;

	@NotNull
	@Column( name = "Runtime" )
	private String runtime;

	public MetaData()
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

	public List<Genre> getGenreList()
	{
		return genreList;
	}

	public void setGenreList(List<Genre> genreList)
	{
		this.genreList = genreList;
	}

	public ParentalRating getParentalRating()
	{
		return parentalRating;
	}

	public void setParentalRating(ParentalRating parentalRating)
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