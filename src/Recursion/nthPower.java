package Recursion;
import java.util.Scanner;

public class nthPower {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number ");
		int no = scan.nextInt();
		System.out.println("enter the power");
		int power = scan.nextInt();
		
		System.out.println(findNthPower(no, power));
	}
	
	public static int findNthPower(int no, int power)
	{
		if(power == 0)
			return 1;
		return no * findNthPower(no, power-1);
	}
}
