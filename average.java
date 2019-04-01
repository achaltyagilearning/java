import java.io.*;
import java.util.Scanner;


class Average{
	
	
	public static void main(String args[])
	{
	  Scanner input = new Scanner(System.in);
	  
	  int counter = 0;
      int total = 0;
      int avg;
       int grade;	  
		
		while(counter<10)
		{
			grade = input.nextInt();
			total += grade;
			counter++;
			
		}
		avg = total/10;
		System.out.println("The average is "+avg);
		
		
	}
}