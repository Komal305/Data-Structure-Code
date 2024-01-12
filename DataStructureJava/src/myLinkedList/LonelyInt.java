package myLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LonelyInt {

	
	public static int lonelyinteger(List<Integer> a) {
	    // Write your code here
	    Collections.sort(a);
	    
	    for(int i=0; i<a.size()-2; i=i+2){
	      if(a.get(i)!=a.get(i+1))
	      return a.get(i);
	    }
	    return a.get(a.size()-1);

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a1= new ArrayList<Integer>();
		a1.add(1);
		a1.add(1);
		a1.add(3);
		
System.out.println(LonelyInt.lonelyinteger(a1));
		
	}

}
