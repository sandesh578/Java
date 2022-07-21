package hashing;
import java.util.Scanner;

class LinearProb{
	int arr[];
	int n=10;
	public LinearProb() {
		arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=0;
		}
	}
	
	public int hash(int key) {
		return key%10;
	}
	
	public int search(int key) {
		int index=hash(key);
		int i=0;
		while(arr[(index+i)%n]!=key) {
			i++;
		}
		return (index+i)%n;
	}
	
	public void Insert(int key) {
		int index=hash(key);
		if(arr[index]==0) {
			arr[index]=key;
		}else {
			int i=0;
			while(arr[(index+i)%n]!=0) {
				i++;
			}
			arr[(index+i)%n]=key;
		}
	}
	
	public void delete(int key) {
		int i=0,index=hash(key);
		if(arr[index]==key) {
			arr[index]=0;
		}else {
			while(arr[(index+i)%n]!=key) {
				i++;
			}
			arr[(index+i)%n]=0;
		}
	}
	
	public void Display() {
		System.out.println("Elements in the array are:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

public class LinearProbing {
  public static void main(String args[]) {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the number of elements to insert:");
	  int n=scan.nextInt();
	  LinearProb lp=new LinearProb();
	  System.out.println("Enter "+n+" elements:");
	  for(int i=0;i<n;i++) {
		  lp.Insert(scan.nextInt());
	  }
	  System.out.println("Enter the element to search:");
	  int key=scan.nextInt();
	  lp.Display();
	  System.out.println("Key found at "+lp.search(key));
	  System.out.println("Enter the element to delete:");
	  int del=scan.nextInt();
	  lp.delete(del);
	  lp.Display();
	  scan.close();
  }
}
