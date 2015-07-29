package com.vamsee.spring.ioc.service;

import java.util.List;

import com.vamsee.spring.ioc.beans.News;

public interface GenericService {
	
	public List<News> getEveryNews();
	public News getSpecificNewsById();
	public News getExceptionalNews();

}
