import java.util.Scanner;

public class SeeriesThroughLoop {

	public static void main(String[] args) {
	// series - a+20b,a+20b+21b,......,a+20b+21b+...+2n−1b
		Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        for (int i=0; i<selection; i++) {
        	String s = scanner.next();
        	String s1 = scanner.next();
        	String s2 = scanner.next();
        	int a = Integer.parseInt(s);
        	int b = Integer.parseInt(s1);
        	int n = Integer.parseInt(s2);
        	
        	for (int x=0; x<n; x++) {
        		
        		int ready = 0;
        	 for ( int k = 0; k <= x; k++) {
        	  ready += ((int)Math.pow(2, k)*b); 
        	 }
        	 
        	 int result = a + ready;
        	 System.out.print(result+" ");
        	}
        	
        	System.out.println();
        }
	}
}
