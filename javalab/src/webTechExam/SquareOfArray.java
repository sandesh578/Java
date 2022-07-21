package webTechExam;
import java.util.Scanner;
public class SquareOfArray {
   public static void main(String[] args)
   {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter number of data:");
	   int n=scan.nextInt();
	   int[] arr=new int[n];
	   int[] arr1=new int[n];
	   System.out.println("Enter "+n+" of data to an array:");
	   for(int i=0;i<n;i++)
	   {
		   arr[i]=scan.nextInt();
	   }
	   for(int i=0;i<n;i++)
	   {
		   arr1[i]=(int) Math.pow(arr[i],2);
	   }
	   System.out.println("Elements in array before are:");
	   for(int i=0;i<n;i++)
	   {
		   System.out.println(arr[i]);
	   }
	   System.out.println("Elements in array after square are:");
	   for(int i=0;i<n;i++)
	   {
		   System.out.println(arr1[i]);
	   }
	   scan.close();
   }
}
