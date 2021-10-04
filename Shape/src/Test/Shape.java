package Test;

public class Shape 
{
	String color;
	int borderwidth;
	   float PI= 3.14f;
	
 public int getBoderwidth()
 {
	  return borderwidth;
 }
 public void setBoderwidth(int i)	
 {
	 borderwidth=i;
 }
 public String getColor()
 {
	return color;
	 
 }
 public void setColor(String p)
 {
	color=p; 
 }
 public double getArea()
 {
		
		return 0;
	}	
		
 
 
 
 public static void main(String[] args)
 
 {
	 Shape s1=new Shape();
	 s1.setBoderwidth(7);
	System.out.println("Borderwidth of circle" +s1.getBoderwidth());
	s1.setColor("Color of Circle :"+ "red");
	System.out.println(s1.getColor());
	Circle c = new Circle(3.5);
	System.out.println("Area of Circle : " + c.getArea());
	
	System.out.println();
	
	Rectangle r = new Rectangle(10, 12);
	r.setLength(10);
	System.out.println("length :" + r.getLength());
	System.out.println("Area of Rectangle : " + r.getArea());
	r.setBoderwidth(2);
	System.out.println("Borderwidth of Rectangle" +s1.getBoderwidth());
	
	System.out.println();
	
	Triangle t = new Triangle(12, 2);
	t.setBase(12);
	System.out.println("base:" + t.getBase());
	System.out.println("Area of Triangle : " + t.getArea());
	
}

	
	
}

	

