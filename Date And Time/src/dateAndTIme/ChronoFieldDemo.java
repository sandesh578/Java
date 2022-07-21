package dateAndTIme;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class ChronoFieldDemo {

	public static void main(String[] args) {
		
		//get method is available in all date time class
		LocalDateTime dt=LocalDateTime.now();
		
		System.out.println(dt.get(ChronoField.AMPM_OF_DAY));
		System.out.println(dt.get(ChronoField.YEAR));

	}

}
