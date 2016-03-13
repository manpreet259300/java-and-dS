package Recursion;
import java.util.Scanner;

public class GCDuingEuclid {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the first number");
		int first = scan.nextInt();
		System.out.println("enter the second number");
		int second = scan.nextInt();
		
		System.out.println("gcd of " + first + " and "+ second + " is "+ findGCD(first, second));
	}
	
	public static int findGCD(int f, int s)
	{
		if(s==0)
			return f;
		return findGCD(s, f%s);
	}
}
