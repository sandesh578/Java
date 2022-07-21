package ioStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class IOStreamsEx6 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("C:\\Users\\KIIT\\Documents\\s.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		bout.write(10);
		bout.write(20);
		
		bout.flush();
		fout.close();
		FileInputStream fin=new FileInputStream("C:\\Users\\KIIT\\Documents\\s.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		
		int a=bin.read();
		int b=bin.read();
		
		System.out.println(a);
		System.out.println(b);
		fin.close();
	}

}
