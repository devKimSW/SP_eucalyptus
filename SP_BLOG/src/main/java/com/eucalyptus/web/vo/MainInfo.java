package com.eucalyptus.web.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MainInfo {     

	/* 블로그 명 */
	public String blogName;
	/* 블로그 사용자 닉네임 */
	public String userNickname;
	/* 블로그 설명 */
	public String blogDescription;
	/* 블로그 파비콘 이미지 경로 */
	public String faviconPath;
	/* 카테고리 no */
	public int categoryNo;
	/* 카테고리 명 */
	public String categoryName;
	
}
