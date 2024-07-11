package practice;

public class A4 {

	public static void main(String[] args) {
		
		System.out.println(fac(4));
		
		
	}

	
	public static int fac( int Number ) {
		int i =1;
		int factorial = 1;
		
		for ( i =1;i<=Number;i++) {
			factorial= factorial*i;
		}
		return factorial;
		
	}
	
	
}
