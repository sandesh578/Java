package dateAndTIme;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDemo {

	public static void main(String[] args) {
		GregorianCalendar gc=new GregorianCalendar();
		gc.setTimeZone(TimeZone.getTimeZone("Asia/Kathmandu"));
		TimeZone tz=gc.getTimeZone();
		System.out.println(tz.getDisplayName());
		System.out.println(tz.getID());
	}

}
