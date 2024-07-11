package Practice1;

import java.util.LinkedHashSet;

public class Strn {

	public static void main(String[] args) {
	
	String s = "channabasava";
	
     LinkedHashSet<Character> set = new LinkedHashSet<>();
             for (int i =0;i<s.length();i++) {
            	 set.add(s.charAt(i));
            	 
             }
			for(Character ch : set) {
				System.out.println(ch);
			
			}
	
		 String ch ="chanbsv";
		 String b ="";
		 char c ;
		 for (int k =0;k<ch.length();k++) {
			 
			       c=ch.charAt(k);
			       b = c+b;
		 }
		System.out.println(b);
		
 	   
}
	
	
}
