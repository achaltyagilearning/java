import java.io.*;
import java.util.concurrent.TimeUnit;
class Timer{
	
	private TimerInt t_ii;
	private  int count;
	public Timer(TimerInt t){
		t_ii = t;
		count =0;		
	}
	
	public Timer(TimerInt t,int c)
	{
		t_ii = t;
		count = c;
	}
	public void setTime(int c)
	{
          count = c;		
	}
	public void start()
	{
		while(count>0){
		count--;
		
		try
   {
    TimeUnit.SECONDS.sleep(1);
	System.out.println(count);
     }
   catch(InterruptedException ex)
    {
    
        }
		
		}
		t_ii.doAction();
	}
	
	
}