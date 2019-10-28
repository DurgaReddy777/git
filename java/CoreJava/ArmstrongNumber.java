package CoreJava;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		System.out.println(n);
        int rem,rev=0;
        int temp=n;
		while(n>0) {
			rem=n%10;
			rev=rev+(rem*rem*rem);
			n=n/10;
			
		}
		if(temp==rev) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("Not");
		}
	}

}
