package sortingAlgorithm;
import java.util.Scanner;

public class selectionSort {

	public static void selSort(int[] a, int n)
	{
		int temp;
		for (int i = 0; i< n-1; i++)
		{
			int minIndex = i;
			for(int j=i+1;j<n; j++)
			{
				if(a[minIndex]>a[j])
					minIndex = j;
			}
			
			if(minIndex!=i)
			{
				temp = a[i];
				a[i]= a[minIndex];
				a[minIndex] = temp;
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
		selSort(a, n);
		
		//output
		System.out.println("sorted output is ");
		for(int i= 0; i<n;i++)
			System.out.println(a[i]);
		
	}
}
