import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sumTarget {
	
	public static int[] getElementsWithTargetSum(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+arr[j]==target&&j!=i) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No numbers found with target sum "+target);
	}
	
	public static int[] twoSum(int arr[],int target) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],i);
		}
		
		for(int i=0;i<arr.length;i++) {
			int complement=target-arr[i];
			if(map.containsKey(complement) &&map.get(complement)!=i) {
				return new int[] {i,map.get(complement)};
			}
		}
		
		throw new IllegalArgumentException("No numbers found with target sum "+target);
	}

	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of elements in an array:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		int index[]=new int[2];
		System.out.println("Enter the "+n+" elements to an array:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the target sum:");
		int target=scan.nextInt();
		try {
//			index=getElementsWithTargetSum(arr,target);
			index=twoSum(arr,target);
            System.out.println("Two index with target sum "+target+" are: "+index[0]+" and "+index[1]);
		}catch(Exception e) {
			System.out.println(e);
		}
		scan.close();

	}

}
