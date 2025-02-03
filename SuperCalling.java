package package2;

class Parent3
{
	Parent3()
	{
		System.out.println("Parent 3 Constructor");
	}
}

class Parent2  extends Parent3
{
	Parent2(int a)
	{
		super();
		System.out.println("Parent 2 Constructor");
	}
}
class Parent1 extends Parent2
{
	
	Parent1() 
	{
		this(10);
		System.out.println("Parent 1 Plain constructor");
	}
	Parent1(int a) 
	{
		super(10);
		System.out.println("Parent 1 integer constructor "+a);
	}
	
}
public class SuperCalling extends Parent1{

	
	SuperCalling() 
	{
	
		System.out.println("child method");
	}
	
	public static void main(String[] args) {
		
		SuperCalling obj=new SuperCalling(); 
		
	}
}