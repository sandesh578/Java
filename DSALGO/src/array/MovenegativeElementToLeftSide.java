package array;
import java.util.Scanner;

public class MovenegativeElementToLeftSide {	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		int i=0,j=arr.length-1;
		while(i<j) {
			while(arr[i]<0) {
				i++;
			}
			while(arr[j]>=0) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		
		System.out.println("Elements in the array after inertion are:");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		scan.close();

	}

}
