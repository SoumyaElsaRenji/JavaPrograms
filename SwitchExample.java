package package2;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		System.out.println("Enter the number of the weekday: ");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
				switch(a)
				{
				case 1:
					System.out.println("Sunday");
					break;
				case 2:
					System.out.println("Monday");
					break;
				case 3:
					System.out.println("Tuesday");
					break;
				case 4:
					System.out.println("Wednesday");
					break;
				case 5:
					System.out.println("Thursday");
					break;
				case 6:
					System.out.println("Friday");
					break;
				case 7:
					System.out.println("Saturday");
					break;
				default:
					System.out.println("Enter a number between 1-7");
					break;
					
				}
	}
}
