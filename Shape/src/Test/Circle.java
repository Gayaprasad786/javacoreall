package Test;

class Circle extends Shape
   
    {
	   float PI= 3.14f;
	   
	  private double radius;
	
	  
	  public Circle(double radius) 
	  {
	    this.radius = radius; 
	  }
	  public double getArea() 
	  {
		
		  return  3.14 * radius * radius;
	 
	  }
	
	}
class Rectangle extends Shape
{
	private int length ;
	private int width ;
	public Rectangle (int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	public int getLength() {
		return length;
	}
	
    public void setLength(int length) {
		this.length = length;
	}
	 public double getArea() 
	  {
		
		 return length*width;
	 
	  }
}
class Triangle extends Shape_2
{
	private int base ;
	private int hight ;


public double getArea() 
{
	return 1.5*base*hight;
	  
}
public int getBase()
{
	return base;
}
public void setBase(int base)
{
	this.base = base;
}
public Triangle (int base,int hight)
{
	this.base = base;
	this.hight = hight;
}





}

