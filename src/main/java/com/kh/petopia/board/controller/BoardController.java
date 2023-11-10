package com.kh.petopia.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.petopia.board.model.service.BoardService;
import com.kh.petopia.common.model.vo.PageInfo;
import com.kh.petopia.common.template.Pagination;

@Controller
public class BoardController {

	// 0. service 선언
	@Autowired
	private BoardService boardService;
	

	// 1. 개별메서드 서언
	@RequestMapping("list.bo")
	public String selectList(@RequestParam(value="cPage", defaultValue="1") int currentPage, 
									@RequestParam(value="dpCount", defaultValue="4") String dpCount, 
									Model model) {
		
		// 인코딩
		// 페이징처리
			// - dpCount 값뽑기 : 매개변수명과 같을 경우 그대로 담겨짐
		
		int pageLimit = 5;
		int boardLimit = 4;
		
		PageInfo pi = Pagination.getPageInfo(
				boardService.selectListCount(), // service갔다오기
				currentPage, 
				pageLimit, 
				boardLimit,
				dpCount);
		

		// - 페이징처리 값으로 VO가공 : 생략
		
		// 값 담아서 넘기기
		model.addAttribute("list", boardService.selectBoardList());
		model.addAttribute("pi", pi);
		
		// 결과화면 돌려주기 : forward
		return "board/boardList";
		
	}
	
	
	
	
	
}
