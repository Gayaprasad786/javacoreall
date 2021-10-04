package Test;

public class Rec extends Shape_2
{
	private int length ;
	private int width ;
	
	public Rec (int length,int width)
	{
		this.length=length;
		this.width=width;
	}
     public double area()
	
	{
		return length*width;
	}
}
