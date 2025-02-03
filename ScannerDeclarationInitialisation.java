package package2;

import java.util.Scanner;

public class ScannerDeclarationInitialisation {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int a=s1.nextInt();
		System.out.println("Enter an integer(byte): ");
		byte b=s1.nextByte();
		System.out.println("Enter an integer(short): ");
		short c=s1.nextShort();
		System.out.println("Enter an integer(Long): ");
		long d=s1.nextLong();
		System.out.println("Enter a decimal value: ");
		float e=s1.nextFloat();
		System.out.println("Enter a decimal value(double): ");
		double f=s1.nextDouble();
		System.out.println("Enter a string: ");
		String g=s1.next();
		System.out.println("Enter a boolean  value ");
		boolean h=s1.nextBoolean();
		s1.close();
		
	}
}
