package com.sinabro.user.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sinabro.user.board.service.DeleteArticleService;
import com.sinabro.model.BoardVO;

@Controller
public class DeleteArticleController {

	private DeleteArticleService deleteArticleService;

	public void setDeleteArticleService(DeleteArticleService deleteArticleService) {
		this.deleteArticleService = deleteArticleService;
	}

	@RequestMapping("deleteForm.do")
	public ModelAndView setView(Integer num) {
		ModelAndView mav = new ModelAndView("deleteForm");
		mav.addObject("num", num);
		return mav;
	}

	@RequestMapping(value="deleteForm.do",method = RequestMethod.POST)
	public ModelAndView onSubmit(Integer num, BoardVO boardVo) {
		
		return new ModelAndView();
	}
}
