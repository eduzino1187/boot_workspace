package com.edu.boot0307.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//스프링 부트는 기존의 Legacy의 ApI를 그대로 가져오되, 단지
//설정에 대한 부담만 개발자에게 안준것 뿐이다..따라서  
//@Controller, @Service..

@Controller
public class BoardController {
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/board/list")
	public ModelAndView getList() {
		logger.info("리스트 하위 컨트롤러 작동함");
		
		ModelAndView mav = new ModelAndView("board/list");
		return mav;
	}
}









