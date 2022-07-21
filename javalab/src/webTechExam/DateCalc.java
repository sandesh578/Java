package webTechExam;
class Date{
	int day,month,year;
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int daySinceJan1()
	{
		
	}
}
class DateDemo extends Date{
	
}
public class DateCalc {
   public static void main(String[] args)
   {
	   DateDemo d=new DateDemo(34,4,2020);
	   d.daySinceJan1();
   }
}
