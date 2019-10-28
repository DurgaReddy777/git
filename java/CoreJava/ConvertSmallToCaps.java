package CoreJava;

public class ConvertSmallToCaps {
	public static void main(String[] args) {
		String s="welcome";
		for(int i=0;i<s.length();i++) {
			char c1=s.charAt(i);
			if(Character.isLowerCase(c1)) {
				char c2=Character.toUpperCase(c1);
				System.out.print(c2);
				
				
			}
		}
		
	}
	

}
