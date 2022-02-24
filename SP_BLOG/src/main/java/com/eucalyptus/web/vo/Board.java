package com.eucalyptus.web.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {     
	
	/* 게시판 no */
	public int boardNo;
	/* 카테고리 no */
	public int categoryNo;
	/* 게시글 제목 */
	public String title;
	/* 게시글 내용 */
	public String contents;
	/* 게시글 조회수 */
	public int hits;
	/* 비밀글 여부 */
	public String secretYn;
	/* 삭제 여부 */
	public String deleteYn;
	/* 게시글 등록 일자 */
	public String registerDate;
	/* 게시글 등록 id */
	public String registerId;
	/* 게시글 수정 일자 */
	public String updateDate;
	
	/* 게시글 유형 - 카테고리 첫 선택 시 보여질 페이지사 이영 */
	public String type;
	
}
