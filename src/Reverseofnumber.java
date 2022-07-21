import java.util.Scanner;

public class Reverseofnumber {

	public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the number:");
			int num=scanner.nextInt();
			int rem;
			int rev=0;
			while(num!=0)
			{
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
          System.out.println(rev);
          scanner.close();
	}

}

