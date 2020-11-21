import java.util.Scanner;
public class Shape {
	Scanner input=new Scanner(System.in);
String color;
Boolean filled;
Shape()
{
	color="green";
	filled=true;

}
Shape(String c,Boolean fill)
{
	color=c;
	filled=fill;

}
Boolean isFilled()
{ 
	return filled;
}
 String getColor()
 {
	System.out.println("Enter Name of Desired color");
	color=input.nextLine();
	return color;
 }
 void setColor(String cl)
 {
 	color=cl;
 }

 void setFilled(boolean f)
 {
 	filled=f;
 }
 public String toString()
 {
	 if(isFilled()==true)
	 {
		 System.out.println(" (this shape is filled) "); 
	 }
	 else
	 {
		 System.out.println(" (this shape is not filled) "); 
	 }
  return ( " shape with  " +color+ " color " );
  
 }
 

 
}
