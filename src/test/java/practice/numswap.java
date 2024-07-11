package practice;

public class numswap {

	public static void main(String[] args) {
		
		swap();
			
		
	}

	static void swap() {
		
		int a=12;
		int b=11;
		System.out.println("value of a before swap  :"+a);
		System.out.println("value of b before swap :"+b);
		a = a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a after swap:"+a);
		System.out.println("value of b after swap:"+b);
		
		
		
		
		
		
		
	}
	
	
	
}
