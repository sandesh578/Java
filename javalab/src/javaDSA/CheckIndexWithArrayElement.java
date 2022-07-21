package javaDSA;

//import java.util.Arrays;
import java.util.Scanner;
public class CheckIndexWithArrayElement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //int n=scan.nextInt();
        String str=scan.nextLine();
        String[] st=str.split(" ");
        int arr[]=new int[st.length];
        for(int i=0;i<st.length;i++)
        {
        	arr[i]=Integer.parseInt(st[i]);
        }
        //final int[] arr= Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int x=0;    
        for(int i=0;i<st.length;i++)
        {
            if(arr[i]==i)
            {
                x=1;
                System.out.println("true");
            }
        }
        if(x==0)
        {
            System.out.println("false");
        }
        scan.close();
    }
}
