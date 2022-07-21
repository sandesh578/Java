package webTechExam;
import java.util.Scanner;
public class EvaluateExpression {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number of data:");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(+(1/Math.pow(i,2))+"+");
			if(i==n)
			{
				System.out.print(+(1/Math.pow(i,2)));
			}
		}
		scan.close();

	}

}
