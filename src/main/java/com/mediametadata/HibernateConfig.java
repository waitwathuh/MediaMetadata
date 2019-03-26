package com.mediametadata;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateConfig
{
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
	    LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	    sessionFactory.setDataSource(dataSource());
	    sessionFactory.setPackagesToScan("com.mediametadata");
	    sessionFactory.setHibernateProperties(hibernateProperties());

	    return sessionFactory;
	}

	@Bean
	public DataSource dataSource()
	{
		BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("org.h2.Driver");
	    dataSource.setUrl("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1");

	    return dataSource;
	}

	private final Properties hibernateProperties()
	{
	    Properties hibernateProperties = new Properties();
	    hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	    hibernateProperties.setProperty("hibernate.show_sql", "true");
	    hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "create");
	    hibernateProperties.setProperty("hibernate.hbm2ddl.import_files", "sql/genre.sql, sql/parentalRating.sql, sql/metaData.sql, sql/movie.sql, sql/season.sql, sql/series.sql");

	    return hibernateProperties;
	}
}