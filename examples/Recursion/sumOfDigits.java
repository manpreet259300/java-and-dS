package Recursion;
import java.util.Scanner;

public class sumOfDigits {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the digit");
		int no = scan.nextInt();
		System.out.println("sum of the integer "+ no + " is " + sumOfInteger(no));
	}
	
	public static int sumOfInteger(int x) 
	{
		if(x/10 == 0)
			return x;
		return sumOfInteger(x/10) + x%10;
	}
}
