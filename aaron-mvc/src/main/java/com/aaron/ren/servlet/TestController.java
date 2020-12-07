package com.aaron.ren.servlet;

import com.aaron.ren.bean.MyBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author renshuaibing
 */
@Controller
public class TestController {

	@RequestMapping("sayHello")
	public ModelAndView sayHello(int age, String name) {
		ModelAndView mav = new ModelAndView();
		MyBean bean = new MyBean(age, name);
		mav.addObject("myBean", bean);
		mav.setViewName("sayHello");
		System.out.println(bean.toString());
		return mav;
	}




	@RequestMapping("sayHello2")
	@ResponseBody
	public ModelAndView sayHello2(int age, String name) {
		ModelAndView mav = new ModelAndView();
		MyBean bean = new MyBean(age, name);
		mav.addObject("myBean", bean);
		mav.setViewName("sayHello");
		System.out.println(bean.toString());
		return mav;
	}


	@RequestMapping("sayHello3")
	@ResponseBody
	public Object sayHello3(int age, String name) {
		MyBean bean = new MyBean(age, name);
		System.out.println(bean.toString());
		return bean;
	}
}
