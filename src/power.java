import java.util.Scanner;
public class power {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scanner.nextInt();
		System.out.println("Enter the power:");
		int p=scanner.nextInt();
    	int power=1;
//    	int i=p;
//		while(i!=0){
//			power*=n;
//			i--;
//		}
		for(int i=p;i>0;i--)
		{
			power=power*n;
		}
       
		System.out.println("power is:"+power);
		scanner.close();

	}

}
