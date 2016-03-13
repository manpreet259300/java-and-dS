package StringPractice;
import java.util.*;

public class lexic {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input first string");
		String s1 = scan.nextLine();
		System.out.println("input second string");
		String s2  = scan.nextLine();
		
		int n = s1.compareToIgnoreCase(s2);
		
		if(n>0)
		{
			System.out.println(s2 + " comes first");
		}
		else if(n<0)
		{
			System.out.println(s1 + " comes first");
		}
		else
			System.out.println(s1 + " and " + s2 + " are equal");
		
	}
}
