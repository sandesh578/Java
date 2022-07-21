package array;
import java.util.Scanner;

public class NumberOfJumpsToCrossWalls {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of walls:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" height of walls:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the number of feet climbing everytime:");
		int x=scan.nextInt();
		System.out.println("Enter the number of feet slipping everytime:");
		int y=scan.nextInt();
		int jump=0;
		
		for(int i=0;i<n;i++) {
			jump+=Math.ceil((arr[i]-x)/(float)(x-y))+1;
		}
		
		System.out.println("Number of jumps required to cross walls is: "+jump);	
		scan.close();

	}

}
