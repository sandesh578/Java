import java.util.Scanner;
class largest_prodict_inArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0]*arr[1];
        for(int i=1,j=i+1;i<n-1;i++)
        {
            if((arr[i]*arr[j])>max)
            {
                max=arr[i]*arr[j];
            }
        }
        System.out.println(max);
        sc.close();
    }
}