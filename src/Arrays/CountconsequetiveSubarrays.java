package Arrays;
import java.util.*;

public class CountconsequetiveSubarrays {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
//		int a = arr.length;
		for (int i = 0; i<n; i++)
		{
			System.out.println("enter the element");
			arr[i]= scan.nextInt();
		}
		
		//creating subarrays first
//		for(int i =0; i<n; i++)
//		{
//			for (int j=i; j<n;j++)
//			{	
//				for (int k=i; k<=j; k++)
//					System.out.print(arr[k]+ " ");
//				System.out.println();
//			}
//			
//		}
		
		//counting max subarrays
		// formula for counting sub arrays is  n(n-1)/2
		//used that inly in the below code but cnt is kept increasing if there are breaks in the consequetive arrays
		int len = 1;
		int cnt = 0;
		for(int i =0; i < n-1 ; i++)
		{
			if(arr[i+1] > arr[i])
				len++;
			else
			{
				cnt += ((len-1) * len)/2;
				len =1;
			}
		}
		
		if(len>1)
		{
			cnt += ((len-1) * len)/2;
			
		}
		
		System.out.println("count of consequetive subarrays " + cnt);
		scan.close();
	}
}
