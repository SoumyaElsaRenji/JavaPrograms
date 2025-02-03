package package2;

class Parent
{
	void methodoverloading()
	{
		System.out.println("Parent method");
	}
	void methodoverloading2(int a,int b)
	{
		System.out.println("Parent method addition= "+(a+b));
	}
}

public class SuperKeyword extends Parent{
	
	void methodoverloading()
	{
		System.out.println("Child method");
		super.methodoverloading();
	}
	void methodoverloading2(int a,int b)
	{
		System.out.println("Child method addition= "+(a+b));
		super.methodoverloading2(20,20);
	}
	public static void main(String[] args) 
	{
		SuperKeyword obj= new SuperKeyword();
		obj.methodoverloading();
		obj.methodoverloading2(10,20);
		
	}

}
