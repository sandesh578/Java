package ioStreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayStreamsEx {

	public static void main(String[] args) throws IOException {
		byte b[]= {'a','b','c','d','e','f','g','h','i'};
		
		ByteArrayInputStream bis=new ByteArrayInputStream(b);
		
//		String str=new String(bis.readAllBytes());
//		System.out.println(str);
//		System.out.println(bis.markSupported());
		
		int x;
		while((x=bis.read())!=-1)
		{
			System.out.print((char)x);
		}
        bis.close();
	}

}
