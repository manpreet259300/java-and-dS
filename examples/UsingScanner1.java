import java.util.Scanner;

public class UsingScanner1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 // String s1=sc.next() - use this to fetch the string till space
		
	     String sentence = scanner.nextLine();
	     String[] part = sentence.split(" ");
	     int parts = Integer.parseInt(part[1]);
	     String sentence1 = scanner.nextLine();
	     String[] part1 = sentence1.split(" ");
	     int parts1 = Integer.parseInt(part1[1]);
	     String sentence2 = scanner.nextLine();
	     String[] part2 = sentence2.split(" ");
	     int parts2 = Integer.parseInt(part2[1]);
	     System.out.println("================================");
	     System.out.printf("%-15s%03d\n", part[0], parts );
	     System.out.printf("%-15s%03d\n", part1[0], parts1 );
	     System.out.printf("%-15s%03d\n", part2[0], parts2 );
	     System.out.println("================================");
	     // - is used for left alignment of the string
	     // 0 in front of 3d is used for providing the 0 if the integer is less than 3 char
	}

}
