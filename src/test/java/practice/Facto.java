package practice;

import java.util.Scanner;

public class Facto {

	public static void main(String[] args) {

        int num, fact = 1;
        int i;
        Scanner s1 = new Scanner(System.in);
         System.out.println(" Enter a number :");
                num= s1.nextInt();
              for(i=1;i<=num;i++) {
            	  fact = fact*i;
              }
		
		System.out.println(fact);
		
		
	}

}
