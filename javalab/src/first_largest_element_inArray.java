import java.util.Scanner;
class first_largest_element_inArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
              System.out.println(i);  
              count=count+1;
            }
            if(count==1)
            {
                break;
            }
        }
      sc.close();
    }
}