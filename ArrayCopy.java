package package2;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
			int a[]=new int[4];
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the Array to copy");
			for(int i=0;i<a.length;i++)
			{
				a[i]= s1.nextInt();
			}
			int c[]=new int[a.length];
			for(int j=0,k=0;j<a.length;j++,k++)
			{
				c[k]= a[j];
			}
			System.out.println("Copied Array: "+Arrays.toString(c));

}
}
