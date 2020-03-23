package com.dby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DbyController {

	@RequestMapping("/index")
	private String index() {
		return "index";
	}
}
