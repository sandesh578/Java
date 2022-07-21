import java.util.Scanner;
public class countdigits_innumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scanner.nextInt();
		int count=0;
		int num=n;
	    while(n!=0)
	    {
	    	count=count+1;
	    	n=n/10;
	    }
	    System.out.println(num+" has "+count+" digits");
		scanner.close();

	}

}
