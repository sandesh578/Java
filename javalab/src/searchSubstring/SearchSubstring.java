package searchSubstring;

import java.util.Scanner;
public class SearchSubstring {
	public static boolean containsPattern(String text, String pattern) {
	    if (text.length() < pattern.length()) {
	        return false;
	    }

	    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
	        boolean patternIsFound = true;

	        for (int j = 0; j < pattern.length(); j++) {
	            if (text.charAt(i + j) != pattern.charAt(j)) {
	                patternIsFound = false;
	                break;
	            }
	        }
	        
	        if (patternIsFound) {
	            return true;
	        }
	    }
	    
	    return false;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scan.nextLine();
		System.out.println("Enter a Substring to Search:");
		String sub=scan.nextLine();
		
		if(containsPattern(str,sub))
		{
		   System.out.println(sub+" is present in "+str);
		}
		else
		{
			System.out.println(sub+" is not present in "+str);
		}
		scan.close();
	}

}
