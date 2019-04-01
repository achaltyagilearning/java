import java.io.*;
import java.lang.Math;


class CompundIntrest{
	
	public static void main(String args[])
	{
	  	double amount  = 0;
		double principal  = 10000;
		double rate = 0.01;
		
		for(int i = 0;i<20;i++)
		{
		  amount  = principal*Math.pow(1+rate,i);
		  System.out.println("The amount on day "+i+" is "+amount);			
		}
	}
}