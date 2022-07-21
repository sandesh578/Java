package webTechExam;
import java.util.Scanner;
public class Complex {
	    int real;
	    int imag;
		public Complex(int a,int b) {
			this.real=a;
			this.imag=b;
		}
	public static Complex sum(Complex c1, Complex c2)
	{
		Complex temp=new Complex(0,0);
		temp.real=c1.real+c2.real;
		temp.imag=c1.imag+c2.imag;
		return temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real and imaginary value of complex Number1:");
        int r1=sc.nextInt();
        int i1=sc.nextInt();
        System.out.println("Enter the real and imaginary value of complex Number2:");
        int r2=sc.nextInt();
        int i2=sc.nextInt();
        Complex obj=new Complex(r1,i1);
        Complex obj1=new Complex(r2,i2);
        Complex temp=sum(obj,obj1);
        System.out.println("Sum is:"+temp.real+"+"+temp.imag+"i");
        sc.close();
	}


}
