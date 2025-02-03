package package2;

public class String4 {
	public static void main(String[] args) {
		String a="Soumya Elsa Renji";
		String b="soumya elsa renji";
				if(a.equals(b))
				{
					System.out.println("Strings are equal without ignoring case");
				}
				if(a.equalsIgnoreCase(b))
				{
					System.out.println("Strings are equal after ignoring case");
				}
				if(a.matches("S(.*)"))
				{
					System.out.println("String starting with S");
				}
				if(a.matches("(.*)i"))
				{
					System.out.println("String ending with i");
				}
				if(a.matches("(.*)Elsa(.*)"))
				{
					System.out.println("String contains Elsa");
				}
	}

}
