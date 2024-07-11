package practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		
		int num,i;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number :");
		       num= s.nextInt();
		       for( i=2;i<num;i++) {
		    	   if(num%i==0) {
		    		   System.out.println("not a prime");
		    		   break;
		    	   }
		       }
		
		     if (num==i) {
		    	 System.out.println("prime ");
		     }
		
		
		
		
	}

}
