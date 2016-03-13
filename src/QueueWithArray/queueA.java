package QueueWithArray;

public class queueA {
	
	public int[] queueArray;
	public int front;
	public int rear;
	
	public queueA()
	{
		queueArray = new int[10];
		front = -1;
		rear = -1;
	}
	
	public queueA(int arraySize)
	{
		queueArray = new int[arraySize];
	}
	
	public boolean isEmpty()
	{
		return(front == -1 || front == rear + 1);
	}
	
	public boolean isFull()
	{
		return(rear == queueArray.length-1);
	}
	
	public int size()
	{
		if(isEmpty())
			return 0;
		return rear - front + 1;
	}
	
	public void insert(int x)
	{
		if(isFull())
		{
			System.out.println("queue is full");
			return;
		}
		if (front == -1)
			front=0;
		rear=rear + 1;
		queueArray[rear] = x;		
	}

	public int delete()
	{
		if(isEmpty()){
		System.out.println("queue is emoty");
		return -1;
		}
		int x = queueArray[front];
		front = front + 1 ;
		return x;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("no element found");
			return -1;
		}
		
		return(queueArray[front]);
	}
	
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("no element present in queue");
			return;
		}
		
		System.out.println("the elements in queue are");
		for (int i = front; i<= rear; i++)
		{
			System.out.print(" " + queueArray[i] + "|");
		}
		System.out.println("");
	}	
}
