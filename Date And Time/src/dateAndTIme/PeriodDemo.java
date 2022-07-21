package dateAndTIme;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		//returns period in terms of days month and year
		Period p=Period.of(2,2,10);//year,day,month
		System.out.println(p.addTo(LocalDate.now()));

	}

}
