package StringPractice;
import java.util.*;
//
//
//in while loop check if the starting and ending char is alphabet then swap
// if starting is alphabet and end is not then do j--
//if starting is not alphabet and end is alphabet the do i++
//if start and end bothare not alphabet then do i++ and j--
//return the array it will do 
// code is not complete/just an nderstanding


//String str = "abc;"
//
//str +="def";
//
public class reverseWithoutAffectingSpecialChar {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the string to be reversed");
		String str = scan.nextLine();
		
		char[] ch = reverse(str);
		for(char c : ch)
			System.out.print(c);
	}
	
	public static char[] reverse(String str)
	{
		char[] ch = str.toCharArray();
		int i = 0;
		int j = str.length()-1;
		char temp = ' ';
		while(i<j)
		{
			if((ch[i] >= 'A' && ch[i] >= 'Z') || (ch[i] >= 'a' && ch[i] >= 'z') && (ch[j] >= 'a' && ch[j]<= 'z' ||

					ch[j] >= 'A' && ch[j]<= 'z'))
			{
//				System.out.print(str.charAt(j));
				i++;
//				j--;
			}
			else if(Character.isLetter(ch[j]))
			{
//				System.out.println(str.charAt(i));
//				i++;
				j--;
			}
			else
			{
				temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				
				i++;
				j--;
			}
			
		}
		return ch;
	}
}
