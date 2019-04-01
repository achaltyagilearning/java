import java.io.*;

class VariableLength{
	
	public static void main(String args[])
	{
		double avg = average(22,33,44,34,334,212,43,22,23,23);
		System.out.println("The average calculated is = "+avg);
		
	}
	
	public static double average(int ...numbers)
	{
		int total = 0;
		for(int x:numbers)
		{
			total += x;
		}
	  
	   return (total/numbers.length);
	
	} 
	
	
}