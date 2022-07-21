package ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {

		
		FileInputStream fin=new FileInputStream("C:\\Users\\KIIT\\Documents\\src.txt");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\KIIT\\Documents\\dest.txt");
		
		
		int x;
		
		while((x=fin.read())!=-1)
		{
			if(x>=65&&x<=90)
			{
			  fout.write(x+32);
			}
			else
			{
				fout.write(x);
			}
		}
		
		fin.close();
		fout.close();
		
		FileReader fr=new FileReader("C:\\Users\\KIIT\\Documents\\dest.txt");
		int y;
		while((y=fr.read())!=-1)
		{
			System.out.print((char)y);
		}
        fr.close();
	}

}
