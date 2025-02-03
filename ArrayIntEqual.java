package package2;

import java.util.Arrays;

import java.util.Scanner;

public class ArrayIntEqual {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
			int a[]=new int[4];
			int b[]=new int[4];
			System.out.println("Enter the first Integer Array");
			for(int i=0;i<a.length;i++)
			{
				a[i]= s1.nextInt();
			}
			//System.out.println(Arrays.toString(a));
			System.out.println("Enter the second Integer Array");
			for(int j=0;j<a.length;j++)
			{
				b[j]= s1.nextInt();
			}
			//System.out.println(Arrays.toString(b));
			if(Arrays.equals(a, b))
			{
				System.out.println("The Integer Arrays are equal");
			}
			else
			{
				System.out.println("The Integer Arrays are not equal");
			}
		}

}
