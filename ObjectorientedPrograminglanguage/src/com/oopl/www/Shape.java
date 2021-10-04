package com.oopl.www;

public abstract class Shape {

	
		private String color;
		private int borderWidth;
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getBorderWidth() {
			return borderWidth;
		}
		public void setBorderWidth(int borderWidth) {
			this.borderWidth = borderWidth;
		} 

	 public abstract double area();

}
