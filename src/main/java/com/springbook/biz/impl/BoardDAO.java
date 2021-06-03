package com.springbook.biz.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.util.SqlSessionFactoryBean;

public class BoardDAO {
	private SqlSession mybatis;
	
	public BoardDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoard", vo);
		mybatis.commit();
	}
	
	public void updateBoard(BoardVO vo) {
		mybatis.update("BoardDAO.updateBoard", vo);
		mybatis.commit();
	}
	
	public void deleteBoard(BoardVO vo) {
		mybatis.delete("BoardDAO.deleteBoard", vo);
		mybatis.commit();
	}
	
	public BoardVO getBoard(BoardVO vo) {
		BoardVO board = mybatis.selectOne("BoardDAO.getBoard", vo);
		return board;
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){
		List<BoardVO> getBoardList = mybatis.selectList("BoardDAO.getBoardList", vo);
		return getBoardList;
	}
	
	public List<BoardVO> seqBoardList(BoardVO vo){
		List<BoardVO> boardList = mybatis.selectList("BoardDAO.seqBoardList", vo);
		return boardList;
	}
}
