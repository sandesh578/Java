package dateAndTIme;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateDemo {

	public static void main(String[] args) {
		Date d=new Date();//old class
		d.setHours(21);//deprecated
		System.out.println(d);
		
       //LocalDate dt=LocalDate.now();//is not mutable
       //System.out.println(dt);
       
       //LocalDate dt=LocalDate.now(ZoneId.of("Asia/Kathmandu"));
       //System.out.println(dt);
		
		//LocalDate dt=LocalDate.of(2021,Month.APRIL,10);
	    //System.out.println(dt);
		
		//LocalDate dt=LocalDate.ofEpochDay(1000);//starting time
	    //System.out.println(dt);
		
		LocalDate dt=LocalDate.parse("2021-04-01");//it is immutable
		LocalDate d1=dt.plusMonths(6);
	    System.out.println(d1);
	}

}
