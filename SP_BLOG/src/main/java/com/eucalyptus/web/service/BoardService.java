package com.eucalyptus.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eucalyptus.web.mapper.BoardMapper;
import com.eucalyptus.web.vo.Board;

@Service
public class BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	public List<Board> selectBoardList(String nickname) {
		return boardMapper.selectBoardList(nickname);
	}
	
}
