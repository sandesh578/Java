package fibonacciSeries;
import java.util.Scanner;

public class fibonacciSeries {
	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}else {
			return fibo(n-2)+fibo(n-1);
		}
	}
	
	public static int f[]=new int[10];
	public static int fib(int n) {
		if(n<=1) {
			f[n]=n;
			return n;
		}else {
			if(f[n-2]==-1) {
				f[n-2]=fib(n-2);
			}
			if(f[n-1]==-1) {
				f[n-1]=fib(n-1);
			}
			return f[n-2]+f[n-1];
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the position of fibonacci element:");
		int n=scan.nextInt();
		for(int i=0;i<f.length;i++) {
			f[i]=-1;
		}
		System.out.println(n+"th fibonacci element is: "+fibo(n));
		System.out.println(n+"th fibonacci element is: "+fib(n));
		scan.close();

	}

}
