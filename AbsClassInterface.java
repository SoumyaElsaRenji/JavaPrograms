package package2;

interface Interface2
{
	void interfacem1();
}
abstract class absclass implements Interface2
{
	public void interfacem1()
	{
		System.out.println("Interface method under abstract class");
	}
}
public class AbsClassInterface extends absclass{

	public static void main(String[] args) {
	
		AbsClassInterface obj= new AbsClassInterface();
		obj.interfacem1();
	}

}
