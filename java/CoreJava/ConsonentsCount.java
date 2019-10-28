package CoreJava;

public class ConsonentsCount {
	public static void main(String[] args) {
		String s="aeioujkhgaeiou";
		String vowels="";
		String con="";
		int ccount=0;
		int vcount=0;
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u') {
				ccount++;
				con=con+c;
			}
			else {
				vcount++;
				vowels=vowels+c;
			}
		}
		System.out.println(ccount);
		System.out.println(con);
		System.out.println(vcount);
		System.out.println(vowels);
		
	}

}
