package package2;

abstract class Parent50
{
	abstract void abstractmethod1();
	abstract void abstractmethod2();
	void abstractmethod3()
	{
		System.out.println("Concrete method 1");
	}
	static void abstractmethod4()
	{
		System.out.println("Concrete method 2");
	}
	
}

public class Abstract50 extends Parent50{
	
		void abstractmethod1()
		{
			System.out.println("Logic of abstractmethod 1");
		}
		void abstractmethod2()
		{
			System.out.println("Logic of abstractmethod 2");
		}
		
		public static void main(String[] args) {
			Abstract50 obj= new Abstract50();
			obj.abstractmethod1();
			obj.abstractmethod2();
		}
	}
