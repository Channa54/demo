package ppack;

public class C6 {

	public static void main(String[] args) {
		System.out.println(highest());
	}
    public static int highest() {
	int [] a = { 12,34,23,67,90999,235,8888};
	
	 int max = a[0];
	
	for (int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	return max;
	
	
	
}
}
