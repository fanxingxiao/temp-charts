package com.zdjy.bigdata.temp_charts.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping({"","/","/index"})
	public String toIndex(){
		return "index";
	}
}
