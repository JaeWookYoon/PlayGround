package com.sinabro.user.board.service;

import com.sinabro.user.board.dao.BoardDao;

public class DeleteArticleServiceImpl implements DeleteArticleService{

	private BoardDao boardDao;
	
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	@Override
	public String getPass(Integer num) {
		// TODO Auto-generated method stub
		return this.boardDao.getPass(num);
	}

	@Override
	public void deleteArticle(Integer num) {
		this.boardDao.deleteArticle(num);
	}
}
