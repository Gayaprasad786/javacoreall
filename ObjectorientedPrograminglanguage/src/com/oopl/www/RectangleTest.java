package com.oopl.www;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		r.setBorderWidth(12);
		r.setColor("Red");
		r.setLength(5);
		r.setWidth(15);
		System.out.println("Color : "+r.getColor());
		System.out.println("BorderWidth : "+r.getBorderWidth());
		System.out.println("Length of rectangle : "+r.getLength());
		System.out.println("Width of rectangle : "+r.getWidth());
		System.out.println("Area of Rectangle : "+r.area());

	}

}
