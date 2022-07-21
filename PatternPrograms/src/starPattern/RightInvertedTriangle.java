package starPattern;

import java.util.Scanner;

/*
 * triangle pattern
 *           * 
 *         * * 
 *       * * * 
 *     * * * * 
 *   * * * * * 
 */

public class RightInvertedTriangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n-1;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	 }
}
