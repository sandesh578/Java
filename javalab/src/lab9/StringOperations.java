package lab9;
import java.util.Scanner;
public class StringOperations {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scan.nextLine();
		System.out.println("Enter the option:");
		System.out.print("1 Change the case of the string\n");
		System.out.print("2 Reverse the string\n");
		System.out.print("3 Compare two strings\n");
		System.out.print("4 Insert one string into another string\n");
        int op=scan.nextInt();
        switch(op)
        {
         case 1:
        	 System.out.println("Change to uppercase(u) or lowercase(l):");
        	 System.out.println("Enter u or l:");
        	 char ch=scan.next().charAt(0);
        	 if(ch=='l' || ch=='L')
        	 {
        		 System.out.println("Lowercase of "+str+" is:"+str.toLowerCase());
        	 }
        	 else if(ch=='u' || ch=='U')
        	 {
        		 System.out.println("Uppercase of "+str+" is:"+str.toUpperCase()); 
        	 }
        	 else
        	 {
        		 System.out.println("Invalid Input");
        	 }
        	 break;
         case 2:
        	 StringBuffer sb=new StringBuffer(str);
        	 sb.reverse();
        	 System.out.println("Reverse of "+str+" is:"+sb);
        	 break;
         case 3:
        	 System.out.println("Enter a string to compare:");
        	 scan.nextLine();
        	 String com=scan.nextLine();
        	 if(str.equals(com))
        	 {
        		 System.out.println("Two Strings are Equal");
        	 }
        	 else
        	 {
        		 System.out.println("Two Strings are Not Equal");
        	 }
        	 break;
         case 4:
        	 System.out.println("Enter a string to add a string:");
        	 scan.nextLine();
        	 String s=scan.nextLine();
        	 StringBuffer ob=new StringBuffer(str);
        	 ob.append(s);
        	 System.out.println("String after addition is  is:"+ob);
        	 break;
        default:
        	System.out.println("Invalid Input");

        }
        scan.close();
	}

}
