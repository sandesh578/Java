package starPattern;
import java.util.Scanner;

/*
 *  v left  pyramid pattern
 * * * * * *
 *   * * * *
 *     * * * 
 *       * *
 *         *
 *       * *
 *     * * * 
 *   * * * *
 * * * * * *
 */

public class VLeftPyramid {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=5,x=n-3,p=n-2;
		for(int i=1;i<=n*2-1;i++) {
			if(i<=5) {
				for(int k=1;k<=i-1;k++) {
					System.out.print("  ");
				}
				for(int j=i;j<=n;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}else {
				for(int k=1;k<=p;k++) {
					System.out.print("  ");
				}
				for(int j=1;j<=x;j++) {
					System.out.print("* ");
				}
				x++;
				p--;
				System.out.println();
			}
		}
		scan.close();
	}

}
