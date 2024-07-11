package practice;

import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		
	int num,rev=0;
	int r;
	int a;
	
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any number :");
	       num=  s.nextInt();
	     // a= num;
	      while(num>0) {
	    	  r=num%10;
	    	  rev=rev*10+r;
	    	  num=num/10;
	      }
	
		System.out.println("reverse of number "+rev);
		
		
		

	}

}
