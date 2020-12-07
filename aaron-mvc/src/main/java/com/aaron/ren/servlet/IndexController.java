package com.aaron.ren.servlet;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/root")
public class IndexController {


	@GetMapping("/index")
	@ResponseBody
	public Map index() {
		System.out.println("====IndexController#index========");

		Map map=new HashMap<String,String>();
		map.put("nihao","ok");
		return map;

		//针对复杂的对象，需要转换器，在WebMvcConfigurer里面进行配置，或者进行xml配置

		//这里需要注意,利用WebMvcConfigurer 需要@EnableWebMvc 这个注解，这个注解的前提是contest里面
		//有DispatcherServlet
	}

	@GetMapping("/index2")
	@ResponseBody
	public String index2() {
		System.out.println("====IndexController#index========");

		return "ok";
	}
}
