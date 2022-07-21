package lab8;
import java.util.Scanner;
interface Motor{
	long capacity=3000;
	public void runs(int speed);
	public void consume(int power);
}
class WashingMachine implements Motor{
	public void runs(int speed)
	{
		System.out.println("Capacity of motor in washing machine is "+capacity+" and speed is "+speed);
	}
	public void consume(int power)
	{
		System.out.println("Washing machine consumes "+power+" power");
	}
}
public class MotorQeus2 {

	public static void main(String[] args) {
		
		WashingMachine obj=new WashingMachine();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter speed of motor:");
		int speed=scan.nextInt();
		System.out.println("Enter power consumed:");
		int power=scan.nextInt();
		obj.runs(speed);
		obj.consume(power);
		scan.close();
	}

}
