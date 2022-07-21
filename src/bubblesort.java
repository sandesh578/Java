import java.util.Scanner;
class Sorting
{
	void sort(int[] num)
    {
    	int n=num.length;
    	int temp;
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
public class bubblesort {
 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of data to insert:");
		int n=scanner.nextInt();
		int[] num=new int[n];
		System.out.println("Enter the data to insert:");
		for(int i=0;i<n;i++)
		{
			num[i]=scanner.nextInt();
		}
		Sorting ob=new Sorting();
		ob.sort(num);
		ob.display(num);
		
		scanner.close();

	}

}
