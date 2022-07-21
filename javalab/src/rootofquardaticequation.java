import java.util.*;
public class rootofquardaticequation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter value of a:");
		a=scanner.nextInt();
		System.out.println("Enter value of b:");
		b=scanner.nextInt();
		System.out.println("Enter value of c:");
		c=scanner.nextInt();
		double d=((b*b)-(4*a*c));
		double r1,r2;
		r1=(double)((-b-Math.sqrt(d))/(2*a));
		r2=(double)((-b+Math.sqrt(d))/(2*a));
		if(b*b>4*a*c)
		{
			System.out.println("Roots are real and different");
			System.out.println("Two roots are:\nRoot1:"+r1+"\nRoot2:"+r2);
		}
		else if(b*b<4*a*c)
		{
			System.out.println("Roots are imaginary");
			System.out.println("Two roots are:\nRoot1:"+r1+"\nRoot2:"+r2);
		}
		else
		{
			System.out.println("Roots are real  and equal");
			System.out.println("Two roots are:\nRoot1:"+r1+"\nRoot2:"+r2);
		}
		scanner.close();

	}

}
