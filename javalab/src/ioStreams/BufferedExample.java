package ioStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedExample {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis=new FileInputStream("C:\\Users\\KIIT\\Documents\\dest.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		/*int x;
		while((x=bis.read())!=-1)
		{
			System.out.print((char)x);
		}*/
		
//		System.out.println("File :"+fis.markSupported());
//		System.out.println("Buffer :"+bis.markSupported());
		
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.mark(10);
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.reset();
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.close();
	}

}
