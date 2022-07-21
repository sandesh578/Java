import java.util.Scanner;
public class compound {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle:");
        int p=sc.nextInt();
        System.out.println("Enter time:");
        int t=sc.nextInt();
        System.out.println("Enter rate:");
        int r=sc.nextInt();
        System.out.println("Enter no of times interest is paind in year:");
        int n=sc.nextInt();
        double res=(double)(p*Math.pow((1+r/t),n*t)); 
        System.out.println("Compouund interest is:"+res);
        sc.close();
    }
}