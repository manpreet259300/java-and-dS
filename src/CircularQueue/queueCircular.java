package CircularQueue;

public class queueCircular {
	
	public int[] queueArray;
	public int front;
	public int rear;
	
	public queueCircular()
	{
		queueArray = new int[10];
		front = -1;
		rear = -1;
	}
	
	public queueCircular(int arraySize)
	{
		queueArray = new int[arraySize];
	}
	
	public boolean isEmpty()
	{
		return(front == -1);
	}
	
	public boolean isFull()
	{
		return(front == rear+1 || (front==0 && rear == queueArray.length-1));
	}
	
	public int size()
	{
		int i =front;
		int sz = 0;
		if(isEmpty())
			return 0;
		if(isFull())
			return queueArray.length;
		if(front <=rear)
			{
			while(i<=rear)
				{
					i++;
					sz++;
				}
			}
		else
			{
				while(i<=queueArray.length-1)
				{
					i++;
					sz++;
				}
				i=0;
				while(i<=rear)
				{
					i++;
					sz++;
				}
			}
		return sz;
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
		if(rear == queueArray.length-1)
		{	
			rear = 0;
			queueArray[rear] = x;
		}
		else
		{
			rear=rear + 1;
			queueArray[rear] = x;
		}
	}

	public int delete()
	{
		if(isEmpty()){
		System.out.println("queue is empty");
		return -1;
		}
		int x = queueArray[front];
		if(front == rear)
			{
			front = -1;
			rear = -1;
			}
		else if(front == queueArray.length -1)
			{
			front = 0;
			}
		else{
			front = front + 1 ;
			}
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
		if(front<=rear)
		{	for (int i = front; i<= rear; i++)
			{
				System.out.print(" " + queueArray[i] + "|");
			}
			System.out.println("");
		}
		else {
				for(int j = front; j<=queueArray.length-1 ;j++)
					System.out.print(" "+ queueArray[j]+"|");
				for(int k = 0; k<=rear; k++)
					System.out.print(" "+ queueArray[k]+"|");
				}
		System.out.println("");
		}
	}	

