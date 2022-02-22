package com.eucalyptus.web.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eucalyptus.web.mapper.CategoryMapper;
import com.eucalyptus.web.vo.Category;

@Service
public class CategoryService {
	
	@Autowired
	CategoryMapper categoryMapper;
	
	public List<Category> getCategoryList(String userId) {
		return categoryMapper.getCategoryList(userId);
	}
	
}
