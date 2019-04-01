import java.io.*;
class Stack
{
    final private int size;
	private int top=-1;
	private int a[];
	public Stack(int s)
	{
		size = s;
		a = new int[size];
	}
     public boolean isEmpty()
	 {
		 if(top == -1)
		 {
			 return true;
		 }
		 else
			 return false;
		 
	 }
	 public void push(int i)
	 {
         System.out.println("Push "+i);		
		if(top > size)
		 {
			 System.out.println("You can not push element in the array array is full");
		     return;
		 }
	     top++;
		 a[top] = i;
		
	 }
    public int pop()
	{
		top--;
		System.out.println("POP " +a[top +1]);
		return a[top +1];
		
	}
}


class TestStack
{ 


  public static void main(String args[]){
	Stack s1 = new Stack(10);
	System.out.println("Stack is created of size 10");
	System.out.println("Pushing 5 elements in stack");
	s1.push(23);
	s1.push(34);
	s1.push(1);
	s1.push(76);
	s1.push(45);
	System.out.println("Pop three elements");
	s1.pop();
	s1.pop();
	s1.pop();
  }
}