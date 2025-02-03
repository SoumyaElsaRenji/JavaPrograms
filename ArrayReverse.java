package package2;
import java.util.Arrays;

public class ArrayReverse {
		
	public static void main(String[] args) {
		int a[]=new int[4];
		a[0]=68;
		a[1]=46;
		a[2]=64;
		a[3]=90;
		int c[]=new int[a.length];
		for(int i=(a.length-1),j=0;i>=0;i--,j++)
		{
			c[j]= a[i];
		}
		System.out.println("Reversed Array: "+Arrays.toString(c));
	}
}
