package package2;

import java.util.Arrays;
import java.util.Scanner;

public class CountofAlphanumeric {

	public static void main(String[] args) {
		int alpha=0;
		int digit=0;
		int space=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a String");
		String a=s1.next();
		char[] c1=a.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			if(Character.isAlphabetic(c1[i]))
				alpha=alpha+1;
			if(Character.isDigit(c1[i]))
				digit=digit+1;
			if(Character.isWhitespace(c1[i]))
				space=space+1;
		}
		System.out.println("Number of Alphabets="+alpha);
		System.out.println("Number of Digits="+digit);
		System.out.println("Number of White spaces="+space);
		System.out.println("Number ofSpecial Characters="+(c1.length-(alpha+digit+space)));
	}
}
