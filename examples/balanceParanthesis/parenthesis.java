package balanceParanthesis;
import java.util.Stack;
import java.util.Scanner;


public class parenthesis {
	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the expression for checking");
		
		String str = scan.nextLine();
		
		if(isBalanced(str))
		{
			System.out.println("the input expression have balanced parenthesis");
		}
		else
		{
			System.out.println("input expression does not have  balanced parenthesis");
		}
	}
	
	public static boolean isBalanced(String str)
	{
		
		Stack st = new Stack();
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == '{' || str.charAt(i)== '(' || str.charAt(i)=='[')
				st.push(str.charAt(i));
			if(str.charAt(i)=='}' || str.charAt(i) == ')' || str.charAt(i)==']')
			{
				if(st.isEmpty())
				{
					System.out.println("right parenthesis are more htan left parenthesis");
					return false;
				}
				else 
				{	
					char ch = (Character)st.pop();
					if(!matchParenthesis(ch,str.charAt(i)))
					{
						System.out.println("mismaych parenthesis are");
						System.out.println(ch + " and " + str.charAt(i));
						return false;
					}
				}
			}
		}
		if(st.isEmpty())
			{
			System.out.println("balanced parenthesis");
			return true;
			}
		else
		{
			System.out.println("more left parenthesis");
			return false;
		}
	}
	
	public static boolean matchParenthesis(char ch, char match)
	{
		if(ch == '[' && match == ']')
			return true;
		if(ch == '(' && match == ')')
			return true;
		if(ch == '{' && match == '}')
			return true;
		return false;
	}
}
