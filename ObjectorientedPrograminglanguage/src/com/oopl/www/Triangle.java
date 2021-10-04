package com.oopl.www;

public class Triangle extends Shape{
	
	private int base;
	private int heigth;
	
	

	public int getBase() {
		return base;
	}



	public void setBase(int base) {
		this.base = base;
	}



	public int getHeigth() {
		return heigth;
	}



	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base*heigth)/2;
	}

}
