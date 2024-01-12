package dataStructureWithJava;

import java.util.Scanner;

public class _3_TrailingZeros {

	
	public static int TrailingZeros(int n) {
		int res=0;
		int powerOf5=5;
		while(n>=powerOf5) {
			res=res+(n/powerOf5);
			powerOf5 *= 5;
		}
		return res;
		
	}
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to know zeros in last :");
			int TrailingZeroNum = sc.nextInt();
			System.out.println("TrailingZeros  :"+TrailingZeros(TrailingZeroNum));
		
	}

}
