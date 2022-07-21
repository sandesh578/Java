package array;
import java.util.Scanner;

public class MergeTwoArrays {	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array1:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements to an array1:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the number of elements in an array2:");
		int m=scan.nextInt();
		int arr1[]=new int[m];
		System.out.println("Enter "+m+" elements to an array2:");
		for(int i=0;i<m;i++) {
			arr1[i]=scan.nextInt();
		}
		
		int arr2[]=new int[n+m];
		int k=0,i=0,j=0;
		while(i<n&&j<m) {
			if(arr[i]<arr1[j]) {
				arr2[k++]=arr[i++];
			}else {
				arr2[k++]=arr1[j++];
			}
		}
		
		for(;i<n;i++) {
			arr2[k++]=arr[i];
		}
		
		for(;j<m;j++) {
			arr2[k++]=arr1[j];
		}
		
		System.out.println("Elements in the array after merging are:");
		for(i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		scan.close();

	}

}
