package ppack;

public class C8 {

	public static void main(String[] args) {
		fib(10);
	}
	
	static void fib(int N) {
		
		int n1 =0, n2 =1;
		for(int i =0;i<N;i++) {
			int n3 = n1+n2;
			  n1=n2;
			  n2=n3;
			  System.out.println(n1);
			
		}
		

		
		
	}

}
