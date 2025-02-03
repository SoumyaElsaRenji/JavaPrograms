package package2;

import java.util.Scanner;

public class AssertExample {
	public static void main(String[] args) {
		System.out.println("Enter the age: ");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		assert (a>=18):"Not eligible";
		{
		System.out.println("Eligible to vote");
		}
	}

}
