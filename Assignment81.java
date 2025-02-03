package package2;

import java.util.Scanner;
public class Assignment81 {

	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		Scanner s1=new Scanner(System.in);
		String name=s1.nextLine();
		String name2=name.replaceAll(" ","");
		System.out.println(name2);

	}

}
