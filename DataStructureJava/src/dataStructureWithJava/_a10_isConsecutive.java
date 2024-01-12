package dataStructureWithJava;

public class _a10_isConsecutive {
	
	public static boolean isConsecutive(int n){
		return ((n&n<<1)!=0)?true:false;
	}
	
	
	
	
	public static void main(String[] args) {
		int n=101;
		System.out.println(isConsecutive(n));
		
	}

}
