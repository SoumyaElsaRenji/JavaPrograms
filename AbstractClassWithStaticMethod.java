package package2;

abstract class ParentClassStatic
{
	abstract void abclass1();
	static void statclass1()
	{
		System.out.println("Static method inside abstract class");
	}
}
public class AbstractClassWithStaticMethod extends ParentClassStatic {
	void abclass1()
	{
		System.out.println("abstract class");
	}
	

	public static void main(String[] args) {
		AbstractClassWithStaticMethod obj= new AbstractClassWithStaticMethod();
		obj.abclass1();
		statclass1();
		
	}
}
