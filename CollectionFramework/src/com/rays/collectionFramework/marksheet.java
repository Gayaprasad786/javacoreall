
package com.rays.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class marksheet implements Comparable<marksheet>   
{
 private String roll_no; 
 private String name; 
 private String lastname; 
 private String physics; 

private String chemistry; 
 private String maths;
public void setRoll_no(String roll_no)
{
	this.roll_no = roll_no;
}
public void setName(String name) {
	this.name = name;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public void setPhysics(String physics) {
	this.physics = physics;
}
public void setChemistry(String chemistry) {
	this.chemistry = chemistry;

}
public void setMaths(String maths) {
	this.maths = maths;
}

public String getRoll_no() {
	return roll_no;
}
public String getName() {
	return name;
}
public String getLastname() {
	return lastname;
}
public String getPhysics() {
	return physics;
}
public String getChemistry() {
	return chemistry;
}
public String getMaths() {
	return maths;
}
public int compareTo(marksheet m) {
	
	return this.roll_no.compareTo(m.roll_no);
}
 }

