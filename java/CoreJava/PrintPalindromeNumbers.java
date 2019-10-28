package CoreJava;

public class PrintPalindromeNumbers {
	public static void main(String[] args) {
		
		
		
		for(int i=1;i<=1000;i++) {
			int n=i;
			
			int rem,rev=0;
			int temp=n;
			while(n>0) {
				rem=i%10;
				rev=(rev*10)+rem;
				i=i/10;
				
			}
			if(temp==rev) {
				System.out.println(rev);
			}
		}
		
	}

}
