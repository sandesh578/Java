package day4;

import java.util.ArrayList;
import java.util.Scanner;
class ArrayLargest<T>{
	int r,c;
	T[][] arr;
	public ArrayLargest(T[][] arr,int r,int c)
	{
		this.r=r;
		this.c=c;
		this.arr=arr;
	}

	public ArrayList<T> largest()
    {
        T max=arr[0][0];
    	ArrayList<T> list=new ArrayList<T>();
    	for(int i=0;i<r;i++)
    	{
    		for(int j=0;i<c;j++)
        	{
        		if(arr[i][j]>max)
        		{
        			max=(T)arr[i][j];
        		}
        	}
    		list.add(max);
    	}
    	return list;
    }
	
}
public class Ques31 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int r=scan.nextInt();
		System.out.println("Enter the number of column:");
		int c=scan.nextInt();
		
		System.out.println("Enter the option:");
		System.out.println("1.Integer Array");
		System.out.println("2.Double Array");
		int op=scan.nextInt();
		switch(op)
		{
			case 1:
				System.out.println("Enter "+r*c+" elements into an array:");
				Integer[][] num=new Integer[r][c];
				
				for(int i=0;i<r;i++)
				{
					for(int j=0;i<c;j++)
					{
						num[i][j]=scan.nextInt();
					}
			    }
				ArrayLargest<Integer> obj1=new ArrayLargest<Integer>(num,r,c);
				System.out.println("\n"+obj1.largest());
				break;
			case 2:
				System.out.println("Enter "+r*c+" elements into an array:");
				Double[][] num1=new Double[r][c];
				
				for(int i=0;i<r;i++)
				{
					for(int j=0;i<c;j++)
					{
						num1[i][j]=scan.nextDouble();
					}
			    }
				ArrayLargest<Double> obj2=new ArrayLargest<Double>(num1,r,c);
				System.out.println("\n"+obj2.largest());
				break;
			default:
				System.out.println("Invalid choice");
		}
       scan.close();
	}

}
