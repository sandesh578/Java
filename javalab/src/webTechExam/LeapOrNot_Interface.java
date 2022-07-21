package webTechExam;
import java.util.Scanner;
interface yearType{
	public void leapOrNot();
}
class checkYear implements yearType{
	private int year;
    public checkYear()
    {
    	year=0;
    }
    public checkYear(int years)
    {
    	this.year=years;
    }
	public void leapOrNot() {
		if(year%100==0&&year%4==0||year%400==0)
		{
			System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year+" is not a leap year");	
		}
	}
}

public class LeapOrNot_Interface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year:");
		int year=sc.nextInt();
		checkYear c=new checkYear(year);
		c.leapOrNot();
		sc.close();

	}

}
