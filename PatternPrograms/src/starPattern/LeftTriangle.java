package starPattern;

import java.util.Scanner;

/*
 * left triangle pattern
 * * 
 * * * 
 * * * * 
 * * * * * 
 * * * * * * *
 */

public class LeftTriangle {
	
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	scan.close();
 }
}
