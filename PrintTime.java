import java.io.*;

class PrintTime{
	public static void main(String args[])
	{
		MyTime mytime = new MyTime(4,34,23);
		System.out.println("The time is -> \n"+mytime.toMilitary());
		
		mytime.setTime(13,34,43);
		System.out.println("The time after calling setTime is -> \n"+mytime.toMilitary());
		System.out.println("The regular time is = \n"+mytime.toString());
	}
}