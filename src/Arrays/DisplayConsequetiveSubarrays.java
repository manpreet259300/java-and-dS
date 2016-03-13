package Arrays;

import java.util.Scanner;

public class DisplayConsequetiveSubarrays {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i<n; i++)
		{
			System.out.println("enter the element");
			arr[i]= scan.nextInt();
		}
		
		ConsequetiveSubarray(arr, n);
		scan.close();
	}
	
	//formula to find the no of sub arrays is ((2^n))
	public static void ConsequetiveSubarray(int[] arr, int n)
	{
		int opSize = (int)Math.pow(2, n);
		
		for (int i = 1; i<opSize; i++)
		{
			for (int j =0; j<n ; j++)
			{
				//in c++ change it to java
				if(i & (1<<j))
					System.out.println(j);
			}
			System.out.println("");
		}
	}
}
