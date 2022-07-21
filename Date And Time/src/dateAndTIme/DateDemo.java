package dateAndTIme;

import java.util.Date;
//Starting time is 1 Jan 1970
public class DateDemo {

	public static void main(String[] args) {
//		long currentTime=(System.currentTimeMillis()/1000/60/60/24/365);//milliSeconds is converted into year
//		System.out.println(currentTime);
		
		//System.out.println(Long.MAX_VALUE);Maximum value of long
		
		//Date d=new Date(System.currentTimeMillis());
		//Date d=new Date("28/03/2001");
		
		Date d=new Date();//current date and time
		
		//System.out.println(d.getTime());current timein milliSeconds
		
		//System.out.println(d.getDate());//current date
		//System.out.println(d.getDay());//Days starts from zero
		//System.out.println(d.getMonth());//Month starts from zero
		System.out.println(d.getYear()+1900);//Year starts from 1900

	}

}
