package com.eucalyptus.web.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eucalyptus.web.service.CategoryService;
import com.eucalyptus.web.vo.Category;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;

	@GetMapping("/selectCategoryList")
	public Object restApiTest(HttpServletRequest request) {
		
		HashMap<String, Object> resultMap = new HashMap<>();
		
		List<Category> resultList = categoryService.getCategoryList(request.getParameter("userId").toString());
		
		resultMap.put("status", "200");
		resultMap.put("message", "success");
		resultMap.put("data", resultList);
		
		return resultMap;
	}
}
