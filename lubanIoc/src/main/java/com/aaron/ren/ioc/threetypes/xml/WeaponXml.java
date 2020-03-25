package com.aaron.ren.ioc.threetypes.xml;


public class WeaponXml {

	private String type;

	public WeaponXml() {
		System.out.println("【构造器】调用WeaponXml的构造器实例化");
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}