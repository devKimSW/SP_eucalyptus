package com.eucalyptus.web.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
	
	public int categoryNo;  
	public String categoryName;
	public int groupNo;    
	public int groupOrder;  
	public int depth;        
	public String useYn;       
	public int userNo;      
	
}
