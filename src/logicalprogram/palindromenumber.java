package logicalprogram;

import java.util.Scanner;

public class palindromenumber {

	
	
	public static void main(String [] args) {
		
		
		int originalnumber,sum,rem;
		System.out.println("Enter a number");
		Scanner sc =new Scanner(System.in);
		
		int num=sc.nextInt();
		
		originalnumber =num;
		for(sum=0;num>0;num=num/10) {
			
			
			rem=num%10;
			sum=sum*10+rem;
			
		}
		
		if(sum==originalnumber) {
			
			System.out.println(originalnumber+"---->is palindrome");
		}
		
		else {
			System.out.println(originalnumber+"----->is not palindrome");
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
