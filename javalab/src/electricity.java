import java.util.Scanner;
public class electricity {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a unit of electricity:");
		int unit=scanner.nextInt();
		double bill=1;
		if(unit<=50)
		{
			bill=bill*2.50;
		}
		else if(unit>50&&unit<=100)
		{
			bill=bill*3.50;
		}
		else if(unit>100&&unit<=150)
		{
			bill=bill*4.50;
		}
		else
		{
			System.out.println("Input out of range");
		}
		System.out.println("Electricity bill is:"+bill+" Rs");
		scanner.close();

	}

}
