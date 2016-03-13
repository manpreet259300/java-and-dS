package StringPractice;
import java.util.Arrays;
import java.util.Scanner;

/*
    How to check if two Strings are anagrams of each other? (solution)

	A simple coding problem based upon String, but could also be asked with numbers. You need to write a Java program to check if two given strings are anagrams of Each other. Two strings are anagrams if they are written using the same exact letters, ignoring space, punctuation and capitalization. Each letter should have the same count in both strings. For example, Army and Mary are anagram of each other.

	Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz3zj1IYwxN 
 */

public class Anagrams {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first string");
		String first = scan.nextLine();
		System.out.println("enter the second string");
		String second = scan.nextLine();
		
		if(isAnagram(first, second))
		{
			System.out.println("the two entered words are anagram");
		}
		else
		{
			System.out.println("entered words are not anagram");
		}
	}
	
	public static boolean isAnagram(String first, String second)
	{
		if(first == null || second == null || first =="" || second =="" || first.length()!=second.length())
		 return false;
		char[] ch1 = first.toCharArray();
		char[] ch2 = second.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}
}
