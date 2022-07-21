import java.util.Scanner;
public class abcd_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The pattern is:");
		for(char i=65;i<69;i++)
		{
			for(char j=65;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
