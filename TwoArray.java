import java.io.*;

class TwoArray{
	
	public static void main(String args[]){
		
		int a[][] = {{5,34,2,53,34},{34,43},{334,22,32,34,23}};
		int b[][] = {{34,34,543,33},{33},{34,544,33}};
		
		System.out.println("The First array");
		display(a);
		System.out.println("The seconed array");
		display(b);
		
		
	}
	
	public static void display(int a[][])
	{
		for(int row=0;row<a.length;row++)
	 	{
			for(int column = 0;column<a[row].length;column++)
				System.out.print(a[row][column]+"\t");
			
			System.out.println("");
		}
		
	}
	
}