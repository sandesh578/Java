import java.util.Scanner;
public class findoccuranceofanumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of data:");
		int n=scanner.nextInt();
		int[] num=new int[n];
		int count=0;
		System.out.println("Enter the number to array:");
        for(int i=0;i<n;i++)
        {
        	num[i]=scanner.nextInt();	
        }
        System.out.println("Enter the item to count:");
        int search=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
        	if(num[i]==search)
        	{
        		count+=1;
        	}
        }
        System.out.println(search+" is repeated "+count+" times");
		scanner.close();

	}

}
