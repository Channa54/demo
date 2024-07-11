package practice;

public class A1 {

	public static void main(String[] args) {
		
		System.out.println(Highest());
			
		
	}
  public static int Highest() {
	int [] a = { 12,34,5,25,67};
	
      int max = a[0];
	
	for (int i =1;i<a.length;i++) {
		
		if(a[i]>max) {
		max=a[i];
		}
	}
	return max;
	
  }
	
	
	
	
	
	
	
}
