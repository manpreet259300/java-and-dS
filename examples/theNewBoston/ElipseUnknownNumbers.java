package theNewBoston;

public class ElipseUnknownNumbers {

	public static void main(String[] args) {
		System.out.println(ElipseProg(45,78,78,85,4,54,54,654));

	}
	
	public static int ElipseProg(int...number) {
		int total=0;
		for(int x=0; x<number.length; x++) {
			total+=number[x];
		}
		return total/number.length;
	}

}
