package Arrays;

import java.util.Arrays;

public class countTripletWithSmallerSumThanGivenValue {
	
	public static void main(String[] args)
	{
		int arr[] = {5, 1, 3, 4, 7};
		int n = arr.length;
		int sum = 12;
		System.out.println("count of triplets " + getCount(arr, n , sum));
	}
	
	public static int getCount(int[] arr, int n, int sum)
	{
		Arrays.sort(arr);
		int result = 0;
		for(int i = 0 ; i<n-2; i++)
		{
			int j =i+1;
			int k = n-1;
			
			while(j<k)
			{
				if(arr[i] + arr[j] + arr[k] >= sum)
					k--;
				else
				{
					result+=(k-j);
					j++;
				}
			}
		}
		return result;
	}

}
