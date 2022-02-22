package com.eucalyptus.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eucalyptus.web.vo.Category;

@Mapper
@Repository
public class CategoryMapper {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<Category> getCategoryList(String userId) {
		return sqlSession.selectList("com.eucalyptus.web.mapper.CategoryMapper.getCategoryList", userId);
	}
}
