import java.util.Scanner;
public class testShape{
	@SuppressWarnings("resource")
	public static void main(String args[])
	
	{
    Scanner input=new Scanner(System.in);
	Shape aShape= new Shape();
	System.out.println(aShape.toString());
	int n;
	System.out.println("**********Enter size of Square array*********");
	n=input.nextInt();
	Square[] arrSquare=new Square[n];
	
	for(int i=1;i<n;i++)
	{
	    arrSquare[i]=new Square();
		
	}
	
	int choice=1;
	
	do{
		System.out.println("press 1 to enter Rectangle length and width details");
		System.out.println("press 2 display area and perimeter of rectangle");
		System.out.println("press 3 to display square Details");
		System.out.println("**********Enter your choice***********");
		choice=input.nextInt();
		for(int i=1;i<n;i++)
		{
			if(choice==1)
		
             {
	           arrSquare[i].getWidth();
	           arrSquare[i].getLength();	
             }
			
		else if(choice==2)
		{
			
	     arrSquare[i].getArea();     	
          arrSquare[i].getPerimeter();  
		
		}
		else if(choice==3)
		{
			System.out.println(arrSquare[i].toString());
			
		}
			
	}
		
	}while(choice<4);
	}
	

}
