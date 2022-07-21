import java.util.Scanner;
public class biodata {
    public static void main(String[] args)
    {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter name:");
       String name=scanner.nextLine();
       System.out.println("Enter branch:");
       String branch=scanner.nextLine();
       System.out.println("Enter rollno:");
       int roll=scanner.nextInt();
       System.out.println("Biodata:");
       System.out.println("Name:"+name);
       System.out.println("Roll No:"+roll);
       System.out.println("Branch:"+branch);
       scanner.close();
    }
}
