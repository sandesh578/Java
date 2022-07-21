import java.util.Scanner;
public class simpleinteresr {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a principle:");
		int p=scanner.nextInt();
		System.out.println("Enter a time:");
		int t=scanner.nextInt();
		System.out.println("Enter a rate:");
		int r=scanner.nextInt();
		double s=(p*t*r)/100;
		System.out.println("Simple interest is:"+s);
		if(s>500)
		{
			p=p+500;
			s=(p*t*r)/100;
			System.out.println("New Simple interest is:"+s);
		}
		scanner.close();

	}

}
