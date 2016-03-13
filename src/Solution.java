import java.io.*;
import java.util.*;

    // 1. create an array of 5 integers elements 
    // 2. assign this array with 1, 2, 3, 4, 5
    // 3. create a function to reverse the array and print the results 
    // 4. add try, catch block 
    // 5. trigger an exception

class Solution {
  public static void main(String[] args) {
  //1 and 2
    
    int[] arr = {1,2,3,4,5};
    int[] result = reverse(arr);
    for(int i = 0;i<result.length; i++)
    {
      System.out.println(result[i]);
    }
    //5
    int[] dummy =new int[5];
    int[] resulr2 = reverse(dummy);
  }
  //3
  public static int[] reverse(int[] arr)
  {
    //4
    int a[]= new int[arr.length];
    try {
      if(arr == null) throw new NullPointerException();
        
     // return arr;
    
    int j= 0;
    for(int i = arr.length-1;i>=0; i--)
    {
      a[j] = arr[i];
      j++;
    }
    
    }
  catch(Exception e)
  {
    
    System.out.println("exceptin occured");
  }
  return a;
  }
}
