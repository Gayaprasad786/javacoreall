package com.oopl.www;

public class Circle extends Shape {
	
	
	
	private int radius;
	

	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		double pi=3.14;
		double area=(pi*this.radius*this.radius);
		
		return area;
	}
	

}
