package com.springbook.biz.board;

import java.util.List;

import com.springbook.biz.impl.BoardDAO;

public class BoardServiceClient {
	public static void main(String[] args) {
		BoardDAO boardDAO = new BoardDAO();
		
		BoardVO vo = new BoardVO();
		vo.setTitle("테스트1");
		vo.setWriter("철코");
		vo.setContent("테스트 중입니다.");
		boardDAO.insertBoard(vo);
		
		vo.setSearchKeyword("");
		
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
	}
}
