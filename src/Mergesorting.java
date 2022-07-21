import java.util.Scanner;
class Mergesort
{
	public void sorting(int[] num,int first,int last)
    {
    	int n=num.length;
    	int temp;
        int mid=(first+last)/2;
    	for(int i=0;i<n-1;i++)
		{
    		for(int j=i+1;i<n-i-1;j++)
    		{
    			if(num[j]>num[j+1])
    			{
    				temp=num[j];
    				num[j]=num[j+1];
    				num[j+1]=temp;
    			}
    		}
		}
    	
    }
	public void display(int[] num)
	{
		int n=num.length;
		System.out.println("After sorting:");
    	for(int i=0;i<n;i++)
		{
			System.out.println(num[i]);
		}
	}
}
public class Mergesorting {
 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of data to insert:");
		int n=scanner.nextInt();
		int[] num=new int[n];
		int first=0;
		int last=n-1;
		System.out.println("Enter the data to insert:");
		for(int i=0;i<n;i++)
		{
			num[i]=scanner.nextInt();
		}
		Mergesort ob=new Mergesort();
		ob.sorting(num,first,last);
		ob.display(num);
		
		scanner.close();

	}

}
