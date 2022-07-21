package dateAndTIme;

import java.time.Instant;

public class InstantDemo {

	public static void main(String[] args) {
		//takes reference of GMT(GreenWich Mean Time
		//not dependent on time zone
		//capture the moment
		Instant i=Instant.now();
        System.out.println(i);
	}

}
