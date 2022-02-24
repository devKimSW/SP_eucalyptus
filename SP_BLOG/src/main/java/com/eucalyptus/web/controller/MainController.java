package com.eucalyptus.web.controller;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.eucalyptus.web.service.BoardService;
import com.eucalyptus.web.service.MainService;
import com.eucalyptus.web.vo.Board;
import com.eucalyptus.web.vo.MainInfo;
import com.eucalyptus.web.vo.ReturnValue;
import com.eucalyptus.web.vo.ReturnValue.StatusEnum;

@RestController
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@Autowired
	BoardService boardService;
	

	@GetMapping("/blog/{nickname}")
	public ResponseEntity<ReturnValue> mainPage(HttpServletRequest request
			, @PathVariable String nickname) {
		
		ReturnValue rv = new ReturnValue();
		HttpHeaders header = new HttpHeaders();
		header.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
	
		HashMap<String, Object> resultData = new HashMap<>(); 
		
		// 메인 기본 정보 + 카테고리 목록 조회
		List<MainInfo> mainInfo = mainService.selectMainInfo(nickname);
		resultData.put("mainInfo", mainInfo);
		
		// 카테고리 인기글 및 최신글 목록 조회
		List<Board> boardListByCategory = boardService.selectBoardList(nickname);
		resultData.put("boardList", boardListByCategory);
		
		rv.setStatus(StatusEnum.OK);
		rv.setMessage("success");
		rv.setData(resultData);
		
		return new ResponseEntity<>(rv, header, HttpStatus.OK);
	}
}
