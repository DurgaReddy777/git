package CoreJava;

public class ReverseTheNumber {
	public static void main(String[] args) {
		int n=1234;
		int rem,rev=0,temp=n;
		
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			
		}
		System.out.println(rev);
	}

}
