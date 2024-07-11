package practice;

import java.util.Scanner;

public class Swapnum {

	public static void main(String[] args) {
		
		int num1,num2;
		
		Scanner a = new Scanner(System.in);
		System.out.println("Value of  num1 :");
		        num1= a.nextInt();
		        System.out.println("Value of  num2:");
		      num2 =  a.nextInt();
		      num1= num1+num2;
		      num2=num1-num2;
		      num1=num1-num2;
		      System.out.println("value of num1 is :"+num1);
		      System.out.println("value of num2 is :"+num2);
		        
		
		
		
		
		

	}

}
