package com.aaron.ren.ioc.threetypes.xml;


import java.util.Date;

public class WeaponXml {

	//这里为了测试spring的类型转换功能
	private Integer type;

	public WeaponXml() {
		System.out.println("【构造器】调用WeaponXml的构造器实例化");
	}


	public Integer  getType() {
		return type;
	}

	public void setType(Integer  type) {
		this.type = type;
	}

}