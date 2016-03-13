package sortingAlgorithm;
import java.util.Scanner;

public class BubbleSort {

	public static void bubbleSort(int[] a, int n)
	{
		for (int i = n-2; i>=0; i--)
		{ 
			int temp;
			int swap=0;
			for(int j=0;j<=i; j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j]= a[j+1];
					a[j+1] = temp;
					swap++;
				}
			}
			
			if (swap==0)
			{
				break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scan.nextInt();
		int[] a = new int[n];
		
		//Input
		for (int i = 0; i<n; i++)
		{
			System.out.println("enter the element" );
			a[i]  = scan.nextInt();
		}
		
		//sort calling
		bubbleSort(a, n);
		
		//output
		System.out.println("sorted output is ");
		for(int i= 0; i<n;i++)
			System.out.println(a[i]);
		
	}
}
