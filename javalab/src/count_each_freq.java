import java.util.Scanner;
class count_each_freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to an array:");
        int n=sc.nextInt();
        int arr[] = new int[n];
       
        System.out.println("Enter "+n+" numbers in an array.");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Numbers in an array are:");
        for(int i=0;i<n;i++) 
        {
            System.out.println(arr[i]);
        }

        int[] checked = new int[n];
        for(int i=0;i<n;i++)
        {
            checked[i]=0;
        }
       
        for(int i=0;i<n;i++)
        {
            int Count = 1;
            if(checked[i]==1)
            {
            	continue;
            }
            for(int j=i+1;j<n;j++)
            {
                if (arr[i] == arr[j])
                {
                    checked[j]=1;
                    Count++;
                }
            }
            System.out.println("Frequency of "+arr[i]+" is "+Count);
        }
    }
}