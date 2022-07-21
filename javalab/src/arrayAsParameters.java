import java.util.Scanner;
public class arrayAsParameters {
    public static void printNumbers(int... num)
    {
    	System.out.println("Length of an array is:"+num.length);
    	System.out.println("Elements in array are:");
    	for(int i=0;i<num.length;i++)
    	{
    		System.out.println(num[i]);
    	}
    }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		printNumbers(1,2,3,4,5,6);
		scanner.close();

	}

}
