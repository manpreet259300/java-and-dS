package QueueWithLinked;
import java.util.NoSuchElementException;

public class QueueL {

	public Node front;
	public Node rear;
	
	public QueueL()
	{
		front = null;
		rear = null;
	}
	
	public int size()
	{
		int count = 0;
		Node p = front;
		while(p!=null)
		{
			count++;
			p=p.link;
		}
		
		return count;
	}
	
	public void insert(int x)
	{	
		Node temp = new Node(x);
		if(front == null)
		{
			front = temp;
		}
		else
		{
			rear.link= temp;
		}
		
		rear = temp;
	}
	
	public int delete()
	{
		int x;
		if (front == null)
		{
			System.out.println(" no element in queue");
			throw new NoSuchElementException();
		}
		
//		if (front == rear)
//		{
//			x = front.info;
//			front = null;
//			rear = null;
//			return x;
//		}
//		
		x = front.info;
		front = front.link;
		return x;
	}
	
	public int peek()
	{
		if(front == null)
		{
			System.out.println("no element exists");
			throw new NoSuchElementException();
		}
		
		return front.info;
	}
	
	public void display()
	{
		Node p=front;
		if(front == null)
		{
			System.out.println("no element present");
			throw new NoSuchElementException();
		}
		System.out.println(" queue :");
		while(p!=null)
		{
			System.out.print(" " + p.info + "|");
			p =p.link;
		}
		System.out.println("");
	}
	
}
