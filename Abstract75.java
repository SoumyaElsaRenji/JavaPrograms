package package2;

abstract class Parent75
{
	abstract void abstractmethod1();
	abstract void abstractmethod2();
	abstract void abstractmethod3();
	void method4()
	{
		System.out.println("Concrete class 1");
	}
	
}
public class Abstract75 extends Parent75{
	void abstractmethod1()
	{
		System.out.println("Logic of abstractmethod 1");
	}
	void abstractmethod2()
	{
		System.out.println("Logic of abstractmethod 2");
	}
	void abstractmethod3()
	{
		System.out.println("Logic of abstractmethod 3");
	}
	
	public static void main(String[] args) {
		Abstract75 obj= new Abstract75();
		obj.abstractmethod1();
		obj.abstractmethod2();
		obj.abstractmethod3();
		obj.method4();

}
}
