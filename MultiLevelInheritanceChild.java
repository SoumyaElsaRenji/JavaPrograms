package package2;

class MultiLevelInheritanceParent2
{
	static void parent2method1()
	{
		System.out.println("Parent2 method 1");
	}
	
	void parent2method2()
	{
		System.out.println("Parent2 method 2");
	}
}

class MultiLevelInheritanceParent1 extends MultiLevelInheritanceParent2
{
	static void parent1method1()
	{
		System.out.println("Parent1 method 1");
	}
	
	void parent1method2()
	{
		System.out.println("Parent1 method 2");
	}
}

public class MultiLevelInheritanceChild extends MultiLevelInheritanceParent1
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
		MultiLevelInheritanceChild obj= new MultiLevelInheritanceChild();
		childmethod1();
		obj.childmethod2();
		parent1method1();
		obj.parent1method2();
		parent2method1();
		obj.parent2method2();
	}
}
