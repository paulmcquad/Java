package DateTime;
import java.util.Date;

public class dateformattindtime {

	public static void main(String args[]) {
		// Instantiate a Date object
		Date date = new Date();

		// display time and date
		String str = String.format("Current Date/Time : %tc", date );

		System.out.printf(str);
	}
}