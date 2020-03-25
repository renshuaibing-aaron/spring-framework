package com.aaron.ren.ioc.circulardependency.xmltype;

public class PersonA {
	public void setPersonB(PersonB personB) {
		this.personB = personB;
	}

	private PersonB personB;
}
