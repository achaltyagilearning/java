import java.io.*;

class ArrayMethod{
    
	public static void main(String args[])
	{
		int a[] = {23,45,64,74,23,53,53,45};
		int sum = 0;
		arraySum(a);
	     for(int x:a)
		 {
			 sum += x;
		 }
		System.out.println("The sum of array is "+sum);
	}
    
	 public static void arraySum(int a[])
	 {
		 int sum = 0;
		 for(int x:a)
		 {
			 sum +=x;
		 }
		 System.out.println("The sum of array in method is "+sum);
	 }




}