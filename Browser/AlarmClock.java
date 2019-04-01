import java.util.concurrent.TimeUnit;
class AlarmClock implements TimerInt{
	private Timer t1 ;
	
	public AlarmClock(){
		t1 = new Timer(this);		
	}
	public AlarmClock(int c){
		t1 = new Timer(this,c);
	}
	public void start(){
		t1.start();		
	}
	public void setTime(int c)
	{
	   t1.setTime(c);	
	}
	public void doAction()
	{
	  int i =0;
	  while(i<10){
	  	try
{
    TimeUnit.SECONDS.sleep(1);
	System.out.println("\007");
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
};
	    
		
		
		i++;
	  }
	}
		
}