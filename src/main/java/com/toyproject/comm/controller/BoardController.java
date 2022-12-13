package com.toyproject.comm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	@GetMapping("main")
	public String main(Model model) {
		return "main";
	}

}
