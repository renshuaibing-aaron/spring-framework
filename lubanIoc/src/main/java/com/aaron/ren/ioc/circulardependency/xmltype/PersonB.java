package com.aaron.ren.ioc.circulardependency.xmltype;

public class PersonB {

	public PersonA getPersonA() {
		return personA;
	}

	public void setPersonA(PersonA personA) {
		this.personA = personA;
	}

	private  PersonA personA;
}
