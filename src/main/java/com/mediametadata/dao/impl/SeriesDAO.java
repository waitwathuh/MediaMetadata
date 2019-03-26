package com.mediametadata.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mediametadata.dao.iface.ISeriesDAO;
import com.mediametadata.entities.Series;

@Repository
@Transactional
public class SeriesDAO implements ISeriesDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	public List<Series> getAllSeries()
	{
		List<Series> response = new ArrayList<Series>();

		Session session = sessionFactory.openSession();
		List<?> resultList = session.createQuery(Series.SELECT_ALL).getResultList();

		for (Object object : resultList)
		{
			response.add((Series) object);
		}

		return response;
	}

	public Series getSeriesDetails(String seriesId)
	{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(Series.SELECT_BY_SERIES_ID);
		query.setParameter(Series.PARAM_SERIES_ID, Long.parseLong(seriesId));
		return (Series) query.getSingleResult();
	}

	public List<Series> searchSeriesByName(String name)
	{
		List<Series> response = new ArrayList<Series>();

		Session session = sessionFactory.openSession();
		Query query = session.createQuery(Series.FIND_BY_NAME);
		query.setParameter(Series.PARAM_SERIES_NAME, name);

		List<?> resultList = query.getResultList();

		for (Object object : resultList)
		{
			response.add((Series) object);
		}

		return response;
	}
}