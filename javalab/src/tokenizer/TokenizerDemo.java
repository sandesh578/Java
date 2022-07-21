package tokenizer;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenizerDemo {

	public static void main(String[] args) throws Exception {
		//in file if we want to use forward slash we should use once and if wwe want backward slash we should use twice
		
		/*FileInputStream fs=new FileInputStream("C:\\Users\\KIIT\\Documents\\MyData.txt");
		byte b[]=new byte[fs.available()];
		String data=new String(b);
		fs.read(b);*/
		
		String data="name=Sandesh\naddress=Kathmandu;country=Nepal;dept=cse Done";
		
		StringTokenizer stk=new StringTokenizer(data,"=;");//incase of \n we should not declare it as delimeter
        String s;
        
        ArrayList<Integer> al=new ArrayList<>();
        
        while(stk.hasMoreTokens())
        {
        	s=stk.nextToken();
        	al.add(Integer.valueOf(s));
        }
        System.out.println(al);
	}

}
