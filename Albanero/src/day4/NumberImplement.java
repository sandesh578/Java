package day4;

import java.util.Scanner;
class Number{
	int arr[];
	int n;
	Scanner scan=new Scanner(System.in);
	public Number()
	{
		System.out.println("Enter the size of array:");
        n=scan.nextInt();arr=new int[n];
		System.out.println("Enter "+n+" into array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
	}
	public void swap()
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=i;
			}
			if(arr[i]<min)
			{
				min=i;
			}
		}
		int temp=arr[max];
		arr[max]=arr[min];
		arr[min]=temp;
	}
	public void display()
	{
		System.out.println("Elements after swapping:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
public class NumberImplement {

	public static void main(String[] args) {
		Number num=new Number();
		num.swap();
		num.display();


	}

}
