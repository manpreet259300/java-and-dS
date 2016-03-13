package CircularQueue;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args)
	{
		queueCircular q  = new queueCircular(8);
		Scanner scan  = new Scanner(System.in);
		
		int choice, x;
		
		while(true)
		{
		System.out.println("1. insert in queue");
		System.out.println("2. delete from queue");
		System.out.println("3. display queue");
		System.out.println("4. peek in queue");
		System.out.println("5. display size of queue");
		System.out.println("10. quit");
		
		choice =scan.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("enter the value to be inserted");
			x = scan.nextInt();
			q.insert(x);
			System.out.println("value is inserted");
			break;
		case 2:
			q.delete();
			System.out.println("element is deleted from queue");
			break;
		case 3:
			q.display();
			break;
		case 4:
			System.out.println("peel" +q.peek());
			break;
		case 5:
			System.out.println("size "+ q.size());
			break;
		default:
			System.out.println("enter correct choice");
			break;
		}
		}
	}

}
