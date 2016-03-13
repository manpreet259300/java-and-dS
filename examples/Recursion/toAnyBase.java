package Recursion;
import java.util.Scanner;

public class toAnyBase {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number to be converted");
		int no = scan.nextInt();
		System.out.println("enter the base no for conversion");
		int base = scan.nextInt();
		toBaseConversion(no, base);
	}
	
	public static void toBaseConversion(int no, int base)
	{
		if( no == 0)
			return;
		toBaseConversion(no/base, base);
		System.out.print(no%base);
	}
	
}
