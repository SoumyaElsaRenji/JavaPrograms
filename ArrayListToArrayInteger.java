package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class ArrayListToArrayInteger {
	public static void main(String[] args)
	{
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(87);
		l1.add(67);
		l1.add(76);
		System.out.println("First Collection"+l1);
		List<Integer> l2=new ArrayList<Integer>();
		l2.addAll(l1);
		l2.addFirst(100);
		l2.add(87);
		l2.add(null);
		l2.add(null);
		l2.addLast(200);
		System.out.println("Second Collection"+l2);
		System.out.println("Collection contains 100 "+l2.contains(100));
		System.out.println("Collection is empty? "+l1.isEmpty());
		l2.clear();
		System.out.println("First Collection after clearing"+l2);
		
	}
}
