package calculator;
import java.util.Scanner;

import input.Input;
import operation.MathematicalOperation;
import output.Output;
public class CalculatorMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Input i=new Input();
		int a=i.inputNum1();
		int b=i.inputNum2();
		Output o=new Output();
		MathematicalOperation m=new MathematicalOperation();
		
		System.out.println("Enter a operation:");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int c=scan.nextInt();
		switch(c)
		{
		 case 1:
			 o.output(a,b,m.add(a,b),'+');
			 break;
		 case 2:
			 o.output(a,b,m.sub(a,b),'-');
			 break;
		 case 3:
			 o.output(a,b,m.multiply(a,b),'*');
			 break;
		 case 4:
			 o.output(a,b,m.divide(a,b),'/');
			 break;
		default:
			System.out.println("Invalid Input");
		}
		scan.close();

	}

}
