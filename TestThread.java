import java.io.*;
import java.lang.Thread;
class Thread1 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
         try{
		 Thread.sleep(100);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 
		 
		 System.out.println("Therad 1");
		}
	}
}
class Thread2 extends Thread {
	public void run()
	{
		
		for(int i=0;i<10;i++)
		{	
	     System.out.println("Thread 2");
		}
	}
}
class TestThread 
{
	public static void main(String args[])
	{
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		t1.start();
		t2.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}