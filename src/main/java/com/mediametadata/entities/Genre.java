package com.mediametadata.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

@Entity
@Table( name = "Genre" )
public class Genre
{
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "GenreId" )
	private long id;

	@NotNull
	@Column( name = "Name" )
	private String name;

	public Genre()
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

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}