package dataStructureWithJava;

import java.util.Scanner;

public class _2_CountDigits {

	
	public static int CountDigits(long n){
		int count =0;
		while(n>0 ) {
			n=n/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to know the digits of number ");
		long n = sc.nextLong();
		System.out.println("here is the ans :"+CountDigits(n));
	}

}
