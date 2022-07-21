package combination;

import java.util.Scanner;

public class Combination {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*fact(n-1);
		}
	}
	
	public static int C(int n,int r) {
		int t1,t2,t3;
		t1=fact(n);
		t2=fact(r);
		t3=fact(n-r);
		return (int)t1/(t2*t3);
	}
	
	//using pascal triangle
	public static int C1(int n,int r) {
		if(r==0||n==r) {
			return 1;
		}else {
			return C1(n-1,r-1)+C1(n-1,r);
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n=scan.nextInt();
		System.out.println("Enter the value of r :");
		int r=scan.nextInt();
		System.out.println("Combination of "+n+"C"+r+" is: "+C(n,r));
		System.out.println("Combination of "+n+"C"+r+" is: "+C1(n,r));
		scan.close();

	}

}
