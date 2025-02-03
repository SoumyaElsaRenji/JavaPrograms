package package2;

public class FinalVariableExample {

	final static double pi=3.14;
	final int length=100;
	
	public static void main(String[] args) 
	{	
		FinalVariableExample obj=new FinalVariableExample ();
		final int radius=10;
		System.out.println("Area of the circle="+(pi*radius*radius));
		final int width=20;
		System.out.println("Area of the square="+(obj.length*width));
	}

	
}
