import java.util.Scanner;
public class replace_the_occuranceof_char_instring {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scanner.nextLine();
		String temp=str.replace('a','b');
		System.out.println(temp);
		scanner.close();

	}

}
