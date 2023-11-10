package com.kh.petopia.board.model.service;

import java.util.ArrayList;

import com.kh.petopia.board.model.vo.Board;

public interface BoardService {
	
	// 게시판 조회
		// 가장먼저 조회수 카운트
		int selectListCount();
	
		// index에서 전체게시글리스트 조회
		ArrayList<Board> selectSwiperBestBoardList();
	
		// 전체게시글리스트조회
		ArrayList<Board> selectBoardList();
	
	
	// 게시글 상세조회
		// 가장먼저 조회수 증가
		int increaseViewCount(int boardNo);
		
	/*
	 * @EnableTransactionManagement
	 * 
	 * @Transactional 
	 *  method블럭 전체를 '하나'의 트랜잭션으로 처리 => pom.xml에서 등록
	 */		
		// board + fileList + category 조회를 한꺼번에
		Board selectBoard(int boardNo);
		
	// 게시글 작성
	int insertBoard();
	
}
