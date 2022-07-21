import java.util.Scanner;
public class Count_each_Element {
    public static void main(String [] args)
    {
        int i,j,count;
        System.out.println("Enter the elements:");
        Scanner sc=new Scanner(System.in);
        int a[]=new int[20];
        int freq[]=new int[20];
        for(i=0;i<5;i++)
        {
        a[i]=sc.nextInt();
        freq[i]=-1;
        }
        for(i=0;i<5;i++)
        {
            count=1;
            for(j=i+1;j<5;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    freq[j]=0;
                }
            }
            if(freq[i]!=0)
            {
                freq[i]=count;
            }
        }
        System.out.println("Frequency of each element are:");
        for(i=0;i<5;i++)
        {
            if(freq[i]!=0)
            {
                System.out.println(a[i]+"  is repeated "+freq[i]+" times");
            }
        }
    }
}