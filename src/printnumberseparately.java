import java.util.*;
public class printnumberseparately {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		String str=scanner.next();
		System.out.println("Digits of number are:");
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		scanner.close();

	}

}
