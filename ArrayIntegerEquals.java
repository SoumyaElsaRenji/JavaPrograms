package package2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntegerEquals {

	public static void main(String[] args) {
		int a[]=new int[4];
		int b[]=new int[4];
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first Integer Array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]= s1.nextInt();
		}
		Arrays.toString(a);
		System.out.println("Enter the second Integer Array: ");
		for(int i=0;i<b.length;i++)
		{
			b[i]= s1.nextInt();
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
