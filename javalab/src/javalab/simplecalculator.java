package javalab;
import java.util.Scanner;
public class simplecalculator {
    public static void addition(int n1,int n2)
    {
    	System.out.println("Sum of "+n1+" and "+n2+" is:"+(+(n1+n2)));
    }
    public static void substraction(int n1,int n2)
    {
    	System.out.println("Difference of "+n1+" and "+n2+" is:"+(+(n1-n2)));
    }
    public static void division(int n1,int n2)
    {
    	System.out.println("Divison of "+n1+" by "+n2+" is:"+(+(n1/n2)));
    }
    public static void multiplication(int n1,int n2)
    {
    	System.out.println("Product of "+n1+" and "+n2+" is:"+(+(n1*n2)));
    }
    public static void remainder(int n1,int n2)
    {
    	System.out.println("Remainder of "+n1+" divided by "+n2+" is:"+(+(n1%n2)));
    }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the option:");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Division");
		System.out.println("4.Multiplication");
		System.out.println("5.Modulodivision");
		System.out.println("Enter the option:");
		int choice=scanner.nextInt();
		System.out.println("Enter two numbers:");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
    	switch(choice)
		{
		  case 1:
			  addition(num1,num2);
			  break;
		  case 2:
				substraction(num1,num2);
				break;
		  case 3:
				division(num1,num2);
				break;
		  case 4:
				multiplication(num1,num2);
				break;
		  case 5:
				remainder(num1,num2);
				break;
		  default:
				System.out.println("Invalid input");
		}
		scanner.close();
	}

}
