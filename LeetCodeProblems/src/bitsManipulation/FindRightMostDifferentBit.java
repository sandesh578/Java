package bitsManipulation;
import java.util.Scanner;

public class FindRightMostDifferentBit {
   public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter a number  :");
	   int n1=scan.nextInt();
	   System.out.println("Enter another number :");
	   int n2=scan.nextInt();
	   int BitMask=1,a=n1,b=n2;
	   int counter=0,flag=0;
	   while(n1!=0||n2!=0) {
		   if((BitMask & n1)!=(BitMask&n2)) {
			   //n=10 -> 1010
			   //n=14 -> 1110
			   // first different set bit is present at position 3
			   flag=1;
			   System.out.println("First right most Different Set bit is at position "+ counter);
			   break;
		   }
		   n1=n1>>1;
		   n2=n2>>1;
		   counter++;
	   }
	   if(flag==0) {
		   System.out.println("Different Set bit not found ");
	   }
	   
	   //OR
	   counter=0;
	   int Mask=1;
	   while((Mask & a)==(Mask&b)) {
		   Mask=Mask<<1;
		   flag=1;
		   counter++;
	   }
		   System.out.println("First right most Different Set bit is at position "+ counter);
	   scan.close();
   }
}
