package collectionlist;


	import java.util.ArrayList;
	import java.util.Collections;

	public class arraylist2 {
		
		public static void main(String[] args) {
			
			ArrayList AL =new ArrayList();
			
			AL.add("A");  //homogenous data in Sort
			AL.add("D");
			AL.add("C");
			AL.add("Z");
			AL.add("S");
			System.out.println(AL);
			
			//1.Addall
			ArrayList duplicate =new ArrayList();
			duplicate.addAll(AL);
			System.out.println(duplicate);
			
			//2.removeall
			
			duplicate.removeAll(AL);
			System.out.println(duplicate);
			
			//3.collections
			System.out.println(AL);
			Collections.sort(AL);
			System.out.println(AL);
			
			//
		//Collections.sort(AL,Collections.reverseOrder());
			Collections.sort(AL, Collections.reverseOrder());
			
			System.out.println(AL);
			
			//
			Collections.shuffle(AL);
			System.out.println(AL);
			
			
		}	
			

	}


