package package2;

interface interfacec
{
	void interfacem1();
}
public class ClassInterface implements interfacec{

	public void interfacem1()
	{
		System.out.println("Interface method");
	}
	public static void main(String[] args) {
		 ClassInterface obj= new  ClassInterface();
		 obj.interfacem1();
	}

}