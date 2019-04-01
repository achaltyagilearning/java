import java.io.*;
class Palin{
	
	public static void main(String args[])
	{
		int n = 125;
		int n1 = n;
		int new_num = 0;
		while(n1 !=0)
		{
			new_num = new_num*10 + (n1%10);
			n1 /=10;
		}
		System.out.println("n ="+n);
		System.out.print("new_num ="+new_num);
		if(new_num == n)
		{
			System.out.println("The number is palindrome");
		}
		else{
			System.out.println("The number is not palindrome");
		}
	}
	
	
	
}