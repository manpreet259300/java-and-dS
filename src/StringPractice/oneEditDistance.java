package StringPractice;
import java.util.Scanner;

public class oneEditDistance {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the first string");
		String s1 = scan.nextLine();
		System.out.println("enter the second string");
		String s2 = scan.nextLine();
		
	try{
		if(s1 == null || s2 == null )
			throw new Exception("wrong input");
		
	}
	catch (Exception e){
		System.out.println(e);
	}
		
		System.out.println("the strings provided are oe edit away for simialr:  " + oneEdit(s1, s2));		
	}
	
	public static boolean oneEdit(String s1, String s2)
	{
		if((s1.length() - s2.length()) >1)
			return false;
		int editCount = 0;
		int i=0;
		int j=0;
		while(i<s1.length() && j<s2.length())
		{
			// If current characters don't match
			if(s1.charAt(i) != s2.charAt(j))
			{	
				if(editCount == 1)
					return false;
			
				if(s1.length() >s2.length())
					i++;
				else if(s1.length() <s2.length())
					j++;
				else
				{
					i++;
					j++;
				}
				
				editCount++;
			}
			else
			{
				i++;
				j++;
			}
		}
		//if any string has more length
		if(i<s1.length() || j<s2.length())
			editCount++;
		
		return(editCount == 1);
	}
}
