package practice;

import java.util.Scanner;
public class StringBufferImplementations {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scan.next();
		
		StringBuffer sb=new StringBuffer(str);
		while(true)
		{
			System.out.println("Enter the option:");
			System.out.println("1.EnsureCapacity");
			System.out.println("2.Replace");
			System.out.println("3.Delete");
			System.out.println("4.Insert");
			System.out.println("5.Reverse");
			System.out.println("6.Exit");
			int op=scan.nextInt();
		switch(op)
		{
		case 1:
			System.out.println("Enter the capacity of StringBuffer:");
			int cap=scan.nextInt();
			sb.ensureCapacity(cap);
			System.out.println("Capacity of stringBuffer class is:"+sb.capacity());
			break;
		case 2:
			System.out.println("Enter the string to replace with:");
			String strx=scan.next();
			sb.replace(1,3,strx);
			
			System.out.println("After replacement String is:"+sb);
			break;
		case 3:
			System.out.println("Enter the start and end position to delete:");
			int start=scan.nextInt();
			int end=scan.nextInt();
			sb.delete(start,end);
			
			System.out.println("After deletion of substring String is:"+sb);
			break;
		case 4:
			System.out.println("Enter the string to iinsert:");
			String inStr=scan.next();
			System.out.println("Enter the position to insert:");
			int pos=scan.nextInt();
			sb.insert(pos,inStr);
			
			System.out.println("After insertion String is:"+sb);
			break;
		case 5:
			sb.reverse();
			
			System.out.println("After reversal String is:"+sb);
			break;
		case 6:
			System.exit(1);
			break;
		default:
			System.out.println("Invalid choice");
		}
		scan.close();
	}

	}

}
