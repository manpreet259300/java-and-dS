import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AmPmTo24 {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		
		String a = in.nextLine();
		
		SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
	    SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
		
	    Date date = parseFormat.parse(a);
	    
	    System.out.println(displayFormat.format(date));
	    

	}

}
