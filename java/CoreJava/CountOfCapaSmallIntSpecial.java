package CoreJava;

public class CountOfCapaSmallIntSpecial {
	
	public static void main(String[] args) {
		String s="WelCome@123";
		int cc=0,sc=0,inc=0,spc=0;
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) {
				cc++;
			}
			else if(Character.isLowerCase(c)) {
				sc++;
			
			}
			else if(Character.isDigit(c)) {
				inc++;
			}
			else {
			   spc++;
			}
		}
		System.out.println(cc);
		System.out.println(sc);
		System.out.println(inc);
		System.out.println(spc);
		
	}

}
