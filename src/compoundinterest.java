import java.util.Scanner;

public class compoundinterest {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter principle:");
        int p=scanner.nextInt();
        System.out.println("Enter rate:");
        int r=scanner.nextInt();
        System.out.println("Enter number of times interest is paid:");
        int n=scanner.nextInt();
        System.out.println("Enter time:");
        int t=scanner.nextInt();
        double amount=p*Math.pow(1+(r/n),n*t);
        System.out.println("Compound amount is:"+amount);
        scanner.close();

    }
}

