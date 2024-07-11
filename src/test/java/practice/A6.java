package practice;

import java.util.LinkedHashSet;

public class A6 {

	
	static void Duplicate(String s) {
		
		LinkedHashSet<Character>  set = new LinkedHashSet<>();
		
		for (int i =0;i<s.length();i++) 
			
			set.add(s.charAt(i));
			
		for(Character ch :set)
			System.out.println(ch);
	
		
	}
		
	
	public static void main(String[] args) {
         
		String str1 = "channabasava";
		Duplicate(str1);


	}

}
