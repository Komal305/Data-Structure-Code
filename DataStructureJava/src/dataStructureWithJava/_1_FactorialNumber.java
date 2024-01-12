package dataStructureWithJava;


import java.util.Scanner;

public class _1_FactorialNumber {
	
	public static int Factorial( int n ){
		
		int fect=1;
		for (int i = 1; i <= n; i++) {
			fect*=i;
		}
		
		return fect;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to know factorial ");
		int n = sc.nextInt();
		System.out.println("here is the ans :"+Factorial(n));
	}

}
