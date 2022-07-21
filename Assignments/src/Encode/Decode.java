package Encode;
import java.util.Scanner;

public class Decode {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scan.nextLine();
		int length=str.length();
		String decoded="";
		for(int i=0;i<length;i=i+2) {
			int n=Character.getNumericValue(str.charAt(i+1));
			for(int j=1;j<=n;j++) {
				decoded+=str.charAt(i);
			}
		}
		System.out.println("Decoded string is: "+decoded);
		scan.close();

	}

}
