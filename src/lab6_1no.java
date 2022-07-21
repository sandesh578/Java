import java.util.Scanner;
public class lab6_1no {

	public static void main(String[] args) {
		
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter your name:");
     String name=scanner.nextLine();
     System.out.println("Enter your Roll no:");
     long roll=scanner.nextInt();
     System.out.println("Enter your Section:");
     String section=scanner.next();
     System.out.println("Enter your Branch:");
     String branch=scanner.next();
     
     System.out.println("Name is:"+name);
     System.out.println("Roll is:"+roll);
     System.out.println("Section is:"+section);
     System.out.println("Branch is:"+branch);
     scanner.close();
	}

}
