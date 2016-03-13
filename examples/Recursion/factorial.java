package Recursion;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number to get the factorial");
		int no = scan.nextInt();
		
		System.out.println(" the factorial of "+ no + " is "+ factorial(no));
	}
	
	public static int factorial(int no)
	{
		if (no == 1)
			return 1;
		return no * factorial(no-1);
	}
}
