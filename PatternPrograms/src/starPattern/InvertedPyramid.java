package starPattern;
import java.util.Scanner;

/*
 * inverted pyramid pattern
 * * * * * * * * * *
 *   * * * * * * *
 *     * * * * * 
 *       * * *
 *         *
 */

public class InvertedPyramid {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=5,x=n;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i-1;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*(x-1)+1;j++) {
				System.out.print("* ");
			}
			x--;
			System.out.println();
		}
		scan.close();

	}

}
