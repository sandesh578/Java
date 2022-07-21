package array;
import java.util.Arrays;
import java.util.Scanner;

public class MedianOfAnArray {
	public static void MedianOfArray(int arr1[]) {
		Arrays.sort(arr1);
		
		int length=arr1.length;
		if(length%2!=0) {
			System.out.println("Median of sorted array is: "+arr1[(int)(Math.floor(length/2))]);
		}else {
			System.out.println("Median of sorted array is: "+(arr1[(length/2)]+arr1[(length/2)+1])/2);
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1;
		System.out.println("Enter the size of one array:");
		n1=scan.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter "+n1+" elements to an array");
		for(int i=0;i<n1;i++) {
			arr1[i]=scan.nextInt();
		}
		MedianOfArray(arr1);
		scan.close();

	}

}
