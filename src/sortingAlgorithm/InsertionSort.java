package sortingAlgorithm;
import java.util.Scanner;

public class InsertionSort {

	public static void insertSort(int[] a, int n)
	{
		int temp, j;
		for (int i = 1; i<n; i++)
		{ 
			temp = a[i];
			for(j=i-1; j>=0 && a[j] >temp ; j--)
				a[j+1] = a[j];
			
			a[j+1] = temp;
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
		insertSort(a, n);
		
		//output
		System.out.println("sorted output is ");
		for(int i= 0; i<n;i++)
			System.out.println(a[i]);
		scan.close();
		
	}
}
