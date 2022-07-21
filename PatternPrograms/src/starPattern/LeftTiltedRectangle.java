package starPattern;
import java.util.Scanner;

/*
 * left tilted pattern
 * * * * * * 
 *   * * * * * 
 *     * * * * * 
 *       * * * * * 
 *         * * * * * 
 */

public class LeftTiltedRectangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i-1;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();

	}

}
