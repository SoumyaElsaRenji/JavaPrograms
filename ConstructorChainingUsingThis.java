package package2;
public class ConstructorChainingUsingThis {
	
	ConstructorChainingUsingThis() 
	{
		this(10);
		System.out.println("Plain method");
	}
	ConstructorChainingUsingThis(int a) 
	{
		this("Soumya");
		System.out.println("integer method= "+a);
	}
	ConstructorChainingUsingThis(String a) 
	{
		this(true);
		System.out.println("String method= "+a);
	}
	ConstructorChainingUsingThis(boolean b) 
	{
		System.out.println("boolean method= "+b);
	}
	public static void main(String[] args) {
		
		ConstructorChainingUsingThis obj=new ConstructorChainingUsingThis(); 
		
	}
}
