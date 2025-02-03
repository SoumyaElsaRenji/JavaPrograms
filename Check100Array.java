package package2;

import java.util.Arrays;
import java.util.Scanner;

public class Check100Array {
		
	public static void main(String[] args) {
		int b=0;
			int a[]=new int[4];
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the Array values(4): ");
			for(int i=0;i<a.length;i++)
			{
				a[i]= s1.nextInt();
			}
			Arrays.toString(a);
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==100)
				{
					b=1;
				}
			}
		if(b==1)
			System.out.println("100 is part of this Array");
		else
			System.out.println("100 is not part of this Array");
	
	}
}
