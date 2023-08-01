package Hashmap;

import java.util.Hashtable;

public class Hashtable1 {

	
	public static void main(String[] args) {
		Hashtable<Integer,String>HT=new Hashtable<>();
		HT.put(2, "JOhn");
		
		HT.put(3, "JOhn");
		HT.put(4, "vihan");
		HT.put(5, "Rohit");
		HT.put(77, "Sumit");
		
		System.out.println(HT);
		
		System.out.println(HT.remove(4));
		System.out.println(HT);
		System.out.println(HT.containsKey(5));
		
		System.out.println(HT.containsKey(33));
		
		System.out.println(HT.containsValue("sumit"));
		
		System.out.println(HT.keySet());
		System.out.println(HT.values());
		
		for(Object obj:HT.keySet()) {
			System.out.print(obj+""+HT.get(obj));
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
