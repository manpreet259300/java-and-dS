import java.util.Scanner;

public class FindingEOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			count++;
			String s = scanner.nextLine();
			System.out.println(count+ " " +s);
			
		}
	}

}
