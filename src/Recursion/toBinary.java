package Recursion;
import java.util.Scanner;

public class toBinary {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no ");
		int  no  = scan.nextInt();
		binaryConversion(no);
	}
	
	public static void binaryConversion(int no)
	{
		if(no == 0)
			return;
		 binaryConversion(no/2);
		System.out.print(no%2);
	}

}
