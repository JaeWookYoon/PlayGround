package com.sinabro.user.board.controller;

import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sinabro.user.board.service.WriteService;
import com.sinabro.model.BoardVO;

@Controller
public class WriteController {

   private WriteService writeService;

   public void setWriteService(WriteService writeService) {
      this.writeService = writeService;
   }

   @RequestMapping(value = "writeForm.do",method = RequestMethod.GET)
   public String setView() {
      return "/board/writeForm";
   }

   @RequestMapping(value="writeForm.do",method = RequestMethod.POST)
   public ModelAndView onSubmit(HttpServletRequest request, BoardVO boardVo)throws Exception{
      // �۾��� DB�� ����
      System.out.println("�ϴ� �Ծ�");
      
      this.writeService.insertWriting(boardVo);
      return new ModelAndView("redirect:/list.do");
   }
   
}