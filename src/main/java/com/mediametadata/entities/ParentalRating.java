package com.mediametadata.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

@Entity
@Table( name = "ParentalRating" )
public class ParentalRating
{
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "ParentalRatingId" )
	private long id;

	@NotNull
	@Column( name = "RatingSymbol" )
	private String ratingSymbol;

	@NotNull
	@Column( name = "Meaning" )
	private String meaning;

	public ParentalRating()
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