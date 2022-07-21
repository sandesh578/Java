package ioStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamsEx3 {

	public static void main(String[] args) throws IOException{
		File basePath=new File("C:\\Users\\KIIT\\Documents\\");
		File srcFile=new File(basePath,"intro.txt");
		File destFile=new File(basePath,"dest.txt");
		 
		FileInputStream fin=new FileInputStream(srcFile);
		FileOutputStream fout=new FileOutputStream(destFile);
		
		int value;
		while((value=fin.read())!=-1)
		{
			fout.write(value);
		}

		fin.close();
		fout.close();
	}

}
