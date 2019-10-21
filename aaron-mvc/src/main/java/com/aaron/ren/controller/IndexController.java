package com.aaron.ren.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {


	@PostMapping("/index")
	@ResponseBody
	public String index() {
		System.out.println("====IndexController#index========");
		return "ok";
	}
}
