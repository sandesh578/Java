package regularExpression;
import java.util.Scanner;
public class CheckLogin {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("1.Password length must have at least 8 .");
		System.out.println("2.It must contain uppercase,lowercase letters,symbols and alphabets .");
		System.out.println("Enter a password:");
		String str=scan.nextLine();
		String pattern="\\s*[a-zA-Z_0-9]{8}\\w*";
		if(str.matches(pattern))
		{
			System.out.println("Valid Password");
		}
		else
		{
			System.out.println("Invalid Password,Try Again");
		}
		scan.close();

	}

}
