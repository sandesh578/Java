package power;
import java.util.Scanner;

public class PowerUsingRecursion {
	public static int pow(int b,int n) {
		if(n==0) {
			return 1;
		}else {
			return pow(b,n-1)*b;
		}
	}
	
    public static int power(int b,int n) {
		if(n==0) {
			return 1;
		}else if(n%2==0) {
			return power(b*b,n/2);
		}else {
			return b*power(b*b,(n-1)/2);
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the base :");
		int b=scan.nextInt();
		System.out.println("Enter the power :");
		int n=scan.nextInt();
		System.out.println("Value of "+b+"^"+n+" is "+pow(b,n));
		System.out.println("Value of "+b+"^"+n+" is "+power(b,n));
		scan.close();

	}

}
