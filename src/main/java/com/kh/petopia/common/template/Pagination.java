package com.kh.petopia.common.template;

import com.kh.petopia.common.model.vo.PageInfo;

public class Pagination {

	public static PageInfo getPageInfo(int listCount, int currentPage, 
			   int pageLimit, int boardLimit, String dpCount) {

		int maxPage = (int)(Math.ceil((double)listCount/boardLimit));
		int startPage = (currentPage-1)/pageLimit*pageLimit+1;
		int endPage = startPage+pageLimit-1;
				
		if(endPage>maxPage) endPage = maxPage;
		
		return new PageInfo(listCount, currentPage, pageLimit, boardLimit, 
			maxPage, startPage, endPage, dpCount);
		// getPageInfo를 호출할 때 넣은 dpCount값이 그대로 출력된다.
	}
	
}
