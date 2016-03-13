package theNewBoston;

public class TimeCalling {

	public static void main(String[] args) {
		TimeFormats MilTime = new TimeFormats();
		MilTime.setTime(16,31,8);
		System.out.println(MilTime.MilitaryTime());
	}

}
