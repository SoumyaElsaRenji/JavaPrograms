package package2;

import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheck {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter first String");
		String a=s1.next();
		System.out.println("Enter second String");
		String b=s1.next();
		if(a.length()!=b.length())
		{
			System.out.println("Not Anagram");
		}
		else
		{
			char[] c1=a.toCharArray();
			char[] c2=b.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
	}
}
