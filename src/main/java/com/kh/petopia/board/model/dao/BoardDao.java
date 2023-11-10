package com.kh.petopia.board.model.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.kh.petopia.board.model.vo.Board;

public class BoardDao {

	
	public int selectListCount(SqlSessionTemplate sqlSession) {
		return sqlSession.selectOne("boardMapper.selectListCount");
		// 개수로 돌아오는 것은 selectList가 아니라 selectOne
		
	}
				
	
	
	public Board selectBoardList(SqlSessionTemplate sqlSession, int boardNo) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("boardMapper.selectBoardList", boardNo);
	}
	
	
}
