package package2;

interface int1
{
	void int1m1();
	
}
interface int2 extends int1
{
	void int2m1();
	
}
public class InterfaceInteface implements int2{
	public void int1m1()
	{
		System.out.println("Parent inteface method");
	}
	public void int2m1()
	{
		System.out.println("child inteface method");
	}

	public static void main(String[] args) {
		
		InterfaceInteface obj=new InterfaceInteface();
		obj.int1m1();
		obj.int2m1();
	}
}
