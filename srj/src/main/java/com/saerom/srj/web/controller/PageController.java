package com.saerom.srj.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@GetMapping("{url1}/{url2}")
	public ModelAndView about(@PathVariable("url1") String url1, @PathVariable("url2") String url2) {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName(url1+"/"+url2);
		return mav;
	}
}
