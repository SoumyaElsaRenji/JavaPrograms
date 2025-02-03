package package2;

public class String3 {

	public static void main(String[] args) {
	String s1=new String("Soumya");
	System.out.println("String after concatination is "+(s1.concat(" Elsa ").concat("Renji")));
	StringBuffer s2=new StringBuffer("Sneha");
	System.out.println("String after append is "+(s2.append(" Elsa ").append("Renji")));
	StringBuilder s3=new StringBuilder("Jerin");
	System.out.println("String after append is "+(s3.append(" Chacko ").append("Varghese")));
}
}
