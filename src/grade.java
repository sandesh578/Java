import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the markof student:");
		int mark=scanner.nextInt();
		if(mark<100&&mark>=90)
		{
			System.out.println("Grade is: \'O\'");
		}
		else if(mark<90&&mark>=80)
		{
			System.out.println("Grade is: \'E\'");
		}
		else if(mark<80&&mark>=70)
		{
			System.out.println("Grade is: \'A\'");
		}
		else if(mark<60&&mark>=70)
		{
			System.out.println("Grade is: \'B\'");
		}
		else if(mark<60&&mark>=50)
		{
			System.out.println("Grade is: \'C\'");
		}
		else
		{
			System.out.println("Grade is: \'D\'");
		}
		scanner.close();

	}

}
