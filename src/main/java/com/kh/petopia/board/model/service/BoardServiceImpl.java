package com.kh.petopia.board.model.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.kh.petopia.board.model.dao.BoardDao;
import com.kh.petopia.board.model.vo.Board;

@EnableTransactionManagement
@Service
public class BoardServiceImpl implements BoardService {

	// Field Injection방식
		@Autowired
		private BoardDao boardDao;
		
		@Autowired
		private SqlSessionTemplate sqlSession;
	
		
	@Override
	public int selectListCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Board> selectSwiperBestBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Board> selectBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int increaseViewCount(int boardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	@Transactional
	public Board selectBoard(int boardNo) {
		// TODO Auto-generated method stub
		return Board;
	}

	@Override
	public int insertBoard() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
