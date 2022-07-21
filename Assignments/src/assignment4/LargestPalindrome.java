package assignment4;
import java.util.Scanner;

public class LargestPalindrome {
    public static boolean checkPalindrome(int n) {
    	int num=n,rev=0;
    	while(n!=0) {
    		rev=rev*10+n%10;
    		n=n/10;
    	}
    	if(num!=rev) {
    		return false;
    	}
    	return true;
    }
    
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of array:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		int largest=0;
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(checkPalindrome(arr[i])&&arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("Largest palindrome number in array is: "+largest);
		scan.close();
	}

}
