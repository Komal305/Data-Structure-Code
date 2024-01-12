package MySets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LonelyInt {
	
	public static int LinelyIntSet(int[] arr) {
		Set<Integer> s=new HashSet<>();
		
		for(int i:arr) {
			boolean b=(s.contains(i)) ?s.remove(i):s.add(i);
		}
		
		for(int j:s)
			return j;
		
		return -1;
	}
	

	public static int LinelyIntSet1(List<Integer> arr) {
		int result =0;
		for(int i: arr) 
			return result^i;
		
		return -1;
		
	}
	public static void main(String[] args) {
		int[] a= {1,2,1,3,2,5,3};
		System.out.println(LonelyInt.LinelyIntSet(a));
	}

}
