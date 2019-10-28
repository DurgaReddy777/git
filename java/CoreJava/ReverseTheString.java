package CoreJava;

public class ReverseTheString {
	
	public static void main(String[] args) {
		String s="eve";
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		if(s1.equals(s)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
	}

}
