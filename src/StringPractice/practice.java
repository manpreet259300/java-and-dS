package StringPractice;

public class practice {
	public static void main(String[] args)
	{
		String str = "abc";
//		str +="def";
		String str1 = "ABC";
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.replace('a', 'd'));
		
		str1.concat("123");
		
		StringBuffer sb = new StringBuffer("inStringBuffer");
		sb.append("123");
		
		System.out.println(str + "      " + str1);
		System.out.println(" zzzzzzzzzzz "  +  sb.toString());
	}

	
	
}
