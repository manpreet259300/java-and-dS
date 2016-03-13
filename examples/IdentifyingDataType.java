import java.util.Scanner;

public class IdentifyingDataType {

public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        for (int i=0; i<selection; i++) {
        	String s = scanner.next();
        	try {
        		long number = Long.valueOf(s);
        		if (number >= -128 && number <= 127) {
            		System.out.println(number+" can be fitted in:");
            		System.out.println("* byte");
            		System.out.println("* short");
            		System.out.println("* int");
            		System.out.println("* long");
            	}
            	else if (number >= -32768 && number <= 32767) {
            		System.out.println(number+" can be fitted in:");
            		System.out.println("* short");
            		System.out.println("* int");
            		System.out.println("* long");
               	}
            	else if (number >= -Math.pow(2, 31) && number <= Math.pow(2, 31) -1) {
            		System.out.println(number+" can be fitted in:");
            		System.out.println("* int");
            		System.out.println("* long");
               	}
            	else if (number >= -Math.pow(2, 63) && number <= Math.pow(2, 63) -1) {
            		System.out.println(number+" can be fitted in:");
               		System.out.println("* long");
               	}
            	else {
            		System.out.println(number+" can't be fitted anywhere.");
            	}
        	}
        	 catch( Exception e) {
        		 System.out.println(s+" can't be fitted anywhere.");
           	 }
        	
        }

	}
}
/*optimizied version
 * 
 * for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647) System.out.println("* int");
                if(x>=-9223372036854775808L && x<=9223372036854775807L) System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
 * 
 */
