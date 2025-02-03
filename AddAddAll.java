package collection;

import java.util.ArrayList;
import java.util.Collection;

public class AddAddAll {
	public static void main(String[] args)
	{
		Collection<Integer> c2=new ArrayList<Integer>();
		c2.add(87);
		c2.add(876);
		c2.add(2345);
		Collection<Integer> c1=new ArrayList<Integer>();
		c1.add(86);
		c1.add(7776);
		c1.add(775);
		c1.add(56);
		c1.add(56);
		c1.add(null);
		c1.add(null);
		c1.addAll(c2);
		System.out.println("Collection after addall: "+c1);
		c1.remove(86);
		System.out.println("Collection after remove 86: "+c1);
		c1.removeAll(c2);
		System.out.println("Collection after remove all: "+c1);
		System.out.println("Collection is empty? "+c1.isEmpty());
		System.out.println("Check c2 contains 87: "+c2.contains(87));
		System.out.println("Check c1 contains all elements of c2: "+c1.containsAll(c2));
		
		
	}	
}
