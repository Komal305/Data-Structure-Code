package dataStructureWithJava;

import java.util.Scanner;

public class _5_LCM {
	
	public static int lcm(int a, int b){
		int x=a;
		int y=b;
		while(a!=0 && b!=0) {
			int gab=(a>b)?(a%=b):(b%=a);
		}
		
		int hcf=(a!=0)?a:b;
		int lcm=(x*y)/hcf;
		return lcm;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(lcm(a,b));
	}

}
