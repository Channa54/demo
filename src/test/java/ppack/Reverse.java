package ppack;

public class Reverse {

	public static void main(String[] args) {
/*
     String a = "channu";
     String str=" ";
     char ch ;
     
     for (int i =0;i<a.length();i++) {
    ch =  a.charAt(i);
    
    
       str= ch+str;
    
     }
		
     System.out.println("reverse "+str);*/

		
		
		
		String a = "bhagya";
		
		StringBuilder br = new StringBuilder();
		
		br.append(a);
		br.reverse();
		System.out.println(br);
		
		String input = "GeeksForGeeks";
		 
        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();
 
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);	
		
		
		
		
		
		
		
		
	}

}
