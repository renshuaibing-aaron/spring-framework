package com.aaron.ren.ioc.xml;


public class BraveKnightXml {

	private WeaponXml weaponXml;

	public BraveKnightXml(WeaponXml weaponXml) {
		this.weaponXml = weaponXml;
	}

	public WeaponXml getWeaponXml() {
		return weaponXml;
	}

	public void setWeaponXml(WeaponXml weaponXml) {
		this.weaponXml = weaponXml;
	}
}