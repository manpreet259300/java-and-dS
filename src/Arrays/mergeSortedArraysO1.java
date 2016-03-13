package Arrays;

public class mergeSortedArraysO1 {
	
	public static void main(String[] args)
	{
		int[] arr1 = {1, 5, 9, 10, 15, 20};
		int[] arr2 = {2, 3, 8, 13};
		
		
		merge(arr1, arr2, arr1.length, arr2.length);
		
		for(int i =0; i<arr1.length; i++)
			System.out.print(arr1[i]+ " ");
		System.out.println("");
		for(int i =0; i<arr2.length; i++)
			System.out.print(arr2[i]+ " ");
		System.out.println("");
	}
	
	public static void merge(int[] arr1, int[] arr2, int m, int n)
	{
		int i;
		for (i = n-1; i>=0; i--)
		{
			int j;
			int last = arr1[m-1];
			for(j=m-2; j>=0 && arr1[j]>arr2[i] && arr1[m-1] > arr2[i]; j--)
			{
				arr1[j+1] = arr1[j];
			}
			
			if (j!= m-1)
			{
				arr1[j+1] = arr2[i];
				arr2[i] = last;
			}
		}
	}

}
