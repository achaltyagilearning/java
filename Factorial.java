import java.io.*;
class Factorial{
	

	public static void main(String args[])
	{
	  
		int n = 6;
		int mul = 1;
		for(int i = 1;i<=n;i++)
		{    
	           mul *= i;
		}
		
		
		System.out.println("The factorial calculated using for loop of the value "+n+" is ->"+mul);
	     		System.out.println("The factorial calculated using recursioin of the value "+n+" is ->"+fact(n));

	
	
	}
	
	
	public static  int fact(int n)
	{
       if(n == 1 || n == 0)
          return 1;		   
	   else
	   {
		  
		   return  (n*fact(n-1));
	   }
	}

}