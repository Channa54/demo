package practice;

public class A3 {

	public static void main(String[] args) {
		
		
		String a = "CHAnna";
		
		StringBuilder b = new StringBuilder(a);
		
		for (int i =0;i<a.length();i++) {
			
		if(Character.isLowerCase(a.charAt(i))) {
			b.setCharAt(i, Character.toUpperCase(a.charAt(i)));
		}
		else if 
			(Character.isUpperCase(a.charAt(i))) {
			b.setCharAt(i, Character.toLowerCase(a.charAt(i)));
		}
		}
		
		System.out.println("case converted "+ b);
		
		

	}

}
