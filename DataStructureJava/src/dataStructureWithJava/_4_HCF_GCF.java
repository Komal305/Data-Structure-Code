package dataStructureWithJava;

public class _4_HCF_GCF {

	
	public static void main(String[] args)
	{
		int a=25,b=15;
		System.out.println("Normal gcf "+gcf(a,b));
		System.out.println("Euclid Alexandria method "+euclidGcf(a,b));
		System.out.println("Gabreal method "+gabrielHCF(a,b));
	}
	//first approach
	public  static int gcf(int a, int b){
		int	min =(a<b)? a:b;
		for(int i=min;i>=0;i--) {
			if(a%i==0 &&b %i==0) {
			return	i;
			}
		}
		return 1;
	}
	
	
	   //Euclid Alexandria method
  public static int euclidGcf(int a , int b)
{
	int result=0;
	while(a!=b) 
	{
		result=(a>b)?(a=a-b):(b=b-a);
	}
	return result;
}	
    
  
  //Gabriel lame method
 public static int gabrielHCF(int a, int b){
	int gabriel=0;
	while(a!=0&&b!=0) {
		gabriel=(a>b)?(a = a%b):(b= b%a);
	}
	int lame=(a!=0)?a:b;
	return lame;
}

}
