package day4;

import java.util.Scanner;

public class CharacterArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    char arr1[]= {'a','c','h','x','t','a','m'};
	    char arr2[]= {'s','v','t','m','d','r','k','t'};	
	    
	    char[] arr3=new char[arr1.length+arr2.length];
	    for(int i=0;i<arr1.length+arr2.length;i++)
	    {
	    	arr3[i]=arr1[i];
	    	arr3[arr1.length-1]=arr2[i];
	    }
	    
	    for(int i=0;i<(arr1.length+arr2.length);i++)
	    {
	    	System.out.print(arr3[i]);
	    }
        scan.close();
	}

}
