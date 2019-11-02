package com.aaron.ren.ioc.beanProcessor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentEntity {

	private Integer id;

	private String name;

	private Map<String,String> memerories= new HashMap<>();

	public Map<String, String> getMemerories() {
		return memerories;
	}

	public void setMemerories(Map<String, String> memerories) {
		this.memerories = memerories;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentEntity() {
		//  System.out.println("studentEntity initializer....");
	}

	@Override
	public String toString() {
		return "StudentEntity{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	private List<String> hobbies=new ArrayList<>();

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
}