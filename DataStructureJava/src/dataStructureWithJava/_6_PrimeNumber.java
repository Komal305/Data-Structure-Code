package dataStructureWithJava;

import java.util.Scanner;

public class _6_PrimeNumber {

	
	static boolean  isPrime1(long n) {// o(n)
		for(int i=2; i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	static boolean  isPrime2(long n) {// o(root of n)
		for(int i=2; i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	static boolean  isPrime3(long n) {// o(root of n)
		if(n==1)
			return false;
		
		if(n==3 || n==2)
		     return true;
		
		if(n%2==0|| n%3==0)
			return false;
		for(int i=5;i*i<=n;i=i+6) {
			if(n%i==0||n%(i+2)==0)
				return false;
		}
		return true;
		
	}
	
	static  void  isPrime4(long n) {//O(n*root of n)
		for(int i=2; i<=n;i++) {
			if(isPrime3(i))//root of n
				System.out.println(i);
		}	
	}

	
	public static  void sievePrime5(long n){
		boolean[] sieve= new boolean[(int) (n+1)];
		for(int i=2; i<=n; i++) {
			if(sieve[i]==false) {
				for(int j=i*2; j<=n; j=j+i) {
					sieve[j]=true;
				}
			}
		}
		for(int i=2; i<=n;i++) {
			if(sieve[i]==false)
				System.out.println(i);
		}
	}
	
	public static  void sievePrime6(long n){
		boolean[] sieve= new boolean[(int) (n+1)];
		for(int i=2; i<=n; i++) {
			if(sieve[i]==false) {
				for(int j=i*i; j<=n; j=j+i) {
					sieve[j]=true;
				}
			}
		}
		for(int i=2; i<=n;i++) {
			if(sieve[i]==false)
				System.out.println(i);
		}
	}
	
	public static  void sievePrime7(long n){
		boolean[] sieve= new boolean[(int) (n+1)];
		for(int i=2; i*i<=n; i++) {
			if(sieve[i]==false) {
				for(int j=i*i; j<=n; j=j+i) {
					sieve[j]=true;
				}
			}
		}
		for(int i=2; i<=n;i++) {
			if(sieve[i]==false)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("enter any number ");
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
	System.out.println(isPrime1(n));
	System.out.println(isPrime2(n));
	System.out.println(isPrime3(n));
	isPrime4(n);
	System.out.println("___________________________");
    sievePrime5(n);
    
    System.out.println("___________________________");
    sievePrime7(n);
	
	}

}
