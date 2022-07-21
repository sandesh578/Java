package collectionFramework;

import java.util.StringTokenizer;

public class StringTokenizerImplementation {

	public static void main(String[] args) {
		String str="name=Sandesh;age=20,gender=male;branch=cse";
		
		StringTokenizer stk=new StringTokenizer(str,"=;,");
		
		String s;
		while(stk.hasMoreTokens()) {
			s=stk.nextToken();
			System.out.println(s);
		}
	}

}
