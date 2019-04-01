import java.io.*;

class EnhancedFor{
	public static void main(String args[])
	{
		int a[] = new int[10];
		for(int i=0;i<10;i++)
			a[i]=i;
	    
		int sum = 0,sum1=0;
		for(int i = 0;i<10;i++)
			sum1 +=a[i];
		
		
		for(int x:a)
			sum+=x;
	
	    System.out.println("The total original sum is "+sum1);
		System.out.println("The total sum using Enhanced For loop is "+sum);
	    
	
	
	
	}
}