package CoreJava;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		System.out.println(n);
        int rem,rev=0;
        int temp=n;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			
		}
		if(temp==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not");
		}
	}
	
	
}
