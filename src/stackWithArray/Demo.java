package stackWithArray;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args)
	{
		Scanner scan  = new Scanner(System.in);
		
		stackA st = new stackA(8);
		int choice, x;
		
		while(true)
		{
			System.out.println("1. push into stack");
			System.out.println("2. pop from stack");
			System.out.println("3. display top element");
			System.out.println("4. check empty");
			System.out.println("5. check full");
			System.out.println("6. display all stack elements");
			System.out.println("7. display size of stack");
			System.out.println("8. quit");
			
			choice = scan.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("enter the no to be pushed in stack");
					x = scan.nextInt();
					st.push(x);
					break;
				case 2:
					st.pop();
					break;
				case 3:
					st.peek();
					break;
				case 4:
					System.out.println("stack is empty" + st.isEmpty());
					break;
				case 5:
					System.out.println("stack is full" + st.isFull());
					break;
				case 6:
					st.display();
					break;
				case 7:
					System.out.println("size of stack is " + st.size());
					break;
				default:
					System.out.println("wrong choice");
					break;
			}
			
		}
	}
}
