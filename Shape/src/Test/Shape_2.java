package Test;

import java.util.Iterator;

public  class Shape_2 
{

	 public static void main(String[] args)
		{
		 Shape_2 [] s1 = new Shape_2 [3];
		 s1[0] =new Circle_2(2);
		 s1[1] =new Rec(2,4);
		 s1[2] = new Trgl (3,5);
		 
		 double totalArea = calArea(s1);
		 
		 System.out.println(totalArea);
		 }
	 public double area() 
	 {
	 	return 0.0;
	 	  
	 }
	 
	 public static  double calArea(Shape_2[] s1)
		{
			double totalArea = 0;
			
			for(int i=0;i<s1.length;i++)
			{
			 
				totalArea =totalArea+ s1 [i].area();
			}
			
			return totalArea;
		}
		

}
