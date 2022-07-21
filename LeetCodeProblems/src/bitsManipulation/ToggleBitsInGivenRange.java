package bitsManipulation;

import java.util.Scanner;

public class ToggleBitsInGivenRange {

	public static void main(String[] args) {
		   Scanner scan=new Scanner(System.in);
		   System.out.println("Enter a number :");
		   int n=scan.nextInt();
		   System.out.println("Enter a  start position to toggle bit:");
		   int start=scan.nextInt();
		   System.out.println("Enter a  ending position to toggle bit:");
		   int end=scan.nextInt();
		   int BitMask=1<<end;//pos starts from 0
		   
		   if((BitMask & n)!=0) {
			   System.out.println("Bit is one");
		   }else {
			   System.out.println("Bit is zero");
		   }
	}

}
