package com.oopl.www;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle();
		t.setColor("Orange");
		t.setBorderWidth(45);
		t.setBase(5);
		t.setHeigth(16);
		System.out.println("Color : "+t.getColor());
		System.out.println("BorderWidth : "+t.getBorderWidth());
		System.out.println("Base : "+t.getBase());
		System.out.println("heigth : "+t.getHeigth());
		System.out.println("Area of triangle "+t.area());

	}

}
