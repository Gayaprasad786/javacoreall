package com.oopl.www;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.setColor("Blue");
		c.setBorderWidth(10);
		c.setRadius(5);
		System.out.println("Color : "+c.getColor());
		System.out.println("BorderWidth : "+c.getBorderWidth());
		System.out.println("Radius : "+c.getRadius());
		System.out.println("Area of Circle : "+c.area());

	}

}
