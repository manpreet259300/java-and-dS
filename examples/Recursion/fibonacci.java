package Recursion;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the nth number for fibonacci series");
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.print(findFibonacci(i)+ " ");
		}
	}
	
	public static int findFibonacci(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		return findFibonacci(n-1)+findFibonacci(n-2);
	}
}
