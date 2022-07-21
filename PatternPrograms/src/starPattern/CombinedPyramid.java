package starPattern;
import java.util.Scanner;

/*
 * combined pyramid pattern
 *         *
 *       * * * 
 *     * * * * * 
 *   * * * * * * *
 * * * * * * * * * *
 *   * * * * * * *
 *     * * * * * 
 *       * * *
 *         *
 */

public class CombinedPyramid {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=5,x=n-1;
		for(int i=1;i<=n*2-1;i++) {
			if(i<=5) {
				for(int j=i;j<=n-1;j++) {
					System.out.print("  ");
				}
				for(int j=1;j<=2*(i-1)+1;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}else {
				for(int k=1;k<=i-5;k++) {
					System.out.print("  ");
				}
				for(int j=1;j<=2*(x-1)+1;j++) {
					System.out.print("* ");
				}
				x--;
				System.out.println();
			}
		}
		scan.close();

	}

}
