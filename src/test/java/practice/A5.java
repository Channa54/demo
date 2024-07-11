package practice;

public class A5 {

	public static void main(String[] args) {
		
		
		int num = 319;
		
		boolean a = false ;
		
		for (  int i =2;i<=num/2;i++) {
			if(num%i==0) {
				a=true;
				 break;
			}
		  	
		}
		
		if(!a) {
			System.out.println("Given number is "+num +"prime number");
		}
		else {
			System.out.println("Given number is "+num +" not a prime number");
		}
		
		

	}

}
