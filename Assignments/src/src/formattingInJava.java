package src;
import java.util.Scanner;

public class formattingInJava {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			String s1=scan.next();
			int x=scan.nextInt();
			//% is used as formatter
			//- sign is used for left indentation of the string 
			//15s denotes the strings mimimum field with width 15
			//0 pads the extra 0 in the integer
			//3d denotes integer with minimum width 3
			//%n prints the new line
			System.out.printf("%-15s%03d%n",s1,x);
			
		}
		scan.close();

	}

}
