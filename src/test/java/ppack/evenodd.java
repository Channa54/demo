package ppack;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		
		/*
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a num: 13");
		
		int num = reader.nextInt();
		
		if (num%2==1) {
			System.out.println(num + "number is odd ");
		}
		else {
			System.out.println(num+ "number is even");
		}
		
		*/
		
		   Scanner reader = new Scanner(System.in);

	        System.out.print("Enter a number:  ");
	        int num = reader.nextInt();

	        if(num % 2 == 0)
	            System.out.println(num + " is even");
	        else
	            System.out.println(num + " is odd");
		
		
		
	}

}
