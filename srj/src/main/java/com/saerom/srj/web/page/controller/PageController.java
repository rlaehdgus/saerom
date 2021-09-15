package com.saerom.srj.web.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@GetMapping("{mainMenu}/{subMenu}")
	public ModelAndView about(@PathVariable("mainMenu") String mainMenu, @PathVariable("subMenu") String subMenu) {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName(mainMenu+"/"+subMenu);
		return mav;
	}
}
