import java.util.Scanner;
class calculator
{
  public static void main(String args[])
  {
	Scanner scan = new Scanner(System.in);  
	  double fnum,snum,result;
	  System.out.print("Enter the first number \t");
	  fnum = scan.nextDouble();
	  System.out.print("Enter the seconed number \t");
	  snum = scan.nextDouble();
	  result = fnum + snum;
	  System.out.println("The sum of both the values is \t" + result);
	  
	  
	  
	  
  }
}