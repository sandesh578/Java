package javaDSA;
import java.util.Scanner;
public class countTotalSwapRequiredToSort {
	    public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        String str=scan.nextLine();
	        String[] str1=str.split(" ");
	        int[] array=new int[str1.length];
	        for(int i=0;i<str1.length;i++)
	        {
	            array[i]=Integer.parseInt(str1[i]);
	        }
	        int count=0;
	        for(int i=0;i<array.length-1;i++)
	        {
	            for(int j=0;j<array.length-i-1;j++)
	            {
	                if (array[j] > array[j + 1]) {
	                count++;
	                int temp = array[j];
	                array[j] = array[j + 1];
	                array[j + 1] = temp;
	             }
	            }
	        }
	        System.out.println(count);
	        scan.close();
	    }
	}

