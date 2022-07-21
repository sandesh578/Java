import java.util.*;
public class increaseval {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scanner.nextInt();
		if(num>=500)
		{
			num=num+50;
		}
		else if(num>=400)
		{
			num=num+40;
		}
		else if(num>=300)
		{
			num=num+30;
		}
		else if(num>=200)
		{
			num=num+20;
		}
		else if(num>=100)
		{
			num=num+10;
		}
		else
		{
			num=num+50;
		}
		System.out.println("Num is:"+num);
		scanner.close();

	}

}
