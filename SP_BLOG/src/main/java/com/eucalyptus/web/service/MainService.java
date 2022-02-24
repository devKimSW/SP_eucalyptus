package com.eucalyptus.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eucalyptus.web.mapper.MainMapper;
import com.eucalyptus.web.vo.MainInfo;

@Service
public class MainService {
	
	@Autowired
	MainMapper mainMapper;
	
	public List<MainInfo> selectMainInfo(String nickname) {
		return mainMapper.selectMainInfo(nickname);
	}
	
}
