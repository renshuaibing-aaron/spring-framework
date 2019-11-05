package com.aaron.ren.ioc.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentA {

	@Autowired
	private StudentB studentB ;

	public void setStudentB(StudentB studentB) {
		this.studentB = studentB;
	}

	public StudentA() {
	}

	public StudentA(StudentB studentB) {
		this.studentB = studentB;
	}
}