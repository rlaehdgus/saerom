package com.saerom.srj.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@GetMapping(value="/main")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("main/main");
		return mav;
	}
}
