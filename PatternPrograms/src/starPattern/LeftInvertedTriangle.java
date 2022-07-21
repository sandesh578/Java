package starPattern;

import java.util.Scanner;

/*
 * left inverted triangle pattern
 * * * * * * 
 * * * * * 
 * * * * 
 * * * 
 * * 
 */

public class LeftInvertedTriangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	 }
}
