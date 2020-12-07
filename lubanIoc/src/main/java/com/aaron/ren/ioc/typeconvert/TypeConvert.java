package com.aaron.ren.ioc.typeconvert;

import com.aaron.ren.ioc.threetypes.xml.BraveKnightXml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TypeConvert {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springtypeconvert.xml");

		Student student = context.getBean(Student.class);

		System.out.println(student.getBirthday());


	}
}
