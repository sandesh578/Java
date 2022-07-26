package starPattern;
import java.util.Scanner;

/*
 *  v right  pyramid pattern
 * * * * * *
 * * * * *
 * * * * 
 * * *
 * *
 * * *
 * * * * 
 * * * * *
 * * * * * *
 */

public class VRightPyramid {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=5,x=n-3;
		for(int i=1;i<=n*2-1;i++) {
			if(i<=5) {
				for(int j=i;j<=n;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}else {
				for(int j=1;j<=x;j++) {
					System.out.print("* ");
				}
				x++;
				System.out.println();
			}
		}
		scan.close();
	}

}
