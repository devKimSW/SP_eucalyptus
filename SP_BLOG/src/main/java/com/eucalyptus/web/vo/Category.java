package com.eucalyptus.web.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
	
	/* 카테고리 no */
	public int categoryNo;
	/* 카테고리 명 */
	public String categoryName;
	/* 카테고리 그룹 no */
	public int groupNo;
	/* 카테고리 그룹 내 순서 */
	public int groupOrder;
	/* 카테고리 그룹 내 depth */
	public int depth;
	/* 사용 여부 */
	public String useYn;
	/* 사용자(등록자) id */
	public String userId;
	
}
