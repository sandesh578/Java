import java.util.Scanner;
public class factorial {
    public static int fact(int num)
    {
       if(num==0)
       {
    	   return 1;
       }
       else
       {
    	   return num*fact(num-1);
       }
    }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scanner.nextInt();
		int res=fact(num);
		System.out.printf("Factorial of %d is %d",num,res);
        scanner.close();
	}

}
