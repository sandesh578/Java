package bitsManipulation;
import java.util.Scanner;

public class FindRightMostBit {
   public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter a number whose right most bit is to be calculated:");
	   int n=scan.nextInt();
	   int BitMask=1;
	   int counter=0,flag=0;
	   while(n!=0) {
		   if((BitMask & n)==1) {
			   //n=4 //4->100
			   //1 bit is present at position 2 from right
			   //n=8 //8-> 1000
			   // 1 bit/first set bit is present at position 3
			   flag=1;
			   System.out.println("First right most Set bit is at position "+ counter);
			   break;
		   }
		   n=n>>1;
		   counter++;
	   }
	   if(flag==0) {
		   System.out.println("Set bit not found ");
	   }
	   scan.close();
   }
}
