package practice;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {

       int num;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter any number:");
       num=s.nextInt();
       if (num%2==0) {
    	   System.out.println("its an even number ");
    	  
       }
       else {
    	   System.out.println("odd number ");
       }
		
		
	}

}
