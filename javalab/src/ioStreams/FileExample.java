package ioStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args)  {
		try 
		{
			FileOutputStream fos=new FileOutputStream("C:\\Users\\KIIT\\Documents\\test1.txt");
			String str="I am learning java programming";
			byte b[]=str.getBytes();
			
			fos.write(b,6,str.length()-6);//prints all characters after index 6
			//fos.write(b);
			//fos.write(str.getBytes());
			/*for(byte x:b)
			{
				fos.write(x);
			}*/
			fos.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
