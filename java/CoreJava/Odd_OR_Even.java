package CoreJava;

import java.util.Scanner;

public class Odd_OR_Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Even Number");
		}
		else if(n%2==1) {
			System.out.println("Odd Number");
		}
	}

}
