package RegEx;

import java.io.*;
import java.util.*;


public class splitUsingRegex {

      
        public static void main(String[] args) 
        {      
          Scanner scan = new Scanner(System.in);
          String s=scan.nextLine();
        //Complete the code
          String s3 = s.trim();
          if(s==null)
        	  return;
          if(s3.isEmpty())
        	  System.out.println("0");
          else
          {
	          String[] s1 = s.split("[ !,?._'@]+");
	          System.out.println(s1.length);
	          for(String s2 : s1)
	               System.out.println(s2);
          }
        }
}


