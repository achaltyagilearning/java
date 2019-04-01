import java.io.*;
import java.util.Random;

class ArrayCounters{
	
	public static void main(String args[])
	{
     int a[] = new int[7];
	 
		Random rand = new Random();
		
		for(int roll=0;roll<1000;roll++)
		{
		   ++a[1+rand.nextInt(6)];
		}
      		
		for(int face=0;face<a.length;face++)
		{
			System.out.println(""+face+" "+a[face]);
		}			
		
		
		
		
	}

}