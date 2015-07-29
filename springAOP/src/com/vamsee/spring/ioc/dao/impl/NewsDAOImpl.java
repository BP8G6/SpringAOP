package com.vamsee.spring.ioc.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.vamsee.spring.ioc.beans.News;
import com.vamsee.spring.ioc.dao.NewsDAO;

public class NewsDAOImpl implements NewsDAO {

	@Override
	public News getNewsById(Long id) {
		// TODO Auto-generated method stub
		return new News(id, "AAPL releases Iwatch",
				"Apple stock fell because of no innovative products. blah blah....",
				"vamsee", new Date());
	}

	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		List<News> result = new ArrayList<News>();
		result.add(new News(1L, "AAPL releases Iwatch",
				"Apple stock fell because of no innovative products. blah blah....",
				"vamsee-APPLE", new Date()));
		result.add(new News(2L, "Netflix releases 4k streaming",
				"Netflix stock boosted because of next generation HD content streaming. blah blah....",
				"vamsee-NETFLIX", new Date()));
		result.add(new News(3L, "Microsoft releases Windows 8 pro",
				"Micrsoft stock fell because of junk metro style apps which is very annoying. blah blah....",
				"vamsee-MICROSOFT", new Date()));
		result.add(new News(4L, "Google releases Self driving car",
				"Google stock raised 10 points because selft driving car and their innovation stuff. blah blah....",
				"vamsee-GOOGLE", new Date()));
		return result;
	}

	@Override
	public List<News> getCrazyNews() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Crazy Exception");
	}

}
