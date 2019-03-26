package com.mediametadata.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table( name = "Movie" )
public class Movie
{
	public static final String SELECT_ALL = "FROM Movie";

	public static final String SELECT_BY_MOVIE_ID = "FROM Movie M WHERE M.id = :movieId";
	public static final String PARAM_MOVIE_ID = "movieId";

	public static final String FIND_BY_NAME = "FROM Movie M WHERE LOWER(M.movieName) LIKE CONCAT('%', :movieName, '%')";
	public static final String PARAM_MOVIE_NAME = "movieName";

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "MovieId" )
	private long id;

	@NotNull
	@Column( name = "MovieName" )
	private String movieName;

	@OneToOne
	@JoinColumn( name = "MetaDataId" )
	private MetaData metaData;

	public Movie()
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


	public MetaData getMetaData()
	{
		return metaData;
	}


	public void setMetaData(MetaData metaData)
	{
		this.metaData = metaData;
	}
}