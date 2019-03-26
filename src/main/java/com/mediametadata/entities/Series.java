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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table( name = "Series" )
public class Series
{
	public static final String SELECT_ALL = "FROM Series";

	public static final String SELECT_BY_SERIES_ID = "FROM Series S WHERE S.id = :seriesId";
	public static final String PARAM_SERIES_ID = "seriesId";

	public static final String FIND_BY_NAME = "FROM Series S WHERE LOWER(S.seriesName) LIKE CONCAT('%', :seriesName, '%')";
	public static final String PARAM_SERIES_NAME = "seriesName";

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "SeriesId" )
	private long id;

	@NotNull
	@Column( name = "SeriesName" )
	private String seriesName;

	@OneToOne
	@JoinColumn( name = "MetaDataId" )
	private MetaData metaData;

	@OneToMany
	private List<Season> seasonList;

	public Series()
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

	public String getSeriesName()
	{
		return seriesName;
	}

	public void setSeriesName(String seriesName)
	{
		this.seriesName = seriesName;
	}


	public MetaData getMetaData()
	{
		return metaData;
	}


	public void setMetaData(MetaData metaData)
	{
		this.metaData = metaData;
	}

	public List<Season> getSeasonList()
	{
		return seasonList;
	}

	public void setSeasonList(List<Season> seasonList)
	{
		this.seasonList = seasonList;
	}
}