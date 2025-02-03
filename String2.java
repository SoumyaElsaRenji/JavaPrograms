package package2;

public class String2 {
	public static void main(String[] args) {
		String name="  Soumya Elsa Renji  ";
		String a=name.trim();
		System.out.println("String after trim:"+a);
		System.out.println("Substring from E: "+a.substring(7));
		System.out.println("Substring from E to a: "+a.substring(7,11));
		String b=a.substring(7,11);
		System.out.println("Repeat Elsa 3 times: "+b.repeat(3));
		System.out.println("Replace S with A: "+a.replace('S', 'A'));
		System.out.println("Check the string is empty "+b.isEmpty());
}
}
