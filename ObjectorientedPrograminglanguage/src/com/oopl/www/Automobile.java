package com.oopl.www;

public class Automobile {
	
	private String color;
	private int speed;
	private String make;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public int acclerator(int speed) {
		if(speed<50) {
			speed+=20;
		}
		System.out.println("Speed is much to Accelerate ");
		return speed;
	}
	
	public int breakspeed(int speed) {
		if(speed<=20) {
			System.out.println("No Recuirement of break");
		}else {
			speed-=10;
		}
		return speed; 
	}
	
	public int gear(int speed) {
		if(speed<=20) {
			System.out.println("Car in 1st Gear");
			speed+=10;
		}
		else if(speed>=21 && speed<=40) {
			System.out.println("Car in 2nd Gear");
			speed+=10;
		}
		else if(speed>=41 && speed<=60) {
			System.out.println("Car in 3rd Gear");
			speed-=10;
		}
		else if(speed>=61 && speed<=80) {
			System.out.println("Car in 4th Gear");
			speed-=10;
		}
		else if(speed>=81 && speed<=100) {
			System.out.println("Car in 5th gear");
			speed-=10;
		}
		return speed;
	}
}
