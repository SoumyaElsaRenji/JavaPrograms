package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArraylistString {

		public static void main(String[] args)
		{
			ArrayList<String> l1=new ArrayList<String>();
			l1.add("Soumya");
			l1.add("Elsa");
			l1.add("Renji");
			System.out.println("First Collection"+l1);
			ArrayList<String> l2=new ArrayList<String>();
			l2.addAll(l1);
			l2.addFirst("Johan");
			l2.add("Jerin");
			l2.add(null);
			l2.add(null);
			l2.addLast("Varghese");
			System.out.println("Second Collection"+l2);
			System.out.println("Collection contains 100 "+l2.contains("Johan"));
			System.out.println("Collection is empty? "+l1.isEmpty());
			l2.clear();
			System.out.println("First Collection after clearing"+l2);
			
		}
	}
