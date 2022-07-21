package webTechExam;
import java.util.Scanner;
interface NumOperations{
	public void evenOrOdd();
}
class TestNumber implements NumOperations{
	private int n;
    public TestNumber()
    {
    	n=0;
    }
    public TestNumber(int num)
    {
    	this.n=num;
    }
	public void evenOrOdd() {
		if(n%2!=0)
		{
			System.out.println(n+" is a odd number");
		}
		else
		{
			System.out.println(n+" is a even number");	
		}
	}
}

public class IntegerIsEvenOrOdd_Interface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		TestNumber c=new TestNumber(n);
		c.evenOrOdd();
		sc.close();

	}

}
