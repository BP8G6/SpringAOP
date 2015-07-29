package com.vamsee.spring.ioc.service.impl;

import java.util.List;

import com.vamsee.spring.ioc.beans.News;
import com.vamsee.spring.ioc.dao.NewsDAO;
import com.vamsee.spring.ioc.service.GenericService;

public class GenericServiceImpl implements GenericService {
		private NewsDAO newsDAO;
		
	public void setNewsDAO(NewsDAO newsDAO) {
			this.newsDAO = newsDAO;
		}

	@Override
	public List<News> getEveryNews() {
		// TODO Auto-generated method stub
		return newsDAO.getAllNews();
	}

	@Override
	public News getSpecificNewsById() {
		// TODO Auto-generated method stub
		return newsDAO.getNewsById(2L);
	}

	@Override
	public News getExceptionalNews() {
		// TODO Auto-generated method stub
		try {
			return (News) newsDAO.getCrazyNews();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

}
