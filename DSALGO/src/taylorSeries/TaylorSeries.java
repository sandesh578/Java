package taylorSeries;
import java.util.Scanner;

public class TaylorSeries {
	public static int p=1,f=1;
	public static int s=1;
	public static int e(int x,int n) {
		if(n==0) {
			return 1;
		}else {
			p=p*x;
			f=f*n;
			return e(x,n-1)+p/f;
		}

	}
	
	public static int e1(int x,int n) {
		if(n==1) {
			return s;
		}else {
			s=1+(x/n)*s;
			return e(x,n-1);
		}
	}
	
	public static int e2(int x,int n) {
		int s=1;
		for(;n>0;n--) {
			s=1+(x/n)*s;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x=scan.nextInt();
		System.out.println("Enter value of n:");
		int n=scan.nextInt();
		System.out.println("Taylor series value when n = "+n+" and x = "+x+" is "+e(x,n));
		System.out.println("Taylor series value when n = "+n+" and x = "+x+" is "+e1(x,n));
		System.out.println("Taylor series value when n = "+n+" and x = "+x+" is "+e2(x,n));
		scan.close();

	}

}
