import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UsingScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        double selection1 = scanner.nextDouble();
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.println("String: " +sentence); 
        System.out.println("Double: " +selection1); 
        System.out.println("Int: " +selection); 
        
    }
}