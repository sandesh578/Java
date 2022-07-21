import java.util.Scanner;
public class find_num_from_hcf_lcm {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter hcf of a number:");
		int hcf=scanner.nextInt();
		System.out.println("Enter lcm of a number:");
		int lcm=scanner.nextInt();
		int x,y,a,b;
		x=hcf*a;
		y=hcf*b;
		int rem=lcm/hcf;
		
		scanner.close();
	}

}
