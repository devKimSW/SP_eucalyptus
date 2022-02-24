package com.eucalyptus.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eucalyptus.web.vo.MainInfo;

@Mapper
@Repository
public class MainMapper {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<MainInfo> selectMainInfo(String nickname) {
		return sqlSession.selectList("com.eucalyptus.web.mapper.MainMapper.getMainInfo", nickname);
	}
}
