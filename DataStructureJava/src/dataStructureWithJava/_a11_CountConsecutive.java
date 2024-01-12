package dataStructureWithJava;

public class _a11_CountConsecutive {
	public static int countConsecutive(int n){
		
		int count=0;
		while(n>0) {
		  n=(n & n<<1);
			count++;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		int n=101;
		System.out.println(countConsecutive(n));

	}

}
