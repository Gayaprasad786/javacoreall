package com.rays.collectionFramework;

import java.util.Comparator;

public class OrderByName implements Comparator<marksheet>
{
	public int compare(marksheet m1, marksheet m2) 
	{
		if(m1.getName()==m2.getName())
		{
			return (m1.getLastname().compareTo(m2.getLastname()));
		}
		else
		{
		return m1.getName().compareTo(m2.getName());
		}
	}
}
