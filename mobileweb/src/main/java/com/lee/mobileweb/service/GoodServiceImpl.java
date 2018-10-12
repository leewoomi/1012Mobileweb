package com.lee.mobileweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.mobileweb.dao.GoodDao;
import com.lee.mobileweb.domain.Good;

@Service
public class GoodServiceImpl implements GoodService {

	@Autowired
	private GoodDao goodDao;

	@Override
	public List<Good> list() {
		return goodDao.list();
	}

}
