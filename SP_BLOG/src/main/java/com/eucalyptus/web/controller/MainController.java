package com.eucalyptus.web.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eucalyptus.web.service.BoardService;
import com.eucalyptus.web.service.MainService;
import com.eucalyptus.web.vo.Board;
import com.eucalyptus.web.vo.MainInfo;

@RestController
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@Autowired
	BoardService boardService;
	

	@GetMapping("/blog/{nickname}")
	public Object restApiTest(HttpServletRequest request
			, @PathVariable String nickname) {
		
		HashMap<String, Object> resultMap = new HashMap<>();		
		HashMap<String, Object> resultData = new HashMap<>(); 
		
		// 메인 기본 정보 + 카테고리 목록 조회
		List<MainInfo> mainInfo = mainService.selectMainInfo(nickname);
		resultData.put("mainInfo", mainInfo);
		
		// 카테고리 인기글 및 최신글 목록 조회
		List<Board> boardListByCategory = boardService.selectBoardList(nickname);
		resultData.put("boardList", boardListByCategory);
		
				
		resultMap.put("status", "200");
		resultMap.put("message", "success");
		resultMap.put("data", resultData);
		
		return resultMap;
	}
}
