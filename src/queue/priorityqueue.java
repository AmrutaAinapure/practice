package queue;

import java.util.PriorityQueue;

public class priorityqueue {

	public static void main(String [] args) {
		
		
		PriorityQueue PQ=new PriorityQueue();
		PriorityQueue PQ1= new PriorityQueue();
		
		PQ.add('D');
		PQ.add('F');
		PQ.add('A');
		PQ.add('V');
		System.out.println(PQ);
		// PQ.offer(null);
		 System.out.println(PQ.offer('r'));
		 System.out.println(PQ);
		  
		 //3.element
		 System.out.println(PQ.element());
		//System.out.println(PQ1.element());
		
		//4.peek
		 System.out.println(PQ.peek());
		// System.out.println(PQ1.peek());
		 
		 //remove n poll
		 System.out.println(PQ.remove());
		// System.out.println(PQ1.remove());
		 System.out.println(PQ);
		 
		 
		 
		 System.out.println(PQ.poll());
		 
		 System.out.println(PQ);
System.out.println(PQ1.poll());	
}
	
	
	
	
	
	
}

