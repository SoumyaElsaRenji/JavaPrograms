package package2;

abstract class ParentClass
{
	abstract void abstractmethod1();
	abstract void abstractmethod2();
	abstract void abstractmethod3();
}
public class AbstractMethodExample extends ParentClass{
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
		AbstractMethodExample obj= new AbstractMethodExample();
		obj.abstractmethod1();
		obj.abstractmethod2();
		obj.abstractmethod3();
	}
}
