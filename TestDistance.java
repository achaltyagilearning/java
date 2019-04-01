import java.io.*;
class Distance{
	    private int meter;
		private  int cm;
		private static int counter;
		public Distance()
		{
			counter++;
		}
		public static void display()
		{
			System.out.println("Counter value is"+counter);
		}
}


class TestDistance{
	  
	public static void main(String args[])
	{
		Distance d1 = new Distance();
		Distance d2 = new Distance();
		Distance.display();
	}
	
	
}