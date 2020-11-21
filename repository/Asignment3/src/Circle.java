import java.util.Scanner;

public  class Circle extends Shape {
	Scanner input=new Scanner(System.in);
	Shape circleSh=new Shape();
	double radius=1.0;
	Circle(){
		radius=0;
	}
	

	Circle(String c,Boolean fill,double r)
	{
		super(c,fill);
		radius=r;
	}
	double getRad()
	 {
		System.out.println("Enter Radius of circle");
		radius=input.nextFloat();
		return radius;
	 }
	 void setRad(double rd)
	 {
	 	radius=rd;
	 }
	 double getArea()
	 {
		 System.out.println("Area of Circle =  "+(3.14*radius*radius));
		return (3.14*radius*radius);
	 }
	 double getPerimeter()
	 {
		 System.out.println("Perimeter of Circle =  "+(2*3.14*radius));
		 return(2*3.14*radius);
	 }
	 public String toString()
	 {
	 	
	  return ( "A Circle with " +radius+ " " +circleSh.toString());
	 }
	
}