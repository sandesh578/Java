import java.util.Scanner;
public class swapping {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("num1="+a);
        System.out.println("num2="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping");
        System.out.println("num1="+a);
        System.out.println("num2="+b);
        scanner.close();
    }
}
