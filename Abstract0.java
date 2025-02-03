package package2;

abstract class Parent0
{
	void method1()
	{
		System.out.println("Concrete method 1");
	}
	static void method2()
	{
		System.out.println("Concrete method 2");
	}
	void method3()
	{
		System.out.println("Concrete method 1");
	}
	static void method4()
	{
		System.out.println("Concrete method 2");
	}
	
}
public class Abstract0 extends Parent0{
	public static void main(String[] args) {
		Abstract0 obj= new Abstract0();
		obj.method1();
		obj.method3();
		method2();
		method4();
	}

}
