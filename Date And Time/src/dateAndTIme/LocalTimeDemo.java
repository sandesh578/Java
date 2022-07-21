package dateAndTIme;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		//new Api
		LocalTime lt=LocalTime.now();//it is not mutable
		LocalTime l1=lt.minusHours(3);
		System.out.println(l1);
		
		System.out.println(lt.getHour());

	}

}
