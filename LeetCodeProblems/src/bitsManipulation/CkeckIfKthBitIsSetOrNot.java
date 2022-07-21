package bitsManipulation;

import java.util.Scanner;

public class CkeckIfKthBitIsSetOrNot {

	public static void main(String[] args) {
		   Scanner scan=new Scanner(System.in);
		   System.out.println("Enter a number :");
		   int n=scan.nextInt();
		   System.out.println("Enter a position to check for set bit:");
		   int pos=scan.nextInt();
		   int BitMask=1<<pos;//pos starts from 0
		   
		   if((BitMask & n)!=0) {
			   System.out.println("Bit is one");
		   }else {
			   System.out.println("Bit is zero");
		   }

	}

}
