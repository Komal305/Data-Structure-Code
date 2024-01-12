package dataStructureWithJava;

import java.util.Scanner;

public class _8_DesimalToBinary {

	
	public static String DesimalToBinary(int n){
		String s="";
		while(n>=1) {
			int x=n%2;
			n=n/2;
			s=x+s;
		}
		return s;
	}
	
	
	public static int BinaryToDesimal(String b){
	int	result=0,power2=1;
	
	for(int i=b.length()-1;i>=0;i--) {
		if(b.charAt(i)=='1')
			result=result+power2;
			
			power2=power2*2;
	}
		
		return result;
	
		
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int n=sc.nextInt();
		String b1=DesimalToBinary(n);
		System.out.println(b1);
		System.out.println(BinaryToDesimal(b1));
	}

}
