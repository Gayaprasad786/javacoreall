package Test;

public class Trgl extends Shape_2
{
	private int base ;
	private int hight ;
	public static final float a =1.5f ;


public Trgl (int base,int hight)
{
	this.base = base;
	this.hight = hight;
}

public double area() 
{
	return 0.5*base*hight;
	  
}
}
