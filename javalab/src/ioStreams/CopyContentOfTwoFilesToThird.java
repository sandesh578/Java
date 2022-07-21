package ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.SequenceInputStream;

public class CopyContentOfTwoFilesToThird {

	public static void main(String[] args) throws IOException {

		
		FileInputStream fin1=new FileInputStream("C:\\Users\\KIIT\\Documents\\src.txt");
		FileInputStream fin2=new FileInputStream("C:\\Users\\KIIT\\Documents\\dest.txt");
		
		FileOutputStream fout=new FileOutputStream("C:\\Users\\KIIT\\Documents\\dest1.txt");
		
		SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
		
		int x;
		
		while((x=sis.read())!=-1)
		{
			fout.write(x);
		}
		
		fin1.close();
		fin2.close();
		fout.close();
		sis.close();

		
		FileReader fr=new FileReader("C:\\Users\\KIIT\\Documents\\dest1.txt");
		int y;
		while((y=fr.read())!=-1)
		{
			System.out.print((char)y);
		}
        fr.close();
	}

}
