import java.util.Scanner;
public class calculate_area_menu {
    public static float circle_area(int r)
    {
    	return (float)Math.PI*r*r;
    }
    public static Integer square_area(int l)
    {
    	return l*l;
    }
    public static Integer triangle_area(int b,int h)
    {
    	return (b*h)/2;
    }
	public static void main(String[] args) {
		int l,b,r,h;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1.Circle");
		System.out.println("2.Square");
		System.out.println("3.Triangle");
		System.out.println("Enter the option:");
		int opt=scanner.nextInt();
		switch(opt)
		{
		case 1:
			System.out.println("Enter Radius of circle:");
			r=scanner.nextInt();
			System.out.println("Area of circle is:"+circle_area(r));
			break;
		case 2:
			System.out.println("Enter length of square:");
			l=scanner.nextInt();
			System.out.println("Area of square is:"+square_area(l));
			break;
		case 3:
			System.out.println("Enter base and height of triangle:");
			b=scanner.nextInt();
			h=scanner.nextInt();
			System.out.println("Area of triangle is:"+triangle_area(b,h));
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		scanner.close();

	}

}
