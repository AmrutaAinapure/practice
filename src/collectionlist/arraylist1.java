package collectionlist;

	import java.util.ArrayList;
	import java.util.Iterator;

	public class arraylist1 {
		
		public static void main(String[] args) {
			
			int arr []=new int[5];
			
			ArrayList AL = new ArrayList();  //dynamic Array = homo+ hetro type data
			
			ArrayList<String> AL1 = new ArrayList<String>();  //static Arraylist// homogenous data
			
			//1. Add--to add the element in arraylist
			
			AL.add("welcome"); //string
			AL.add(200);  //int
			AL.add(true); //boolean
			AL.add('A'); //char
			AL.add(300);
			AL.add(null);//null
			AL.add(30.4);//double
			
			System.out.println(AL);
			
			//2. size = returns the number of element in this list.
			System.out.println("number of element in given Array list--->" +AL.size());
			
			AL.add(300);
			AL.add(4000);
			AL.add("Test");
			
			System.out.println(AL.size());
			
			//3.remove  syn== Rv.remove
			AL.remove(30.4);
			AL.remove(true);
			
			//contains
			System.out.println("****");
			
			System.out.println(AL.contains(300));
			System.out.println(AL.contains(3000));
			
			System.out.println(AL);
			
			//4.insert new element
			
			AL.add(20);
			System.out.println(AL);
			
			AL.add(2 ,20);
			System.out.println(AL);
			
			AL.add(3 ,"Python");
			System.out.println(AL);
			
			
			//5.retrieve specific element
			//get -returns the element at the specified position in this list
			System.out.println(AL.get(3));
		//	System.out.println(AL.get(33));// index out
			System.out.println(AL.get(0));
			
			//6. replace/change method//set
			AL.set(3, "java");
			System.out.println(AL);
			
			
			AL.set(4, 1000);
			System.out.println(AL);
			
			//7.isempty
			System.out.println(AL.isEmpty());  //false
			System.out.println(AL1.isEmpty());  //true
			System.out.println();

			//8.read print the data from arraylist //for
			System.out.println("Reading element using for loop");
			for(int i=0;i<AL.size();i++) {
				System.out.println(AL.get(i));  //0 -welcome,200
				
				//for each loop
				System.out.println();
				System.out.println("Reading element using for each loop");//obj parent class
				for (Object obj : AL) { //welcome,200,20,true,A,300,null,300,4000,test,20
					System.out.println(obj);
					//System.out.println();
				}
				
				//iterator method
				
				Iterator AL2 =AL.iterator();
				while(AL2.hasNext()) {     //method
					System.out.println(AL2.next()); //20
					
				}
				
				
				
			}
			
			
			
			
		}

	}


