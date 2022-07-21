import java.util.Scanner;
class switch_area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,r,s,area;
        System.out.println("Enter either rectangle,circle or triangle:");
        String ch=sc.next();
        switch(ch)
        {
            case "triangle":
            a=sc.nextDouble();
            b=sc.nextDouble();
            c=sc.nextDouble();
            s=(a+b+c)/2;
            area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of triangle:"+area);
            break;
            case "rectangle":
            a=sc.nextDouble();
            b=sc.nextDouble();
            System.out.println("Area of rectangle:"+(a*b));
            break;
            case "circle":
            r=sc.nextDouble();
            System.out.println("Area of circle:"+(3.14*r*r));
            break;
            default:
            System.out.println("Invalid");
            
        }
        sc.close();
    }
}
