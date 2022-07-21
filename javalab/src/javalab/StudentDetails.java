package javalab;

import java.util.Scanner;

class Student {
	String name;
	int roll;
	double cgpa;
	public Student()
	{
		name="";
		roll=0;
		cgpa=0.0;
	}
	public Student(String name, int roll, double cgpa) {
		this.name = name;
		this.roll = roll;
		this.cgpa = cgpa;
	}
}

public class StudentDetails {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n = scan.nextInt();
		Student stu = new Student();
		Student min = new Student();
		for (int i = 1; i <=n; i ++) {
			System.out.println("\nEnter details of student "+i+":");
			System.out.println("Enter name:");
			stu.name = scan.next();
			System.out.println("Enter roll:");
			stu.roll =scan.nextInt();
			System.out.println("Enter cgpa:");
			stu.cgpa = scan.nextDouble();
			if (min.cgpa < stu.cgpa) {
				min.cgpa = stu.cgpa;
			}
			System.out.println("\nDetail of students "+i+"is:");
			System.out.println("Name is:"+stu.name);
			System.out.println("Roll is:"+stu.roll);
			System.out.println("CGPA is:"+stu.cgpa);
			
		}
		
		System.out.println("\nMinimum cgpa is:"+min.cgpa);

		scan.close();
	}
}

