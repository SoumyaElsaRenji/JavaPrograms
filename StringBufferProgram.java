package package2;
public class StringBufferProgram {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Soumya");
		System.out.println("String: "+s1);
		s1.append(" Elsa ");
		System.out.println("After append: "+s1);
		s1.insert(12, "Renji");
		System.out.println("After Insertion: "+s1);
		s1.delete(7, 11);
		System.out.println("After Delete: "+s1);
		s1.reverse();
		System.out.println("After Reverse: "+s1);
		s1.substring(0, 5);
		System.out.println("Substing 1: "+s1);
		s1.substring(2);
		System.out.println("Substing 2: "+s1);
		System.out.println(s1.charAt(1));
		System.out.println(s1.length());
		
	}
}
