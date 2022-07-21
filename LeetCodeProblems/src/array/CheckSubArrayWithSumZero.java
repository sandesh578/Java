package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckSubArrayWithSumZero {
	
	public static String subArrayExists(int []arr) {
		int sum=0;
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			sum=0;
			for(int j=i;j<arr.length;j++) {
				if(sum==0) {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				break;
			}
			
		}
		if(flag==1) {
			return "Yes";
		}else {
			return "No";
		}
	}
	
	public static String subArrayExistsWithSumZero(int []arr) {
		int sum=0;
		int flag=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(arr[i]==0||sum==0||map.containsKey(sum)) {
				flag=1;
				break;
			}else {
				map.put(sum,1);
			}
			
		}
		if(flag==1) {
			return "Yes";
		}else {
			return "No";
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
		System.out.println("Sub Array with sum Zero exists: "+subArrayExists(arr1));
		System.out.println("Sub Array with sum Zero exists: "+subArrayExistsWithSumZero(arr1));
		scan.close();

	}

}
