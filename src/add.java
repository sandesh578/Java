import java.util.*;
public class add {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int sum=a+b;
        System.out.println("Sum="+sum);
        scanner.close();
    }
}
