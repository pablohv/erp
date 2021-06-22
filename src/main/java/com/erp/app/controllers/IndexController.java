package com.erp.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(name = "/")
	public String index(Model model) {
		model.addAttribute("nombre", "hola");
		return "index";
	}
	
	

}
