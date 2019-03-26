package com.mediametadata.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mediametadata.dao.iface.IMoviesDAO;
import com.mediametadata.entities.Movie;

@Repository
@Transactional
public class MoviesDAO implements IMoviesDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	public List<Movie> getAllMovies()
	{
		List<Movie> response = new ArrayList<Movie>();

		Session session = sessionFactory.openSession();
		List<?> resultList =  session.createQuery(Movie.SELECT_ALL).getResultList();

		for (Object object : resultList)
		{
			response.add((Movie) object);
		}

		return response;
	}

	public Movie getMovieDetails(String movieId)
	{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(Movie.SELECT_BY_MOVIE_ID);
		query.setParameter(Movie.PARAM_MOVIE_ID, Long.parseLong(movieId));
		return (Movie) query.getSingleResult();
	}

	public List<Movie> searchMovieByName(String name)
	{
		List<Movie> response = new ArrayList<Movie>();

		Session session = sessionFactory.openSession();
		Query query = session.createQuery(Movie.FIND_BY_NAME);
		query.setParameter(Movie.PARAM_MOVIE_NAME, name.toLowerCase());
		List<?> resultList =  query.getResultList();

		for (Object object : resultList)
		{
			response.add((Movie) object);
		}

		return response;
	}
}