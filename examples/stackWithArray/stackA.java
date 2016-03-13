package stackWithArray;
import java.util.EmptyStackException;

public class stackA {
	
	private int[] stackArray;
	private int top;
	
	public stackA()
	{
		stackArray = new int[10];
		top = -1;
	}

	public stackA(int maxSize)
	{
		stackArray = new int[maxSize];
	}
	
	public int size()
	{
		return (top+1);
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
		return (top == stackArray.length - 1);
	}
	
	public void push(int x)
	{
		if(isFull())
		{
			System.out.println("stack overflow");
			return;
		}
		
		top = top + 1;
		stackArray[top] = x;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack underFlow");
			throw new EmptyStackException();
		}
		
		int x = stackArray[top];
		top = top - 1;
		return x;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("no element is present in stack");
			throw new EmptyStackException();
		}
		
		return stackArray[top];
	}
	
	public void display()
	{
		if(isEmpty())
			System.out.println("no element present in stack");
		System.out.println(" stack : ");
		for (int i = top ; i >=0; i--)
		{ 
			System.out.println(" " + stackArray[i] + " ");
		}
	}
}
