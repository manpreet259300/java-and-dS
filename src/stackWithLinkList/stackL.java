package stackWithLinkList;

import java.util.EmptyStackException;

public class stackL {

	private Node top;
	public  stackL()
	{
		top = null;
	}
	
	public int size()
	{
		if(top ==null)
		{
			System.out.println("stack is empty");
			return -1 ;
		}
		
		int count = 0;
		
		Node p;
		p = top;
		
		while(p!=null)
		{
			p =p.link;
			count++;
		}
		
		return count;
	}
	
	public void push (int x)
	{
		Node temp = new Node(x);
		temp.link = top;
		top = temp;
	}
	
	public int pop()
	{
		int x;
		if(isEmpty())
		{
			System.out.println("stack underflow");
			throw new EmptyStackException();
		}
		
		x = top.info;
		top =top.link;
		return x;
	}
	
	public boolean isEmpty()
	{
		return(top == null);
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("stack underflow");
			throw new EmptyStackException();
		}
		
		return top.info;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return;
		}
		Node p;
		p = top;
		System.out.println("stack : ");
		while(p!=null)
		{
			System.out.println("        "  + p.info );
			p =p.link;
		}
		
	}
}
