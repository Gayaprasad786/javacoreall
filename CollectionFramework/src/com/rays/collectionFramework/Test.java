package com.rays.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Test {
public static void main(String[] args) 
	{
		marksheet m1 = new marksheet();
		
		m1.setRoll_no("1");
		m1.setName("Bulbul");
		m1.setLastname("Sharma");
		m1.setChemistry("87");
		m1.setMaths("76");
		m1.setPhysics("76");
		
marksheet m2 = new marksheet();
		
		m2.setRoll_no("2");
		m2.setName("Bulbul");
		m2.setLastname("Chauhan");
		m2.setChemistry("67");
		m2.setMaths("74");
		m2.setPhysics("72");

marksheet m3 = new marksheet();
		
		m3.setRoll_no("5");
		m3.setName("Chetna");
		m3.setLastname("mishra");
		m3.setChemistry("89");
		m3.setMaths("72");
		m3.setPhysics("71");

marksheet m4 = new marksheet();
		
		m4.setRoll_no("4");
		m4.setName("Chetna");
		m4.setLastname("lahoti");
		m4.setChemistry("89");
		m4.setMaths("70");
		m4.setPhysics("75");

marksheet m5= new marksheet();
		
		m5.setRoll_no("3");
		m5.setName("Reena");
		m5.setLastname("sharma");
		m5.setChemistry("88");
		m5.setMaths("66");
		m5.setPhysics("70");

    ArrayList a = new ArrayList ();
    a.add(m1);
    a.add(m2);
    a.add(m3);
    a.add(m4);
    a.add(m5);
   
    OrderByName b =new OrderByName ();
     
    Collections.sort(a,b); 
    
    Iterator it =a.iterator();
	while (it.hasNext()) {
	marksheet m = (marksheet) it.next();
	System.out.println("roll_no="+ m.getRoll_no() + " "+"name="+ m.getName()+ " "+"Lastname="+ m.getLastname()
	+" "+"Chemisty="+ m.getChemistry()+ " "+"physics="+ m.getPhysics()+ " "+"maths="+ m.getMaths());
			
    }
	}

	}


