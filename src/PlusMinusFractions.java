import java.util.Scanner;

public class PlusMinusFractions {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
		int x =  in.nextInt();
		double plus=0, minus=0, zero = 0;
		int a[] = new int[x];
		 for (int i = 0; i<x; i++){
			 
			  a[i] = in.nextInt();
			 
			 if(a[i]>0) {
				 plus++;
			 }
			 else if (a[i]<0) {
				 minus++;
			 } else {
				 zero++;
			 }
		 }
		 
		 double b = plus/(double)x;
		 double c = minus/(double)x;
		 double d = zero/(double)x;
       
		 System.out.printf("%.3f%n%.3f%n%.3f", b,c,d);
	 
		 }


}
