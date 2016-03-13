package StringPractice;
import java.util.Scanner;

public class pallindrome {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string to check if it is pallindrome");
		String input = scan.nextLine();
		isPalindrome(input);
	}
	
	public static boolean isPalindrome(String in){
		if(in == null)
			return false;
		StringBuilder srBuilder = new StringBuilder(in);
		srBuilder.reverse();
		return srBuilder.toString().equals(in);
	}
	
	//more methods to check palindrome using length
	//	private static boolean isPalindromeString(String str) {
	//	    if (str == null)
	//	        return false;
	//	    int length = str.length();
	//	    System.out.println(length / 2);
	//	    for (int i = 0; i < length / 2; i++) {
	//	 
	//	        if (str.charAt(i) != str.charAt(length - i - 1))
	//	            return false;
	//	    }
	//	    return true;
	//	}
}

