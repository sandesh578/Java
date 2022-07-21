package array;
import java.util.Scanner;

public class InsertInASortedArray {	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array:");
		int n=scan.nextInt();
		int arr[]=new int[n+1];
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the element to insert:");
		int element=scan.nextInt();
		int i,j,flag=0;
		
		for(i=arr.length-2;i>=0;i--) {
			if(arr[i]<element) {
				for( j=arr.length-1;j>i+1;j--) {
					arr[j]=arr[j-1];
				}
				flag=1;
				break;
			}
		}
		if(flag==0) {
			for( j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=element;
		}else {
			arr[i+1]=element;
		}
		
		System.out.println("Elements in the array after inertion are:");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		scan.close();

	}

}
