package com.sinabro.user.board.controller;

import org.springframework.stereotype.Controller;

import com.sinabro.user.board.service.UpdateArticleService;

@Controller
public class UpdateArticleController {

	private UpdateArticleService updateArticleService;

	public void setUpdateArticleService(UpdateArticleService updateArticleService) {
		this.updateArticleService = updateArticleService;
	}

	
}
