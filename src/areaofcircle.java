import java.util.Scanner;
public class areaofcircle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		int r=scanner.nextInt();
		double area=Math.PI*Math.pow(r, 2);
		System.out.println("Area of circle is:"+area);
		scanner.close();

	}

}
