import java.util.Scanner;

public class Square extends  Rectangle {
	Scanner input=new Scanner(System.in);
	Rectangle objRec=new Rectangle();
	double side;
	Square(){
		side=0;
	}
	

	Square(String c, Boolean fill,double w,double l,double s)
	{
		super(c,fill,l,w);
		side=s;
	}
	double getSide()
	 {
		System.out.println("Enter Side of square");
		side=input.nextFloat();
		return side;
	 }
	 void setSide(double si)
	 {
	 	side=si;
	 }
	 
	 public String toString()
	 {
	 	
	  return ( "A Square with " +side+ " sides & "  +objRec.toString());
	 }
	 void setLength()
	 {
	 	length=2.5;
	 }
	 void setWidth()
	 {
	 	width=3.5;
	 }
	
}
