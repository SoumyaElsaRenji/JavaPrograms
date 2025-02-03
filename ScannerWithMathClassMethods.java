package package2;

import java.util.Scanner;

public class ScannerWithMathClassMethods {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=s1.nextInt();
		int b=s1.nextInt();
		System.out.println("Sum="+(Math.addExact(a, b)));
		System.out.println("Difference="+(Math.subtractExact(a, b)));
		System.out.println("Multiplication= "+(Math.multiplyExact(a, b)));
		System.out.println("division= "+(Math.divideExact(a, b)));
		System.out.println("higher number= "+(Math.max(a, b)));
		
	}
}
