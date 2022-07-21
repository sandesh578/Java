package ioStreams;

import java.io.File;
import java.io.IOException;
class FileUtils{
	public static void display(File[] files)
	{
		for(File file:files)
		{
			System.out.println(file.getName());
		}
			
	}
}
public class IOStreamsEx2 {

	public static void main(String[] args) throws IOException {
		File baseDir=new File("C:\\Users\\KIIT\\Documents\\");
		System.out.println("Is a directory or not:"+baseDir.isDirectory());
		
		File[] files=baseDir.listFiles();
		System.out.println("Files are:");
		FileUtils.display(files);
		
	}

}
