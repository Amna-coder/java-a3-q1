
public class TestSquare {
	public static void main(String args[])
	{
	Square aSquare;
	aSquare= new Square("pink",true,2.0,2.0,2.0);
	System.out.println(aSquare.toString());
	aSquare.setColor("pink");
	System.out.println(aSquare);
	System.out.println("(if filled then true otherwise false)  "+aSquare.isFilled());
	}
}
