package day3no;

import java.util.LinkedList;
import java.util.Scanner;

public class Ques3no {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number of elements you want to insert:");
			int n=scan.nextInt();
			System.out.println("Enter "+n+" elements to an LinkedList:");
			LinkedList<Integer> list=new LinkedList<>();
			for(int i=0;i<n;i++)
			{
				list.add(scan.nextInt());
			}
			System.out.println("Before Swapping:");
			System.out.println(list);
			System.out.println("\nAfter Swapping:");
			System.out.println(list);
			scan.close();

		}

	}
