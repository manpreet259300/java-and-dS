import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Algo3 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        long sum = 0;
        int n = in.nextInt();
         
        for(int i =0; i<n; i++) {
            sum = sum + in.nextInt();
        }
        System.out.println(sum);
    }
}