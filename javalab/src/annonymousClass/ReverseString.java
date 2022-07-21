package annonymousClass;

import java.util.Scanner;

interface StringReverser {
    
    String reverse(String str);
}

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser reverser = new StringReverser()
        {
            @Override
            public String reverse(String str){
//                StringBuilder sb=new StringBuilder(str);
//                sb.reverse();
//                return sb.toString();
            	String rev="";
            	for(int i=str.length()-1;i>=0;i--)
            	{
            		rev+=str.charAt(i);
            	}
            	return rev;
            }
        };

        System.out.println(reverser.reverse(line));
        scanner.close();
    }

    interface StringReverser {

        String reverse(String str);
    }

}
