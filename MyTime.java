public class MyTime{
	
	private int hour;
	private int minute;
	private int seconds;
	
	public void setTime(int h,int m,int s)
	{
		this.hour = h;
		this.minute = m;
		this.seconds = s;
	
	}
	
	public String toMilitary(){
		
		return String.format("%02d:%02d:%02d",hour,minute,seconds);
	}
	public String toString()
	{
		  return String.format("%d:%02d:%02d %s", ((hour==0||hour==12)?12:hour%12), minute, seconds, (hour < 12?"AM": "PM"));
	}
}