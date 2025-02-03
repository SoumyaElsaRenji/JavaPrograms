package package2;

interface interface1
{
	void interface1method();
}
interface interface22
{
	void interface2method();
}
public class MultipleInheritance implements interface1,interface22
{
	public void interface1method()
	{
		System.out.println("Interface 1 method");
	}
	public void interface2method()
	{
		System.out.println("Interface 2 method");
	}
	public static void main(String[] args) {
		MultipleInheritance obj= new MultipleInheritance();
		obj.interface1method();
		obj.interface2method();
	}
}
