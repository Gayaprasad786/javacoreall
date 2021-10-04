package com.jdbcTestStatement.www;

import java.sql.*;
import java.sql.DriverManager;

public class StatementConn {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         start();
		//insert();
		//delete();
      //update();
         
	}

	public static void start() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

		Connection comm = DriverManager.getConnection("jdbc:mysql://localhost:3306/testrays", "root", "root");

		Statement stmt = comm.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE");

		System.out.println("ID \t fname \t lname \t Salary");

		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.println("\t" + rs.getString(4));
		}

		stmt.close();
		rs.close();

	}
	
	public static void insert() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

		Connection comm = DriverManager.getConnection("jdbc:mysql://localhost:3306/testrays", "root", "root");

		Statement stmt = comm.createStatement();
		//executequery
		
		int i=stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES(11,'RAJAT','JOSHI',100000,4)");

		System.out.print(i+"RecordsINSERTED");
		
		stmt.close();
		comm.close();
		
	}
	
	public static void delete() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

		Connection comm = DriverManager.getConnection("jdbc:mysql://localhost:3306/testrays", "root", "root");

		Statement stmt = comm.createStatement();
		//executequery
		
		int i=stmt.executeUpdate("Delete from employee where id=4");

		System.out.print(i+"RecordsDELETE");
		
		stmt.close();
		comm.close();
	}
	
	public static void update() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

		Connection comm = DriverManager.getConnection("jdbc:mysql://localhost:3306/testrays", "root", "root");

		Statement stmt = comm.createStatement();
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		
		int i=stmt.executeUpdate("UPDATE EMPLOYEE SET FNAME='SHIVAAY',LNAME='RAO',SALARY=50000,DEPT_ID=3 WHERE ID=6");

		System.out.print(i+"RecordsUpdated");
		
		stmt.close();
		comm.close();
		
	} 
		

}
