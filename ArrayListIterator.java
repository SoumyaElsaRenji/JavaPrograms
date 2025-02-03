package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
				ArrayList<Integer> l1=new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(4);
				l1.add(5);
				l1.add(6);
				ListIterator<Integer> it=l1.listIterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				while(it.hasPrevious())
				{
					System.out.println(it.previous());
				}

	}

}
