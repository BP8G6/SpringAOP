package com.vamsee.spring.ioc.dao;

import java.util.List;

import com.vamsee.spring.ioc.beans.News;

public interface NewsDAO {
	
	public News getNewsById(Long id);
	public List<News> getAllNews();
	public List<News> getCrazyNews() throws Exception;
	

}
