package ioStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileExample2 {

	public static void main(String[] args) throws IOException {
		try(FileInputStream fis=new FileInputStream("C:\\Users\\KIIT\\Documents\\test1.txt");)
		{
			int x;
			
			while((x=fis.read())!=-1)
			{
				System.out.print((char)x);
			}
			/*do
			{
				x=fis.read();
				if(x!=-1)
				{
				  System.out.print((char)x);
				}
			}while(x!=-1);*/
            
			fis.close();
		}

	}

}
