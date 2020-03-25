package com.aaron.ren.ioc.threetypes.xml;


public class BraveKnightXml {

	private WeaponXml weaponXml;

	public BraveKnightXml(WeaponXml weaponXml) {
		System.out.println("【构造器】调用BraveKnightXml的参数构造器实例化");
		this.weaponXml = weaponXml;
	}

	public WeaponXml getWeaponXml() {
		return weaponXml;
	}

	public void setWeaponXml(WeaponXml weaponXml) {
		this.weaponXml = weaponXml;
	}
	public BraveKnightXml() {
		System.out.println("【构造器】调用BraveKnightXml的无参数构造器实例化");
	}
}