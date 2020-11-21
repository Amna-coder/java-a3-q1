
import java.util.Scanner;

public  class Rectangle extends Shape {
	Scanner input=new Scanner(System.in);
	Shape recShape=new Shape();
	double length=1.0;
	double width=1.0;
	Rectangle(){
		length=0;
		width=0;
	}
	

     Rectangle(String c,Boolean fill,double l,double w)
	{
		super(c,fill);
		length=l;
		width=w;
	}
	double getLength()
	 {
		System.out.println("Enter Length of rectangle");
		length=input.nextFloat();
		return length;
	 }
	 void setLength(double le)
	 {
	 	length=le;
	 }
	 double getWidth()
	 {
		System.out.println("Enter width of rectangle");
		width=input.nextFloat();
		return width;
	 }
	 void setWidth(double we)
	 {
	 	width=we;
	 }
	 double getArea()
	 {
		 System.out.println("Area of rectangle = "+(length*width));
		 return (length*width);
	 }
	   double getPerimeter()
	   {
		   System.out.println("Perimeter of rectangle = " +(2*(length+width)));
		   return (2*(length+width));   
	   }
	 public String toString()
	 {
	 	
	  return ( "A Rectangle with width = " +width+    " & height = " +length+  " " +recShape.toString());
	 }
	
}
