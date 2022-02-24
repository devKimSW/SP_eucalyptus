package com.eucalyptus.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eucalyptus.web.vo.Board;

@Mapper
@Repository
public class BoardMapper {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<Board> selectBoardList(String nickname) {
		return sqlSession.selectList("com.eucalyptus.web.mapper.BoardMapper.getBoardList", nickname);
	}
}
