package ioStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
class IoUtils{
	public static void copy(OutputStream fout,InputStream fin) throws IOException
	{
		byte [] buffer=new byte[1024];
		int n;
		while((n=fin.read(buffer))>0)
		{
			fout.write(buffer,0,n);
		}
	}
}
public class IOStreamsEx4 {

	public static void main(String[] args) throws IOException{
		File basePath=new File("C:\\Users\\KIIT\\Documents\\");
		File srcFile=new File(basePath,"src.txt");
		File destFile=new File(basePath,"dest.txt");
		 
		FileInputStream fin=new FileInputStream(srcFile);
		FileOutputStream fout=new FileOutputStream(destFile);
		
		try
		{
			IoUtils.copy(fout,fin);
			System.out.println("copied....");
		}
        finally
        {
		fin.close();
		fout.close();
        }
		//OR
		/*
		 try(FileInputStream fin=new FileInputStream(srcFile);
		     FileOutputStream fout=new FileOutputStream(destFile);)//tryResource Exception Handliing
		{
			IoUtils.copy(fout,fin);
			System.out.println("copied....");
		}
		 
		 */
	}

}
