package package2;
import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String st=s1.next();
		String a="";
		for(int i=st.length()-1;i>=0;i--)
		{
			char c=st.charAt(i);
			a=a+c;
		}
		System.out.println("Reversed string: "+a);
		if(a.equals(st))
		{
			System.out.println("The string is a palindrome");
		}
		else 
			System.out.println("The string is not a palindrome");
	}
}