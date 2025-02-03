package package2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStringEquals {

	public static void main(String[] args) {
		String a[]=new String[4];
		String b[]=new String[4];
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first String Array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]= s1.next();
		}
		Arrays.toString(a);
		System.out.println("Enter the second String Array: ");
		for(int i=0;i<b.length;i++)
		{
			b[i]= s1.next();
		}
		Arrays.toString(b);
		if(Arrays.equals(a,b))
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}
}
