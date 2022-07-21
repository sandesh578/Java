package ioStreams;

import java.io.File;
import java.io.IOException;
public class IOStreamsEx1 {

	public static void main(String[] args) throws IOException {
		File basePath=new File("C:\\Users\\KIIT\\Documents\\");
		System.out.println("Is a directory or not:"+basePath.isDirectory());
		
		File f=new File(basePath,"a.txt");
		f.createNewFile();//to create a new file name.a.txt in the basaePath directory
		System.out.println(f.getName() +"- length is:"+f.length());
		
		File f1=new File(basePath,"b.txt");
		if(f1.isFile())
		{
			System.out.println(f.getName() +" exists");	
		}
		else
		{
			System.out.println(f.getName()+" does not exits");
		}
		
	}

}
