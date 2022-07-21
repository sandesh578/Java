package dateAndTIme;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {

	public static void main(String[] args) {
		//ZonedDateTime st=ZonedDateTime.now();
		ZonedDateTime st=ZonedDateTime.now(ZoneId.of("Asia/Kathmandu"));
		System.out.println(st);

	}

}
