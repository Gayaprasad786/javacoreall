package com.javaResourceBundle.www;

import java.util.ResourceBundle;

public class testResourceBundle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle rs=ResourceBundle.getBundle("com.javaResourceBundle.www.app");
		System.out.println(rs.getString("driver"));

	}

}
