
import java.util.*;
public class areaoftriangle {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three sides of triangle:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        double s=(a+b+c)/2;
        double area=(double)(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        System.out.println("Area of triangle is:"+area);
        scanner.close();
    }
}
