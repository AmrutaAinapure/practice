package collectionlist;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
	
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();  //hetro
		
		LinkedList<String> LL1 = new  LinkedList<String>();
		
		//Add/insertion
		LL.add("Amruta");
		LL.add("welcome");
		LL.add('D');
		LL.add(null);
		LL.add(true);
		LL.add(null);
		
		System.out.println(LL);
		System.out.println();
		System.out.println(LL.size());
		
		System.out.println(LL.remove(null));
		System.out.println(LL);
		
		LL.add(400);
		LL.add(3 , "java");
		System.out.println(LL);
		
		//Get = return theelement at specified position
		
		System.out.println(LL.get(3));
		
		//Firstelement
		
		System.out.println(LL.getFirst());
		
		
		// Lastelement
		System.out.println(LL.getLast());
		
		
		
		// isempty
		
		System.out.println(LL.isEmpty());
		System.out.println(LL1.isEmpty());
		
		//contains
		// return true if this list contains the specified element .more formally
		
		System.out.println(LL.contains("java"));
		
		System.out.println(LL.contains("java1"));
		
		System.out.println();
		System.out.println("Reading element using forloop");
		for( int i=0; i< LL.size();i++){
	
		System.out.println(LL.get(i));
		}
		System.out.println();
		System.out.println("Reading element using for eachloop");
		for (Object obj :LL) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("Reading element using Iterator");
		Iterator it =LL.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
		
		
		
		
		
		
		
		
	}

}
	
	
	
	
	
	
	

