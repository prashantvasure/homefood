package com.rest;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class AppController {

	@RequestMapping("/")
	String home(ModelMap modal) {
		modal.addAttribute("title","CRUD Example");
		return "index";
	}

	@RequestMapping("/partials/{page}")
	String partialHandler(@PathVariable("page") final String page) {
		return page;
	}

}
