package package2;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {
		
	public static void main(String[] args) {
		int a[]=new int[4];
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]= s1.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}

}
