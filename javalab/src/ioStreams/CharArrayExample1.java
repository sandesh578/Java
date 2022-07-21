package ioStreams;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayExample1 {

	public static void main(String[] args) throws IOException {
		
		CharArrayWriter cw=new CharArrayWriter(20);
		
		 cw.write('a');
	     cw.write('b');
	     cw.write('c');
	     cw.write('d');
	     cw.write('e');
			
	     char b[]=cw.toCharArray();
	     for(int x:b)
		 {
			System.out.print((char)x);
		 }
        cw.close();
	}

}
