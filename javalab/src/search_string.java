import java.util.Scanner;
public class search_string {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scanner.nextLine();
		System.out.println("Enter a string to search:");
		String search=scanner.next();
		if(str.contains(search))
		{
			System.out.println(search+" is present in the string at position "+str.indexOf(search));
		}
		else
		{
			System.out.println(search+" is not present in the string");
		}
		scanner.close();

	}

}
