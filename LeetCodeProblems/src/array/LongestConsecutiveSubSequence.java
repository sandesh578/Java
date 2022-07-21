package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestConsecutiveSubSequence {
	
	public static int LengthOfLongestSubSequence(int []arr) {
		Arrays.sort(arr);
		int counter=0;
		int max=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]+1) {
				counter++;
			}else {
				counter=0;
			}
		}
		return counter;
	}
	
	public static String LengthOfLongestSubSeq(int []arr) {
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
		System.out.println("Length of longest consequtive subsequence: "+LengthOfLongestSubSequence(arr1));
		//System.out.println("Length of longest consequtive subsequence: "+LengthOfLongestSubSeq(arr1));
		scan.close();

	}

}
