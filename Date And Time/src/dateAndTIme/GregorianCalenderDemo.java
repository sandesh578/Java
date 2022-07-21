package dateAndTIme;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalenderDemo {

	public static void main(String[] args) {
		GregorianCalendar gc=new GregorianCalendar();//it is mutable
		//System.out.println(gc.isLeapYear(2020));
		System.out.println(Calendar.DATE);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.DAY_OF_WEEK);//starts from 1
		System.out.println(Calendar.HOUR);
		System.out.println(gc);
		

	}

}
