import java.util.Scanner;
public class multiplication_table {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scanner.nextInt();
		System.out.println("Multiplication table of "+n+" is:");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+n*i);
		}
		scanner.close();

	}

}
