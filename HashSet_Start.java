package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h = new HashSet();
		h.add(2);
		System.out.println(h);
		
		h.add(1);
		System.out.println(h);
		
		h.add(1);
		System.out.println(h); //Áßº¹X
		
		h.remove(1);
		System.out.println(h);
		System.out.println(h.size());
	}

}
