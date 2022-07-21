package array;
import java.util.Scanner;

public class CheckArrayElementsArePalindromeOrNot {
	public static boolean checkPalindrome(int p) {
		int n=p;
		int rev=0;
		while(p!=0) {
			rev=rev*10+(p%10);
			p=p/10;
		}
		if(n==rev) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1,flag=0;
		System.out.println("Enter the size of one array:");
		n1=scan.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter "+n1+" elements to an array");
		for(int i=0;i<n1;i++) {
			arr1[i]=scan.nextInt();
		}
		for(int i=0;i<n1;i++) {
			if(!checkPalindrome(arr1[i])) {
				flag=1;
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("All elements in array are palindrome");
		}else {
			System.out.println("Not all elements in array are palindrome");
		}
		scan.close();

	}

}
