package package2;

class SingleLevelInheritanceParent
{
	static void parentmethod1()
	{
		System.out.println("Parent method 1");
	}
	
	void parentmethod2()
	{
		System.out.println("Parent method 2");
	}
}

public class SingleLevelInheritanceChild extends SingleLevelInheritanceParent
{
	
	static void childmethod1()
	{
		System.out.println("Child method 1");
	}
	
	void childmethod2()
	{
		System.out.println("Child method 2");
	}
	public static void main(String[] args) 
	{
		SingleLevelInheritanceChild obj= new SingleLevelInheritanceChild();
		childmethod1();
		obj.childmethod2();
		parentmethod1();
		obj.parentmethod2();
	}
		
}

