package dateAndTIme;
/*
 * y=year
 * M=month
 * y=year
 * 
 * h=hour(0-12)
 * Hour=hour(0-24)
 * m=minutes
 * s=seconds
 * S=miliseconds
 * z time zone
 * Z offset
 */
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatDemo {

	public static void main(String[] args) {
		ZonedDateTime dt=ZonedDateTime.now();
		//LocalDateTime dt=LocalDateTime.now();
		DateTimeFormatter fd=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z Z");
		System.out.println(fd.format(dt));

	}

}
