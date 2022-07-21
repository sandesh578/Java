package ioStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileExample1 {

	public static void main(String[] args) throws IOException {
		try(FileInputStream fis=new FileInputStream("C:\\Users\\KIIT\\Documents\\test1.txt");)
		{
			byte b[]=new byte[fis.available()];
			
            fis.read(b);
            
            String str=new String(b);
            
            System.out.println(str);
            
			fis.close();
		}

	}

}
