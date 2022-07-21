package ioStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException{
		
		FileReader fis=new FileReader("C:\\Users\\KIIT\\Documents\\dest.txt");
		BufferedReader bis=new BufferedReader(fis);
				

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
		
		System.out.println(bis.readLine());
		
		bis.close();
	}

}
