package com.oopl.www;

public class AutomobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobile am=new Automobile();
		am.setMake("Maruti Suzuki");
		am.setColor("Blue");
		am.setSpeed(50);
		System.out.println("The Maker of Automobile : "+am.getMake());
		System.out.println("The Color Of Automobile : "+am.getColor());
		System.out.println("Accelerator : "+am.acclerator(am.getSpeed()));
		System.out.println("Break : "+am.breakspeed(am.getSpeed()));
		System.out.println("Gear : "+am.gear(am.getSpeed()));

	}

}
