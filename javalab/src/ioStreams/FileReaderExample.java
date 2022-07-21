package ioStreams;


import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		try(FileReader fr=new FileReader("C:\\Users\\KIIT\\Documents\\test2.txt");)
		{
			int x;
			
			while((x=fr.read())!=-1)
			{
				System.out.print((char)x);
			}
			
            
			fr.close();
		}

	}

}
