package package2;

interface intrfc
{
	void intm1();
}
abstract class absclas implements intrfc
{
	abstract void absm1();
}

public class Intabsclassclass extends absclas{
	
	public void intm1()
	{
		System.out.println("Interface method");
	}
	void absm1()
	{
		System.out.println("Abstract class method");
	}
	public static void main(String[] args) 
	{
		Intabsclassclass obj= new Intabsclassclass();
		obj.intm1();
		obj.absm1();
	}
}
