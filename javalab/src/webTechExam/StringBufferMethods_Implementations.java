package webTechExam;
import java.util.Scanner;
public class StringBufferMethods_Implementations {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scan.nextLine();
		StringBuffer sb=new StringBuffer(str);
		sb.append("Parajuli");//adds string at the end
		System.out.println(sb);
		sb.insert(1,"Boss");//insert new string at position 1
		System.out.println(sb);
	    sb.replace(1,3,"Java");//replace character from 1 to 3
	    System.out.println(sb);
	    sb.delete(1,3);
	    System.out.println(sb);
	    sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());//returns current capacity of buffer 
		sb.ensureCapacity(30);//changes the minimum capacity
		System.out.println(sb.capacity());
		scan.close();
		

	}

}
