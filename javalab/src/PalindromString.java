import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;   
  
public class PalindromString 
{  
	public static void main(String a[]) throws IOException   
	{  
           String strn;    
           System.out.println("Enter the string:");  
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
           strn=br.readLine();  
           String temp=strn;
           System.out.println("Result string is:");  
           char[] ch=strn.toCharArray();
           String rev="";
           for(int i=ch.length-1;i>=0;i--)
           {
             rev+=ch[i];   
           }
           if(temp.equals(rev))
           {
        	   System.out.print("palindrome");
           }      
           else 
           {
               System.out.print("not a palindrome2"); 
           }
  
        }  
}  
