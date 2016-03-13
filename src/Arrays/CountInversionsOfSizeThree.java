package Arrays;

/*
 * we consider every element arr[i] as middle element of inversion,
 * find all the numbers greater than a[i] whose index is less than i,
 * find all the numbers which are smaller than a[i] and index is more than i.
 * We multiply the number of elements greater than a[i] to the 
 * number of elements smaller than a[i] and add it to the result 
 */

public class CountInversionsOfSizeThree {
	
	 public static void main(String args[])
	    {
	        int arr[] = new int[] {8, 4, 2, 1};
	        int n = arr.length;
	        System.out.print("Inversion count : " + 
	                    getInvCount(arr, n));
	    }
	 
	 public static int getInvCount(int[] arr, int n)
	 {
		 int result = 0;
		 for (int i =0; i <n-1; i++)
		 {
			 int small = 0;
			 for(int j=i+1; j < n; j++)
				 {
				 if(arr[i]>arr[j])
					 small++;
				 }
			 int large = 0;
			 for(int j= i - 1; j >=0; j--)
			 {
				 if(arr[j]>arr[i])
					 large++;
			 }
			 
			 result += large*small;
		 }
		 return result;
	 }

}
