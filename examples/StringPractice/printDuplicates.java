package StringPractice;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class printDuplicates {
	
	public static void main(String[] args)
	{
		System.out.println("enter the string");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		printDuplicatCharacters(input);
	}
	
	public static void printDuplicatCharacters(String str){
		
		char[] inp = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		//inserting in a hashMap
		for(Character ch: inp)
		{
				if(charMap.containsKey(ch))
				{
					charMap.put(ch, charMap.get(ch)+1);
				}
				else
				{
					charMap.put(ch, 1);
				}
		}
		
		//now for finding and printing - creatinfg a a entry set to traverse through the hash map
		Set<Map.Entry<Character,Integer>> entryset = charMap.entrySet();
		System.out.printf(" list of duplicatr4e characters in a String %s \n", str);
		for(Map.Entry<Character, Integer> entry : entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.printf(" %s %d %n", entry.getKey(), entry.getValue());
			}		
		}
	}
}
