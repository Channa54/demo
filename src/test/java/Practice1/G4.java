package Practice1;

public class G4 {

	public static void main(String[] args) {
		
		
		String a = "channabasava8147361490";
		String b ="";
		       char[] ch = a.toCharArray();
		       for(int i=0;i<ch.length;i++) {
		    	   if(Character.isDigit(ch[i])) {
		    		   b=b+ch[i];
		    	   }
		       }
		System.out.println(b);
		
		
		

	}

}
