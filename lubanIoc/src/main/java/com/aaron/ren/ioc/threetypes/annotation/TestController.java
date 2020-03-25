package com.aaron.ren.ioc.threetypes.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
	@Autowired
	private  UserServiceImpl userService;

	public  void  save(){
		System.out.println("==========="+userService);
		userService.test();
	}

}
