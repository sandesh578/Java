package dateAndTIme;

import java.time.OffsetDateTime;

public class OffsetDateTimeDemo {

	public static void main(String[] args) {
		OffsetDateTime st=OffsetDateTime.now();
		System.out.println(st);

		System.out.println(st.toZonedDateTime());

	}

}
