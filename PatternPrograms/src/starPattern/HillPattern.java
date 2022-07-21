package starPattern;

import java.util.Scanner;

/*
 * pyramid pattern
 *         *
 *       * * * 
 *     * * * * * 
 *   * * * * * * *
 * * * * * * * * * *
 */


 public class HillPattern {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n-1;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*(i-1)+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	 }
}
