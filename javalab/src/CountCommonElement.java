import java.util.Scanner;

public class CountCommonElement {
    public static int CommonCount(int arr1[],int n1,int arr2[],int n2)
    {
    	int count=0;
    	for(int i=0;i<n1;i++)
    	{
    		for(int j=0;j<n2;j++)
    		{
    			if(arr1[i]==arr2[j])
    			{
    				count++;
    			}
    		}
    	}
    	return count;
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]= {3,2,11,4,15,1};
		int arr1[]= {8,1,7,12,5,6};
		System.out.println(CommonCount(arr,6,arr1,6));
		scan.close();

	}

}
