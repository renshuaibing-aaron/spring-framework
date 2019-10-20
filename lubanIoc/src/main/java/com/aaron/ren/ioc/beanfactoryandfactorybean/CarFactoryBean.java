package com.aaron.ren.ioc.beanfactoryandfactorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean {

	private String carInfo;
	public String getCarInfo() {
		return carInfo;

	}
	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;

	}
	@Override
	public Object getObject()  {

		Car car = new Car();
		String[] infos = carInfo.split(",");
		car.setBrand(infos[0]);
		car.setMaxSpeed(Integer.parseInt(infos[1]));
		car.setPrice(Double.parseDouble(infos[2]));
		return car;

	}

	@Override
	public Class getObjectType() {
		return Car.class;

	}

	@Override
	public boolean isSingleton() {
		return true;

	}

}
