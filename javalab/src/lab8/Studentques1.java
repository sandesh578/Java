package lab8;
import java.util.Scanner;
abstract class Student{
	int roll_no;
	int reg_no;
	abstract public void course();
}
class Kittian extends Student{
	String course;
	public Kittian(int roll_no,int reg_no,String course)
	{
		this.roll_no=roll_no;
		this.reg_no=reg_no;
		this.course=course;
	}
	public void course()
	{
		System.out.println("Roll No is:"+roll_no);
		System.out.println("Registration No is:"+reg_no);
		System.out.println("Course Enrolled is:"+course);
	}
}
public class Studentques1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter course name,roll no and reg no:");
        String course=scan.nextLine();
        int roll=scan.nextInt();
        int reg=scan.nextInt();
        Kittian k=new Kittian(roll,reg,course);
        k.course();
        scan.close();
	}

}
