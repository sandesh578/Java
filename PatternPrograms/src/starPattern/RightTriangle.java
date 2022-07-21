package starPattern;

import java.util.Scanner;

/*
 * right triangle pattern
 * * * * * * 
 *   * * * * 
 *     * * * 
 *       * * 
 *         * 
 */

public class RightTriangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	 }
}
