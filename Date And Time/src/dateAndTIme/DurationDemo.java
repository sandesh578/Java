package dateAndTIme;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationDemo {

	public static void main(String[] args) {
		//returns duration in terms of hour im sec
		Duration d=Duration.between(LocalTime.now(),LocalTime.NOON);
		System.out.println(d.get(ChronoUnit.SECONDS));

	}

}
